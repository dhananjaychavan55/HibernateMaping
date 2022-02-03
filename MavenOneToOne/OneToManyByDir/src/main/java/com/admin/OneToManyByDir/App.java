package com.admin.OneToManyByDir;

import org.hibernate.Session;

import com.getHibernateUtil.HibernateConfig;
import com.model.Department;
import com.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session = HibernateConfig.getSessionFactory().openSession();
       Employee e1=new Employee();
       e1.setEmpid(11);
       e1.setEmpname("AAA");
       
       Employee e2=new Employee();
       e2.setEmpid(12);
       e2.setEmpname("BBB");
       
       Department d=new Department();
       d.setDid(111);
       d.setDname("It");
       d.getE().add(e1);
       d.getE().add(e2);
       e1.setD(d);
       e2.setD(d);
       
       session.save(d);
       session.beginTransaction().commit();
       
       
       
    }
}
