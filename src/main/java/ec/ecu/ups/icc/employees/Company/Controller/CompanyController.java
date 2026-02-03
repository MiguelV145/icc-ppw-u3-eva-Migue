package ec.ecu.ups.icc.employees.Company.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.ecu.ups.icc.employees.Company.Services.CompanyServices;
import ec.ecu.ups.icc.employees.Company.dto.CompanyDepartmentsDto;
import ec.ecu.ups.icc.employees.Employee.dto.EmployeeResponseDto;
import ec.ecu.ups.icc.employees.Employee.entites.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("api/companies")

public class CompanyController {


    private CompanyServices cService;

    public CompanyController() {
    }


    @GetMapping("{id}/departaments")
    public CompanyDepartmentsDto getForDepartaments(@RequestParam CompanyDepartmentsDto dto) {
        
         
        
        return null;
    }


    @GetMapping("{id}/hihg-salary-employees")
    public EmployeeResponseDto getForHighalary(@RequestParam EmployeeResponseDto dto) {
        return null;
    }
    
    
    
}
