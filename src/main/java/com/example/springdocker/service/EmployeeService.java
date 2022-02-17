package com.example.springdocker.service;

import com.example.springdocker.dto.request.AddEmployeeRequest;
import com.example.springdocker.dto.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse add(AddEmployeeRequest employee);
}
