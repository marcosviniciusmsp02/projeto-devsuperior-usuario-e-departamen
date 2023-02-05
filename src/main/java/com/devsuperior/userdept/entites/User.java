package com.devsuperior.userdept.entites;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn (name = "department_id")
    private Department department;

    public String getEmail() {
        return email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartament(Department departament) {
        this.department = departament;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
