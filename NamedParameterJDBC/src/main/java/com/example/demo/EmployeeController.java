package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	private final EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    // ✅ GET ALL
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeDao.getAllEmployees();
    }

    // ✅ GET BY ID
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeDao.getEmployeeById(id);
    }

    // ✅ INSERT
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee emp) {
        employeeDao.addEmployee(emp);
        return "Employee Added Successfully";
    }

}
