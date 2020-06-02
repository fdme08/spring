package com.francis.spring.boot.spring.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francis.spring.boot.spring.data.rest.entity.Employee;


/*
 * This interface will extend the JpaRepository that simplifies data access to the database
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
