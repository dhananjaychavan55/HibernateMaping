package com.cjc.MavenOneToOne;

import org.hibernate.Session;

import com.cjc.util.HibernateConfigure;

import cjc.model.Employee;
import cjc.model.Laptop;

/**
 * Hello world!
 *
 */



public class App 
{
    public static void main( String[] args )
    {
    	createAccount();
    	updateLaptopNamethrouEmployee();
    	
    }
    
    
    public static void createAccount() {
    	Session session = HibernateConfigure.getSessionFactory().openSession();
    	Laptop l=new Laptop();
    	l.setLid(3);
    	l.setLname("Asus");
    	l.setLprice(52000);
    	
    	Employee e=new Employee();
    	e.setEid(13);
    	e.setEname("Nishant Dhole");
    	e.setAddres("Ravet");
    	l.setEmployee(e);
    	e.setLaptop(l);
    	
    	session.save(l);
    	session.save(e);
    	session.beginTransaction().commit();
    	System.out.println("Deta Added");
    	
    }
    
    public static void updateLaptopNamethrouEmployee() {
    	Session session = HibernateConfigure.getSessionFactory().openSession();
    		session.beginTransaction();
    	Employee employee = session.get(Employee.class,11);
    	employee.getLaptop().setLname("lenovo");;
    	session.save(employee);
    	session.getTransaction().commit();
    }
    

}

