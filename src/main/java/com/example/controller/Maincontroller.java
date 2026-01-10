package com.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ClassesDTO;
import com.example.dto.FeesDTO;
import com.example.dto.StudentDTO;
import com.example.entity.Student;
import com.example.service.Userservice;

@RestController
public class Maincontroller{
	
	@PostMapping("/saving")
		public StudentDTO save(@RequestBody StudentDTO dto) {		 
			System.out.printf("Admiss numb : ",dto.getadmissionNumber());
			System.out.printf("Admiss year : ",dto.getadmissionYear());
			System.out.printf("parent name : ",dto.getparentName());
			System.out.printf("student class : ",dto.getstudentClass());
			
			try {
				
			
				StudentDTO response =  Userservice.create(dto);
				return response; 
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	
	  @GetMapping (value="/users", produces="application/json")
		public List<Student> getAllUsers() {
			try {
				List<Student> users = Userservice.getAllUsersHql();
				return users;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
	@PostMapping("/saving1")
		public ClassesDTO  save1(@RequestBody ClassesDTO dto) {
			try {
				ClassesDTO response = Userservice.create1(dto);
				return response;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	
	
	@PostMapping("/saving2")
	public FeesDTO  save1(@RequestBody FeesDTO dto) {
		try {
			FeesDTO response = Userservice.create2(dto);
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}