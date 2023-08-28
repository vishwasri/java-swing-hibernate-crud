/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.MyUnit;
import model.Unit;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author VS
 */
public class UnitDao {
    public void saveUnit(MyUnit unit) {
        Transaction trans = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            trans = session.beginTransaction();
            session.persist(unit);
            trans.commit();
            System.out.println("unit saved");
        } catch (Exception e) {
            if (trans != null) {
                trans.rollback();
            }
            throw new RuntimeException(e);
        }
    }
}
