package ec.ecu.ups.icc.employees.Department.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.ecu.ups.icc.employees.Department.entitie.Departament;
import java.util.Optional;


@Repository
public interface DepartamentRepository extends JpaRepository<Departament , Long> {
    

    Optional<Departament> findById(Long id);
}
