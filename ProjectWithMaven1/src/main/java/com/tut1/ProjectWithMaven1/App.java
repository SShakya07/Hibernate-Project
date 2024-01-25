package com.tut1.ProjectWithMaven1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
          cfg.configure("com/tut1/ProjectWithMaven1/tut.xml");
          SessionFactory sf = cfg.buildSessionFactory();
          
          System.out.println(sf);
          System.out.println(sf.isClosed());
          
          
          student s1 = new student();
          s1.setId(1);
          s1.setName("mukesh");
          s1.setCity("punjab");
          System.out.println(s1);
          
         Session os = sf.openSession();
         Transaction tx = os.beginTransaction();
         os.save(s1);
         tx.commit();
         os.close();
    }
}
