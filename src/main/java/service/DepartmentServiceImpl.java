package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.interfaces.DepartmentRepository;
import service.interfaces.DepartmentService;
@Component
public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public String createDepartment() {
        return departmentRepository.save();
    }
}
