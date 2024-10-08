package com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Repository;

import com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
