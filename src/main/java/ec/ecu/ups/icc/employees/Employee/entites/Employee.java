package ec.ecu.ups.icc.employees.Employee.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import ec.ecu.ups.icc.employees.Department.entitie.Departament;

@Entity
@Table(name= "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name= "first_name")
    private String first_name;

    @Column(name= "last_name")
    private String last_name;


    @Column(name= "email")
    private String email;

    @Column(name= "salary")
    private Double salary;




    @Column(name="active")
    private Character active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Departament department;

    public Long getId() {
        return id;
    }




    public void setId(Long id) {
        this.id = id;
    }




    public String getFirst_name() {
        return first_name;
    }




    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }




    public String getLast_name() {
        return last_name;
    }




    public void setLast_name(String last_name) {
        this.last_name = last_name;
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






    
public Departament getDepartment() {
        return department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }




    public Character getActive() {
        return active;
    }




    public void setActive(Character active) {
        this.active = active;
    }
    
}
