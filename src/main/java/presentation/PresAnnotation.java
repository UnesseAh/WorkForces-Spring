package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.DepartmentServiceImpl;
import service.EmployeeServiceImpl;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( "repository","service");
        EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
        DepartmentServiceImpl department = context.getBean(DepartmentServiceImpl.class);
        System.out.println(service.createEmployee());
        System.out.println(department.createDepartment());
    }
}
