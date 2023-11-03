package repository;

import org.springframework.stereotype.Component;
import repository.interfaces.DepartmentRepository;
@Component("departmentRepository")
public class DepartmentRepositoryImpl implements DepartmentRepository {
    @Override
    public String save() {
        return "Department repository one";
    }
}
