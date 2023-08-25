package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;
import model.Student;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

//        ItemColor itemColor = new ItemColor();
//        itemColor.setName("red");
//        itemColor.setStatus(1);
//        
//        ItemColor itemColor2 = new ItemColor();
//        itemColor.setName("red");
//        itemColor.setStatus(1);
        Student student = new Student();
      
        student.setName("vishwa");

        Student student2 = new Student();
        
        student.setName("vishwaw");

        Transaction tr = session.beginTransaction();
        session.save(student);
        session.save(student2);

        tr.commit();

        session.close();
        sessionFactory.close();
    }

}
