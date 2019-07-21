package com.atul.spring.data.productdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


/**
 * -- create table employee(
 * -- id int PRIMARY KEY AUTO_INCREMENT,
 * -- name varchar(20)
 * -- );
 *
 * create table id_gen(
 * gen_name varchar(60) PRIMARY KEY,
 * gen_val int(20)
 * );
 */

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val",
            allocationSize = 5)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
