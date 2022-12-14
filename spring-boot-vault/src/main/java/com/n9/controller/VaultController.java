package com.n9.controller;

import com.n9.Credentials;
import com.n9.config.UserConfiguration;
import com.n9.dto.EmpDTO;
import com.n9.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vault")
public class VaultController {

    @Autowired
    private UserConfiguration userConfiguration;

    @Autowired
    private EmpService empService;


    @GetMapping("get")
    public ResponseEntity save() {

        Credentials credentials = new Credentials();
        credentials.setPassword(userConfiguration.getPassword());
        credentials.setUsername(userConfiguration.getUsername());
        return ResponseEntity.ok().body(credentials);
    }

    @GetMapping("emps")
    public ResponseEntity allEmps() {
        List<EmpDTO> empList = empService.getAllEmps();
        return ResponseEntity.ok(empList);
    }
}
