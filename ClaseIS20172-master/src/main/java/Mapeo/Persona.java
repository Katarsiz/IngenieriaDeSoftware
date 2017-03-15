/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Date;

/**
 *
 * @author Julio
 */
@Entity
@Table(name="persona")
public class Persona {
    
    private static int max = 0;
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_persona;
    
    @Column (name = "nombre")
    private String nombre;
    
    @Column (name = "fechanac")
    private Date fechanac;
    
    @Column (name = "carrera")
    private String carrera;

    public void setId_persona() {
        this.id_persona = max + 1;
        max++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public String getCarrera() {
        return carrera;
    }
    
}
