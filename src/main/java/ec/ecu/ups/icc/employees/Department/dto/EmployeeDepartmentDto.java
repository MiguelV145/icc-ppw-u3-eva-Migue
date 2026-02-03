package ec.ecu.ups.icc.employees.Department.dto;

public class EmployeeDepartmentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
    private Character active;

    public EmployeeDepartmentDto() {
    }

    public EmployeeDepartmentDto(Long id, String firstName, String lastName, String email, Double salary, Character active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }
}
