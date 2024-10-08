package com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Controller;

import com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Model.Department;
import com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Model.Student;
import com.atuluttam.SpringBootJPAOnetoManyMappingUniDirectional.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Add a new department
    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    // Add students to a department
    @PostMapping("/{departmentId}/students")
    public Department addStudentsToDepartment(@PathVariable Long departmentId, @RequestBody Set<Student> students) {
        return departmentService.addStudentsToDepartment(departmentId, students);
    }

    // Get all students in a department by departmentId
    @GetMapping("/{departmentId}/students")
    public Set<Student> getAllStudentsByDepartmentId(@PathVariable Long departmentId) {
        return departmentService.getAllStudentsByDepartmentId(departmentId);
    }

    // Get all departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    // Get a department by ID
    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    // Delete a department by ID
    @DeleteMapping("/{departmentId}")
    public String deleteDepartment(@PathVariable Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "Department deleted with ID: " + departmentId;
    }
}
//
//Add a Department:
//Endpoint: POST /api/departments
//{
//  "dname": "Computer Science"
//}

//Add Students to a Department:
//Endpoint: POST /api/departments/{departmentId}/students
//[
//        {
//        "name": "John Doe"
//        },
//        {
//        "name": "Jane Doe"
//        }
//]
//
//Get All Students in a Department:
//
//Endpoint: GET /api/departments/{departmentId}/students
//Get All Departments:
//
//Endpoint: GET /api/departments
//Get Department by ID:
//
//Endpoint: GET /api/departments/{departmentId}
//Delete a Department:
//
//Endpoint: DELETE /api/departments/{departmentId}