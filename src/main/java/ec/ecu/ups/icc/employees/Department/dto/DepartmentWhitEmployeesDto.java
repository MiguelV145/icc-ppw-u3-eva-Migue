package ec.ecu.ups.icc.employees.Department.dto;

import java.util.List;

public class DepartmentWhitEmployeesDto {
    
    private Long id;
    private String name;
    private Double budget;
    private Character active;
    private CompanySimpleDto company;
    private List<EmployeeDepartmentDto> employees;
    private Integer employeeCount;
    private Double totalSalaries;

    public DepartmentWhitEmployeesDto() {
    }

    public DepartmentWhitEmployeesDto(Long id, String name, Double budget, Character active, CompanySimpleDto company) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.active = active;
        this.company = company;
        this.employeeCount = 0;
        this.totalSalaries = 0.0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public CompanySimpleDto getCompany() {
        return company;
    }

    public void setCompany(CompanySimpleDto company) {
        this.company = company;
    }

    public List<EmployeeDepartmentDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDepartmentDto> employees) {
        this.employees = employees;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Double getTotalSalaries() {
        return totalSalaries;
    }

    public void setTotalSalaries(Double totalSalaries) {
        this.totalSalaries = totalSalaries;
    }
}
