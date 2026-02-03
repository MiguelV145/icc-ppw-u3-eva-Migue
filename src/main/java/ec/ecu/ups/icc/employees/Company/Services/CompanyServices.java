package ec.ecu.ups.icc.employees.Company.Services;

import org.springframework.stereotype.Service;

import ec.ecu.ups.icc.employees.Company.dto.CompanyDepartmentsDto;

@Service
public interface CompanyServices {

    
    CompanyDepartmentsDto findOne(Long id);   

    

    
}
