package ec.ecu.ups.icc.employees.Department.Mapper;

import ec.ecu.ups.icc.employees.Department.entitie.Departament;
import ec.ecu.ups.icc.employees.Department.dto.DepartmentDto;
import ec.ecu.ups.icc.employees.Department.dto.DepartmentWhitEmployeesDto;
import ec.ecu.ups.icc.employees.Department.dto.EmployeeDepartmentDto;
import ec.ecu.ups.icc.employees.Department.dto.CompanySimpleDto;
import ec.ecu.ups.icc.employees.Employee.entites.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapperDepartament {

    public MapperDepartament() {
    }

    public DepartmentDto toDto(Departament departament) {
        if (departament == null) {
            return null;
        }
        return new DepartmentDto(
                departament.getId(),
                departament.getName(),
                departament.getBuget(),
                departament.getActive(),
                departament.getCompany() != null ? departament.getCompany().getId() : null
        );
    }

    public DepartmentWhitEmployeesDto toDtoWithEmployees(Departament departament, String sortOrder) {
        if (departament == null) {
            return null;
        }

        // Crear DTO de Company simple
        CompanySimpleDto companyDto = null;
        if (departament.getCompany() != null) {
            companyDto = new CompanySimpleDto(
                    departament.getCompany().getId(),
                    departament.getCompany().getName(),
                    departament.getCompany().getCountry()
            );
        }

        DepartmentWhitEmployeesDto dto = new DepartmentWhitEmployeesDto(
                departament.getId(),
                departament.getName(),
                departament.getBuget(),
                departament.getActive(),
                companyDto
        );

        // Inicializar listas vacías
        List<EmployeeDepartmentDto> employeeList = new ArrayList<>();
        Integer employeeCount = 0;
        Double totalSalaries = 0.0;

        // Procesar empleados con programación iterativa
        if (departament.getEmployees() != null && !departament.getEmployees().isEmpty()) {
            for (Employee employee : departament.getEmployees()) {
                // Solo incluir empleados activos (active = 'S')
                if (employee.getActive() != null && employee.getActive() == 'S') {
                    EmployeeDepartmentDto empDto = employeeToDto(employee);
                    employeeList.add(empDto);
                }
            }

            // Ordenar los empleados según el parámetro
            if (sortOrder != null && sortOrder.equalsIgnoreCase("asc")) {
                employeeList.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
            } else {
                // Por defecto "desc"
                employeeList.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
            }

            // Calcular employeeCount y totalSalaries de forma iterativa
            employeeCount = employeeList.size();
            totalSalaries = 0.0;
            for (EmployeeDepartmentDto emp : employeeList) {
                totalSalaries += emp.getSalary();
            }
        }

        dto.setEmployees(employeeList);
        dto.setEmployeeCount(employeeCount);
        dto.setTotalSalaries(totalSalaries);

        return dto;
    }

    public Departament toEntity(DepartmentDto departamentDto) {
        if (departamentDto == null) {
            return null;
        }
        Departament departament = new Departament();
        departament.setId(departamentDto.getId());
        departament.setName(departamentDto.getName());
        departament.setBuget(departamentDto.getBudget());
        departament.setActive(departamentDto.getActive());
        return departament;
    }

    public List<DepartmentDto> toDtoList(List<Departament> departaments) {
        if (departaments == null) {
            return null;
        }
        return departaments.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public List<Departament> toEntityList(List<DepartmentDto> departamentDtos) {
        if (departamentDtos == null) {
            return null;
        }
        return departamentDtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    private EmployeeDepartmentDto employeeToDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        return new EmployeeDepartmentDto(
                employee.getId(),
                employee.getFirst_name(),
                employee.getLast_name(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getActive()
        );
    }
}

