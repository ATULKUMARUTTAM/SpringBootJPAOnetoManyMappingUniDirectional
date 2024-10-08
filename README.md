Sample Endpoints:
Add a Department:

Endpoint: POST /api/departments
Body (JSON):


{
  "Dname": "Computer Science"
}
Add Students to a Department:

Endpoint: POST /api/departments/{departmentId}/students
Body (JSON):


[
  {
    "name": "John Doe"
  },
  {
    "name": "Jane Doe"
  }
]
Get All Students in a Department:

Endpoint: GET /api/departments/{departmentId}/students
Get All Departments:

Endpoint: GET /api/departments
Get Department by ID:

Endpoint: GET /api/departments/{departmentId}
Delete a Department:

Endpoint: DELETE /api/departments/{departmentId}

In this project, we have a unidirectional One-to-Many relationship between Department and Student. 
The controller provides methods to create departments, add students to departments, and fetch all students within a department. 
This also demonstrates how to use basic CRUD operations in a Spring Boot application with JPA.


