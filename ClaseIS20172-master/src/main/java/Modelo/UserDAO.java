/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author Julio
 */
public class UserDAO {
    
    private SessionFactory sessionfactory;

    public void setSessionFactory(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
    }
    
    public void guardar(User p){
        Session session = sessionfactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.persist(p);
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    }

    public User getUser(String correo) {
        User p = null;
        Session session = sessionfactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            String hql = " from user where correo LIKE :correo";
            Query query = session.createQuery(hql);
            
            query.setParameter("correo", correo);
            
            p = (User)query.uniqueResult();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return p;
    }
    
}
