package repository;

import org.springframework.stereotype.Component;
import repository.interfaces.EmployeeRepository;
@Component("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public String save() {
        return "Employee of repository one";
    }
}
