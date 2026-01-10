package com.example.dto;

import java.sql.Date;

public class StudentDTO{
	private String admissionNumber;
	private String name;
	private String studentClass;
	private String section;
	private String gender;
	private Date dob;
	private String parentName;
	private String mobile;
	private String address;
	private String admissionYear;
	private String status;


		public String getadmissionNumber() {return admissionNumber; } 
		public void setadmissionNumber(String admissionNumber) {this.admissionNumber = admissionNumber; }

		public String getname() {return name; } 
		public void setname(String name) {this.name = name; }
		
		public String getstudentClass() {return studentClass; } 
		public void setstudentClass(String studentClass) {this.studentClass = studentClass; }
		
		public String getsection() {return section; } 
		public void setsection(String section) {this.section = section; }
		
		public String getgender() {return gender; } 
		public void setgender(String gender) {this.gender = gender; }
		
		public Date getdob() {return dob; } 
		public void setdob(Date dob) {this.dob= dob; }
		
		public String getparentName() {return parentName; } 
		public void setparentName(String parentName) {this.parentName = parentName; }
		
		public String getmobile() {return mobile; } 
		public void setmobile(String mobile) {this.mobile = mobile; }
		
		public String getaddress() {return address; } 
		public void setaddress(String address) {this.address= address; }
		
		public String getadmissionYear() {return admissionYear; } 
		public void setadmissionYear(String admissionYear) {this.admissionYear= admissionYear; }
		
		public String getstatus() {return status; }
		public void setstatus(String status) {this.status = status; }

};