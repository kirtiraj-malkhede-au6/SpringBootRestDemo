package com.distephno.crud_api.service;

import java.util.List;

import com.distephno.crud_api.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto upatedEmployee);

    void deleteEmployee(Long employeeId);

}
