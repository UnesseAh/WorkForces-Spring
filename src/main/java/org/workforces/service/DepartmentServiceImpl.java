package org.workforces.service;

import org.workforces.repository.interfaces.DepartmentRepository;
import org.workforces.service.interfaces.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public String createDepartment() {
        return departmentRepository.save();
    }
}
