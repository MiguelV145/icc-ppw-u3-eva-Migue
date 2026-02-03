package ec.ecu.ups.icc.employees.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.ecu.ups.icc.employees.Employee.entites.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{


    
    

    
}
