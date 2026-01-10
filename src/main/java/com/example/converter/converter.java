package com.example.converter;

import com.example.dto.ClassesDTO;
import com.example.dto.FeesDTO;
import com.example.dto.StudentDTO;
import com.example.entity.Classes;
import com.example.entity.Fees;
import com.example.entity.Student;

public class converter{

		public static Student toEntity(StudentDTO dto) {
			
			Student entity = new Student();
			entity.setadmissionNumber(dto.getadmissionNumber());
			entity.setname(dto.getname());
			entity.setstudentClass(dto.getstudentClass());
			entity.setsection(dto.getsection());
			entity.setgender(dto.getgender());
			entity.setdob(dto.getdob());
			entity.setparentName(dto.getparentName());
			entity.setmobile(dto.getmobile());
			entity.setaddress(dto.getaddress());
			entity.setadmissionYear(dto.getadmissionYear());
			entity.setstatus(dto.getstatus());
			
			return entity;
		}
		
		public static Classes toEntity1(ClassesDTO dto) {
			
			Classes entity = new Classes();
			entity.setclassName(dto.getclassName());
			entity.setsection(dto.getsection());
			entity.setacademicYear(dto.getacademicYear());
			entity.setstatus(dto.getstatus());
			
			return entity;
		}
		
		
		public static Fees toEntity2(FeesDTO dto) {
			
			Fees entity = new Fees();
			entity.setclasses(dto.getclasses());
			entity.settutionFee(dto.gettutionFee());
			entity.settransportFee(dto.gettransportFee());
			entity.setactivityFee(dto.getactivityFee());
			entity.setexamFee(dto.getexamFee());
			entity.setannualFee(dto.getannualFee());
			entity.setstatus(dto.getstatus());
			
			return entity;
		}
	
	
	
	
		
	

		public static StudentDTO toDTO(Student data) {
			
			StudentDTO dto = new StudentDTO();
			dto.setadmissionNumber(data.getadmissionNumber());
			dto.setname(data.getname());
			dto.setstudentClass(data.getstudentClass());
			dto.setsection(data.getsection());
			dto.setgender(data.getgender());
			dto.setdob(data.getdob());
			dto.setparentName(data.getparentName());
			dto.setmobile(data.getmobile());
			dto.setaddress(data.getaddress());
			dto.setadmissionYear(data.getadmissionYear());
			dto.setstatus(data.getstatus());
			
			return dto;
		}
		
		
		public static ClassesDTO toDTO1(Classes data) {
			
			ClassesDTO dto = new ClassesDTO();
			dto.setclassName(data.getclassName());
			dto.setsection(data.getsection());
			dto.setacademicYear(data.getacademicYear());
			dto.setstatus(data.getstatus());

			
			return dto;
		}
		
		public static FeesDTO toDTO2(Fees data) {
			
			FeesDTO dto = new FeesDTO();
			dto.setclasses(data.getclasses());
			dto.settutionFee(data.gettutionFee());
			dto.settransportFee(data.gettransportFee());
			dto.setactivityFee(data.getactivityFee());
			dto.setexamFee(data.getexamFee());
			dto.setannualFee(data.getannualFee());
			dto.setstatus(data.getstatus());

			
			return dto;
		}
}