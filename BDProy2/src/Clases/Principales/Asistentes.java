/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Principales;

import java.sql.Date;

/**
 *
 * @author M Express
 */
public class Asistentes {
    private int numeroPasaporte;
    private String tipo;
    private Date fechaInicio;
    
    public Asistentes(){
    }
    
    public Asistentes(int numPasaporte, String tipo, Date fechaInicio){
        this.numeroPasaporte = numPasaporte;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
    }
    
    public int getNumPasaporte(){
        return this.numeroPasaporte;
    }
    
    public void setNumPasaporte(int numPasaporte){
        this.numeroPasaporte = numPasaporte;
    }
    
    public int getTipo(){
        return this.numeroPasaporte;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public Date getDate(){
        return this.fechaInicio;
    }
    
    public void setTipo(Date fecha){
        this.fechaInicio = fecha;
    }
}
