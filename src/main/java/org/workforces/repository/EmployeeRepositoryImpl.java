package org.workforces.repository;

import org.workforces.repository.interfaces.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public String save() {
        return "Employee of repository one";
    }
}
