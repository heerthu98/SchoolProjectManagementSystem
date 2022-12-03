package com.example.projectmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Supervisor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long supervisorid;
    private String supervisorname;
    private String supervisornic;
    private Long supervisorphno;
    private String supervisoremail;
    private String supervisoraddress;

    public Supervisor() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Supervisor(Long supervisorid, String supervisorname, String supervisornic, Long supervisorphno, String supervisoremail, String supervisoraddress) {
        this.supervisorid = supervisorid;
        this.supervisorname = supervisorname;
        this.supervisornic = supervisornic;
        this.supervisorphno = supervisorphno;
        this.supervisoremail = supervisoremail;
        this.supervisoraddress = supervisoraddress;
    }

    public Long getSupervisorid() {
        return supervisorid;
    }

    public void setSupervisorid(Long supervisorid) {
        this.supervisorid = supervisorid;
    }

    public String getSupervisorname() {
        return supervisorname;
    }

    public void setSupervisorname(String supervisorname) {
        this.supervisorname = supervisorname;
    }

    public String getSupervisornic() {
        return supervisornic;
    }

    public void setSupervisornic(String supervisornic) {
        this.supervisornic = supervisornic;
    }

    public Long getSupervisorphno() {
        return supervisorphno;
    }

    public void setSupervisorphno(Long supervisorphno) {
        this.supervisorphno = supervisorphno;
    }

    public String getSupervisoremail() {
        return supervisoremail;
    }

    public void setSupervisoremail(String supervisoremail) {
        this.supervisoremail = supervisoremail;
    }

    public String getSupervisoraddress() {
        return supervisoraddress;
    }

    public void setSupervisoraddress(String supervisoraddress) {
        this.supervisoraddress = supervisoraddress;
    }
}
