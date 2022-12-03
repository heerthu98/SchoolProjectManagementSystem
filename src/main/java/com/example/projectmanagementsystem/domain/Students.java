package com.example.projectmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long studentsid;
    private String studentsname;
    private String studentsnic;
    private String studentsemail;
    private String studentsaddress;
    private String studentsgrade;
    private Long projectid;
    public Students() {

    }

    public Students(Long studentsid, String studentsname, String studentsnic, String studentsemail, String studentsaddress, String studentsgrade, Long projectid) {
        this.studentsid = studentsid;
        this.studentsname = studentsname;
        this.studentsnic = studentsnic;
        this.studentsemail = studentsemail;
        this.studentsaddress = studentsaddress;
        this.studentsgrade = studentsgrade;
        this.projectid = projectid;
    }

    public Long getStudentsid() {
        return studentsid;
    }

    public void setStudentsid(Long studentsid) {
        this.studentsid = studentsid;
    }

    public String getStudentsname() {
        return studentsname;
    }

    public void setStudentsname(String studentsname) {
        this.studentsname = studentsname;
    }

    public String getStudentsnic() {
        return studentsnic;
    }

    public void setStudentsnic(String studentsnic) {
        this.studentsnic = studentsnic;
    }

    public String getStudentsemail() {
        return studentsemail;
    }

    public void setStudentsemail(String studentsemail) {
        this.studentsemail = studentsemail;
    }

    public String getStudentsaddress() {
        return studentsaddress;
    }

    public void setStudentsaddress(String studentsaddress) {
        this.studentsaddress = studentsaddress;
    }

    public String getStudentsgrade() {
        return studentsgrade;
    }

    public void setStudentsgrade(String studentsgrade) {
        this.studentsgrade = studentsgrade;
    }

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }
}
