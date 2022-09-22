package com.n9.service;

import com.n9.dto.EmpDTO;
import com.n9.entity.EmpEntity;
import com.n9.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public List<EmpDTO> getAllEmps() {
        Iterable<EmpEntity> empItr = empRepository.findAll();
        List<EmpDTO> empList = new ArrayList<EmpDTO>();
        for (EmpEntity emp : empItr) {
            EmpDTO empDTO = new EmpDTO(emp.getId(), emp.getName());
            empList.add(empDTO);
        }

        return empList;
    }
}
