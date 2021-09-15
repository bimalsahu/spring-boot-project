package com.example.department.student.domain;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Name;
    private String Rollnumber;
    private String Emailid;
    private int Date_of_registration;
    private String Course_name;



    public Student() {
    }

    public Student(Long id, String studentname, String rollnumber, String emailid, int date_of_registration, String course_name, com.example.department.student.domain.departmentclass departmentclass) {
        this.Id = Id;
        this.Name = Name;
        Rollnumber = Rollnumber;
        Emailid =Emailid;
        Date_of_registration = Date_of_registration;
        Course_name =  Course_name;

    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        Rollnumber = rollnumber;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public int getDate_of_registration() {
        return Date_of_registration;
    }

    public void setDate_of_registration(int date_of_registration) {
        Date_of_registration = date_of_registration;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Rollnumber='" + Rollnumber + '\'' +
                ", Emailid='" + Emailid + '\'' +
                ", Date_of_registration=" + Date_of_registration +
                ", Course_name='" + Course_name + '\'' +
                '}';
    }

}
