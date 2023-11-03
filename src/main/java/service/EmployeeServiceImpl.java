package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.interfaces.EmployeeRepository;
import service.interfaces.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployee() {
        return employeeRepository.save();
    }

//    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
}
