package com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Repository;

import com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

