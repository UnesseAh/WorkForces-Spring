package org.workforces.service;

import org.workforces.domain.Employee;
import org.workforces.service.interfaces.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private final Employee employee;
    public EmployeeServiceImpl(Employee employee){
        this.employee = employee;
    }
    @Override
    public void doSomething() {
        System.out.println("do something method is working!");
    }
}
