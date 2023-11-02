package org.workforces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.workforces.service.DepartmentServiceImpl;
import org.workforces.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        EmployeeServiceImpl employeeService = springContext.getBean("employeeService", EmployeeServiceImpl.class);
        DepartmentServiceImpl departmentService = (DepartmentServiceImpl) springContext.getBean("departmentService");

        System.out.println(employeeService.createEmployee());
        System.out.println(departmentService.createDepartment());
    }
}