package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.converter.converter;
import com.example.dao.dao;
import com.example.dto.ClassesDTO;
import com.example.dto.FeesDTO;
import com.example.dto.StudentDTO;
import com.example.entity.Classes;
import com.example.entity.Fees;
import com.example.entity.Student;

public class Userservice{
	
	
	//student
	
	public static StudentDTO create(StudentDTO dto) {
			
			try {
			  Student data = converter.toEntity(dto);
			  
			  List<Student> res = dao.existedDatas(data);
			  
			  if(res == null) {
				  try {
					  Student response = dao.save(data);
					  StudentDTO responseDTO = converter.toDTO(response);
					  
					  return responseDTO;
					   
				  }catch(Exception e) {
					  e.printStackTrace();
				  }
			  }
		
			  return null;
					  
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return null;
	}
	
	public static List<Student> getAllUsersHql() {
		try {
			List<Student> users = dao.getAllUsersHql();
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	//classes
	
	public static ClassesDTO create1(ClassesDTO dto) {
		
		try {
		  Classes data = converter.toEntity1(dto);
		  
		  List<Classes> res = dao.existedDatas1(data);
		  
		  if(res == null) {
			  try {
				  Classes response = dao.save1(data);
				  ClassesDTO responseDTO = converter.toDTO1(response);
				  
				  return responseDTO;
				   
			  }catch(Exception e) {
				  e.printStackTrace();
			  }
		  }
		  		
		  
		  
		  return null;
				  
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	return null;
	}
	
	
	//fees
	
	public static FeesDTO create2(FeesDTO dto) {
		
		try {
		  Fees data = converter.toEntity2(dto);
		  
		  List<Fees> res = dao.existedDatas2(data);
		  
		  if(res == null) {
			  try {
				  Fees response = dao.save2(data);
				  FeesDTO responseDTO = converter.toDTO2(response);
				  
				  return responseDTO;
				   
			  }catch(Exception e) {
				  e.printStackTrace();
			  }
		  }

		  return null;
				  
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	return null;
	}
}