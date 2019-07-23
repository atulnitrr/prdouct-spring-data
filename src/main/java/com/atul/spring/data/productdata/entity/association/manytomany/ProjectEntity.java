package com.atul.spring.data.productdata.entity.association.manytomany;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "projectEntities")
    private Set<ProgrammerEntity> programmerEntities;

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

    public Set<ProgrammerEntity> getProgrammerEntities() {
        return programmerEntities;
    }

    public void setProgrammerEntities(
            final Set<ProgrammerEntity> programmerEntities) {
        this.programmerEntities = programmerEntities;
    }
}
