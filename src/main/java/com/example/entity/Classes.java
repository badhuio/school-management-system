package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="classes")
public class Classes{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String className;
	private String section;
	private String academicYear;
	private String status;
	

	public String getclassName() {return className;}
	public void setclassName(String className) {this.className = className;}
	
	public String getsection() {return section;}
	public void setsection(String section) {this.section = section;}
	
	public String getacademicYear() {return academicYear;}
	public void setacademicYear(String academicYear) {this.academicYear = academicYear;}
	
	public String getstatus() {return status;}
	public void setstatus(String status) {this.status = status;}
}