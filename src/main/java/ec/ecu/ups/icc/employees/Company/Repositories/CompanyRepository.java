package ec.ecu.ups.icc.employees.Company.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.ecu.ups.icc.employees.Company.entitie.Company;

import java.util.Optional;


@Repository
public interface CompanyRepository extends JpaRepository <Company, Long> {


    Optional<Company> findById(Long id);

    
    
    
}
