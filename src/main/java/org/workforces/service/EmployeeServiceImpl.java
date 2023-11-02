package org.workforces.service;

import org.workforces.repository.interfaces.EmployeeRepository;
import org.workforces.service.interfaces.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployee() {
        return employeeRepository.save();
    }
}
