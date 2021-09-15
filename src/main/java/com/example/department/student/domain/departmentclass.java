package com.example.department.student.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class departmentclass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentid;
    private String departmentname;


    public departmentclass() {

    }

    public departmentclass(int id, String departmentname) {

        this.departmentid = departmentid;
        this.departmentname = departmentname;

}

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    @Override
    public String toString() {
        return "departmentclass{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }


}
