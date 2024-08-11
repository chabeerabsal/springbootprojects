package com.example.JPA.Rest;

import com.example.JPA.DAO.Dao;
import com.example.JPA.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class Rest {
    private Dao employeeDAO;

    // quick and dirty: inject employee dao (use constructor injection)
    public Rest(Dao theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
