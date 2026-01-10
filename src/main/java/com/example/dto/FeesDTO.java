package com.example.dto;

public class FeesDTO{
	
	private String classes;
	private String tutionFee;
	private String transportFee;
	private String activityFee;
	private String examFee;
	private String annualFee;
	private String status;

		public String getclasses() {return classes;}
		public void setclasses(String classes) {this.classes = classes;}
		
		public String gettutionFee() {return tutionFee;}
		public void settutionFee(String tutionFee) {this.tutionFee = tutionFee;}

		public String gettransportFee() {return transportFee;}
		public void settransportFee(String transportFee) {this.transportFee = transportFee;}

		public String getactivityFee() {return activityFee;}
		public void setactivityFee(String activityFee) {this.activityFee = activityFee;}

		public String getexamFee() {return examFee;}
		public void setexamFee(String examFee) {this.examFee = examFee;}
		
		public String getannualFee() {return annualFee;}
		public void setannualFee(String annualFee) {this.annualFee = annualFee;}
		
		public String getstatus() {return status;}
		public void setstatus(String status) {this.status = status;}
}