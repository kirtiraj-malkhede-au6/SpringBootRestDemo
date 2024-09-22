package com.distephno.crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.distephno.crud_api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
