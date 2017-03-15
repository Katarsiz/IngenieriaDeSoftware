/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.CascadeType;  

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;  
import javax.persistence.OneToOne;

/**
 *
 * @author Julio
 */
@Entity
@Table(name="user")
public class User {
    
    private static int max = 0;
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_user;
    
    @Column (name = "correo")
    private String correo;
    
    @Column ( name= "password")
    private String password;
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "idpersona")
    private Persona persona;

    public int getId_user() {
        return id_user;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setId_user() {
        this.id_user = max + 1;
        max++;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
            
}
