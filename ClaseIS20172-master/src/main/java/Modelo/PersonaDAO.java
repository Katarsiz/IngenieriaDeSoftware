/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



/**
 *
 * @author Julio
 */
public class PersonaDAO {
    
    private SessionFactory sessionfactory;

    public void setSessionFactory(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
    }
    
    public void guardar(Persona p){
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

    public Persona getPersona(int id_persona) {
        Persona p = null;
        Session session = sessionfactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
            String hql = " from persona where idpersona = :id_persona";
            Query query = session.createQuery(hql);
            query.setParameter("idpersona", id_persona);
            p = (Persona)query.uniqueResult();
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
