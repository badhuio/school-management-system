package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.entity.Classes;
import com.example.entity.Fees;
import com.example.entity.Student;
import com.example.util.util;

public class dao {

	
	//student
	
    public static List<Student> existedDatas(Student data) {
        Session s = util.getSessionFactory().openSession();

        List<Student> list = s.createQuery(
            "FROM Student s WHERE s.name = :name AND s.address = :address",
            Student.class
        )
        .setParameter("name", data.getname())
        .setParameter("address", data.getaddress())
        .list();

        s.close();
        return list.isEmpty() ? null : list;
    }
    
  //list student data
  	 public static List<Student> getAllUsersHql() {
  	        try (Session s = util.getSessionFactory().openSession()) {
  	            Query<Student> q = s.createQuery("select s from Student s", Student.class); // HQL: entity name "user");
  	     
  	            return q.list();
  	        } catch (Exception e) {
  	            e.printStackTrace();
  	        }
			return null;
  	    }
  	 
    
    

    public static Student save(Student data) {
        Session s = util.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(data);
        tx.commit();
        s.close();
        return data;
    }
    
    
    //classes
    public static List<Classes> existedDatas1(Classes data) {
        Session s = util.getSessionFactory().openSession();

        List<Classes> list = s.createQuery(
            "FROM Classes c WHERE c.className = :className ",
            Classes.class
        )
        .setParameter("className", data.getclassName())
        .list();

        s.close();
        return list.isEmpty() ? null : list;
    }
    
    
    public static Classes save1(Classes data) {
        Session s = util.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(data);
        tx.commit();
        s.close();
        return data;
    }
 
    
    
    //fees
    public static List<Fees> existedDatas2(Fees data) {
        Session s = util.getSessionFactory().openSession();

        List<Fees> list = s.createQuery(
            "FROM Fees f WHERE f.classes= :classes ",
            Fees.class
        )
        .setParameter("classes", data.getclasses())
        .list();

        s.close();
        return list.isEmpty() ? null : list;
    }
    
    
    public static Fees save2(Fees data) {
        Session s = util.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(data);
        tx.commit();
        s.close();
        return data;
    }
    
    
}
