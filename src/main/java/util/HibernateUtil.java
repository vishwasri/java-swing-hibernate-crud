/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import model.ItemColor;
import model.MyUnit;
import model.Sku;
import model.Student;
import model.Unit;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author VS
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration()
                    .setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver")
                    .setProperty(Environment.URL, "jdbc:mysql://localhost:3306/hibernate?createDatabaseIfNotExist=true&useUnicode=yes&characterEncoding=UTF-8")
                    .setProperty(Environment.USER, "root")
                    .setProperty(Environment.PASS, "1234")
                    .setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect")
                    .setProperty(Environment.HBM2DDL_AUTO, "update")
                    .setProperty(Environment.SHOW_SQL, "true")
                    .setProperty(Environment.HIGHLIGHT_SQL, "true");

            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(MyUnit.class);
            configuration.addAnnotatedClass(Unit.class);
            configuration.addAnnotatedClass(Sku.class);
            configuration.addAnnotatedClass(ItemColor.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;

    }
}
