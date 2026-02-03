package ec.ecu.ups.icc.employees.Company.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.ecu.ups.icc.employees.Company.Repositories.CompanyRepository;
import ec.ecu.ups.icc.employees.Company.dto.CompanyDepartmentsDto;
import ec.ecu.ups.icc.employees.Company.entitie.Company;
import ec.ecu.ups.icc.employees.Department.Repositories.DepartamentRepository;
import ec.ecu.ups.icc.employees.Employee.dto.EmployeeResponseDto;

@Service
public class CompanyServicesImpl implements CompanyServices {

    private DepartamentRepository departamentRepository;
    private CompanyRepository companyRepository;
    @Override
    public CompanyDepartmentsDto findOne(Long id){
       List<Company>  companies= companyRepository.findAll();

        return null;
    }

    



    public EmployeeResponseDto findHighSalary(Long id ){
        

        List<Company> companies= companyRepository.findAll();

        return null;
    }
    
}
