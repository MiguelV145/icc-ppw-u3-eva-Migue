package ec.ecu.ups.icc.employees.Company.dto;

import java.util.List;

import ec.ecu.ups.icc.employees.Department.entitie.Departament;

public class CompanyDepartmentsDto {
    

    public String name;
    public String contry;
    public List <Departament> departaments;



    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContry() {
        return contry;
    }
    public void setContry(String contry) {
        this.contry = contry;
    }
    public List<Departament> getDepartaments() {
        return departaments;
    }
    public void setDepartaments(List<Departament> departaments) {
        this.departaments = departaments;
    }

    

    
}
