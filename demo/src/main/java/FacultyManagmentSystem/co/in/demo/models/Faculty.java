package FacultyManagmentSystem.co.in.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name ="id", nullable = false)
    public Integer getId() {
        return id;
    }
}
