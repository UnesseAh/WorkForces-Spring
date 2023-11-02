package org.workforces.repository;

import org.workforces.domain.Department;
import org.workforces.repository.interfaces.DepartmentRepository;

public class DepartmentRepositoryImpl implements DepartmentRepository {
    @Override
    public String save() {
        return "Department repository one";
    }
}
