package com.atul.spring.data.productdata.entity.association.manytomany;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "programmer")
public class ProgrammerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int salary;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "programmers_project", joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName =
            "id"), inverseJoinColumns =
            @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private Set<ProjectEntity> projectEntities;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(final int salary) {
        this.salary = salary;
    }

    public Set<ProjectEntity> getProjectEntities() {
        return projectEntities;
    }

    public void setProjectEntities(
            final Set<ProjectEntity> projectEntities) {
        this.projectEntities = projectEntities;
    }

    @Override public String toString() {
        return "ProgrammerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", projectEntities=" + projectEntities +
                '}';
    }
}
