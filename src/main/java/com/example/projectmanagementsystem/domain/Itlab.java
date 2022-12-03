package com.example.projectmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Itlab {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long pcid;
    private String pcname;
    private String ipaddress;
    private Long studentsid;
    public Itlab() {
        super();

    }

    public Itlab(Long pcid, String pcname, String ipaddress, Long studentsid) {
        this.pcid = pcid;
        this.pcname = pcname;
        this.ipaddress = ipaddress;
        this.studentsid = studentsid;
    }

    public Long getPcid() {
        return pcid;
    }

    public void setPcid(Long pcid) {
        this.pcid = pcid;
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Long getStudentsid() {
        return studentsid;
    }

    public void setStudentsid(Long studentsid) {
        this.studentsid = studentsid;
    }
}
