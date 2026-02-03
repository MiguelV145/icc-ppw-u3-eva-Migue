package ec.ecu.ups.icc.employees.Department.services;

import ec.ecu.ups.icc.employees.Department.dto.DepartmentWhitEmployeesDto;
import org.springframework.stereotype.Service;

@Service
public interface DepartamentsService {

    DepartmentWhitEmployeesDto getDepartmentWithActiveEmployees(Long id, String sortOrder);
    
}
