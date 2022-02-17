package com.example.springdocker.service.impl;

import com.example.springdocker.dto.request.AddEmployeeRequest;
import com.example.springdocker.dto.response.EmployeeResponse;
import com.example.springdocker.entity.Employee;
import com.example.springdocker.repository.EmployeeRepository;
import com.example.springdocker.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final ModelMapper modelMapper;
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(ModelMapper modelMapper, EmployeeRepository employeeRepository) {
        this.modelMapper = modelMapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse add(AddEmployeeRequest employeeRequest) {
        Employee employee = modelMapper.map(employeeRequest, Employee.class);
        return modelMapper.map(employeeRepository.save(employee), EmployeeResponse.class);
    }
}
