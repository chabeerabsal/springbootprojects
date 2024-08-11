package com.example.JPA.DAO;

import com.example.JPA.Entity.Employee;

import java.util.List;

public interface Dao {
    List<Employee> findAll();
}
