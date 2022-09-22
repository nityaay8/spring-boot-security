package com.n9.repository;

import com.n9.entity.EmpEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<EmpEntity, Long> {

}
