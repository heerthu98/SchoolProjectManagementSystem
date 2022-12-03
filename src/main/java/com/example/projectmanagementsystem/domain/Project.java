package com.example.projectmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long projectid;
	private String projecttitle;

	private String supervisorname;
	private Long supervisorphno;
	private String studentsname;
	private String studentsgrade;
	private String pcname;
	public Project() {

	}

	public Project(Long projectid, String projecttitle,  String supervisorname, Long supervisorphno, String studentsname, String studentsgrade, String pcname) {
		this.projectid = projectid;
		this.projecttitle = projecttitle;

		this.supervisorname = supervisorname;
		this.supervisorphno = supervisorphno;
		this.studentsname = studentsname;
		this.studentsgrade = studentsgrade;
		this.pcname = pcname;
	}

	public Long getProjectid() {
		return projectid;
	}

	public void setProjectid(Long projectid) {
		this.projectid = projectid;
	}

	public String getProjecttitle() {
		return projecttitle;
	}

	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}


	public String getSupervisorname() {
		return supervisorname;
	}

	public void setSupervisorname(String supervisorname) {
		this.supervisorname = supervisorname;
	}

	public Long getSupervisorphno() {
		return supervisorphno;
	}

	public void setSupervisorphno(Long supervisorphno) {
		this.supervisorphno = supervisorphno;
	}

	public String getStudentsname() {
		return studentsname;
	}

	public void setStudentsname(String studentsname) {
		this.studentsname = studentsname;
	}

	public String getStudentsgrade() {
		return studentsgrade;
	}

	public void setStudentsgrade(String studentsgrade) {
		this.studentsgrade = studentsgrade;
	}

	public String getPcname() {
		return pcname;
	}

	public void setPcname(String pcname) {
		this.pcname = pcname;
	}
}
