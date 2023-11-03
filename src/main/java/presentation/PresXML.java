package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DepartmentServiceImpl;
import service.EmployeeServiceImpl;

public class PresXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        EmployeeServiceImpl employeeService = springContext.getBean("employeeService", EmployeeServiceImpl.class);
        System.out.println(employeeService.createEmployee());

        DepartmentServiceImpl departmentService = (DepartmentServiceImpl) springContext.getBean("departmentService");
        System.out.println(departmentService.createDepartment());
    }
}
