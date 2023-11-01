package org.workforces;

import org.workforces.domain.Employee;
import org.workforces.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("youness", 2000);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl(employee);
        employeeService.doSomething();
    }
}