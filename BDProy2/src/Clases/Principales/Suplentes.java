/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Principales;

/**
 *
 * @author M Express
 */
public class Suplentes {
    private int numeroPartido;
    private int numeroPasaporte;
    
    public Suplentes(){
    }
    
    public Suplentes(int numPartido, int numPasaporte){
        this.numeroPartido = numPartido;
        this.numeroPasaporte = numPasaporte;
    }
    
    public int getNumPartido(){
        return this.numeroPartido;
    }
    
    public void setNumPartido(int numPartido){
        this.numeroPartido = numPartido;
    }
    
    public int getNumPasaporte(){
        return this.numeroPasaporte;
    }
    
    public void setNumPasaporte(int numPasaporte){
        this.numeroPasaporte = numPasaporte;
    }
    
}
