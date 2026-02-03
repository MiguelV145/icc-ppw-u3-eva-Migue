package ec.ecu.ups.icc.employees.Department.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import ec.ecu.ups.icc.employees.Department.services.DepartamentsService;
import ec.ecu.ups.icc.employees.Department.dto.DepartmentWhitEmployeesDto;

@RestController
@RequestMapping("api/departments")
public class DepartmanetControllers {
    
    @Autowired
    private DepartamentsService departamentsService;

    @GetMapping("{id}/employees")
    public ResponseEntity<DepartmentWhitEmployeesDto> getDepartmentWithEmployees(
            @PathVariable Long id,
            @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {
        
        try {
            DepartmentWhitEmployeesDto departmentDto = departamentsService.getDepartmentWithActiveEmployees(id, sort);
            return ResponseEntity.ok(departmentDto);
        } catch (RuntimeException e) {
            if (e.getMessage().contains("no encontrado")) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Departamento no encontrado");
            } else if (e.getMessage().contains("inactivo")) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Departamento inactivo");
            }
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error interno del servidor");
        }
    }
    
}

