/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author VS
 */
public class StudentDao {

    public void saveStudent(Student student) {
        Transaction trans = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            trans = session.beginTransaction();
            session.persist(student);
            trans.commit();
            System.out.println("Student saved");
        } catch (Exception e) {
            if (trans != null) {
                trans.rollback();
            }
            throw new RuntimeException(e);
        }
    }

    public List<Student> getAllStudents() {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Student> students = session.createQuery("from Student", Student.class).list();
            return students;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException(e);
        }
    }

}
