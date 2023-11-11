import domain.Department;
import domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);

        Employee employee = new Employee();
//        Department department = new Department(1L,"IT");
        employee.setName("Youness");
        employee.setSalary(20000.0);
//        employee.setDepartment(department);

        employeeService.create(employee);



//        Long employeeIdToUpdate = 1L;
//        Optional<Employee> existingEmployee = employeeService.findById(employeeIdToUpdate);
//        Department department = new Department(2L,"HR");
//
//        Employee updatedEmployee = existingEmployee.get();
//        updatedEmployee.setName("FAHD Edit");
//        updatedEmployee.setDepartment(department);
//        updatedEmployee.setSalary(60000.0);
//
//
//        employeeService.update(updatedEmployee);


//        Long employeeIdToDelete = 2L;
//        Optional<Employee> existingEmployee = employeeService.findById(employeeIdToDelete);
//                    Employee deleteEmployee = existingEmployee.get();
//
//                    employeeService.delete(deleteEmployee);



        System.out.println(employeeService.findAll());
    }
}