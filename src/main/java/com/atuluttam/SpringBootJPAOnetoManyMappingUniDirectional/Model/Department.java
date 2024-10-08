package com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long DId;
    private String Dname;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "Dept_Id", referencedColumnName = "DId")
    private Set<Student> students = new HashSet<>();
    // Uni-directional One to Many mapping ->
    // One Department can have Many Students
    // Here, extra column 'Dept_id' will be created
    // on the many side of the relationship i.e. in the Student table
}
