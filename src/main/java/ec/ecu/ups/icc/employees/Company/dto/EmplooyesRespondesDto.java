package ec.ecu.ups.icc.employees.Company.dto;

import java.util.List;

import ec.ecu.ups.icc.employees.Employee.entites.Employee;

public class EmplooyesRespondesDto {

    public String name;
    public Double minSalary;
    public List<Employee> employees;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


    
    
}
