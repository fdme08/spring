package com.francis.spring.boot.spring.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francis.spring.boot.spring.data.rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
