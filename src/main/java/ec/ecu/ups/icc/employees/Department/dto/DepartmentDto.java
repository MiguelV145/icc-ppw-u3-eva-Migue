package ec.ecu.ups.icc.employees.Department.dto;

public class DepartmentDto {

    private Long id;
    private String name;
    private Double budget;
    private Character active;
    private Long companyId;

    public DepartmentDto() {
    }

    public DepartmentDto(Long id, String name, Double budget, Character active, Long companyId) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.active = active;
        this.companyId = companyId;
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}

