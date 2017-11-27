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
public class Disputa {
    private int numeroPartido;
    private String nombreSede;
    
    public Disputa(){
    }
    
    public Disputa(int numPartido, String nombSede){
        this.numeroPartido = numPartido;
        this.nombreSede = nombSede;
    }
    
    public int getNumPartido(){
        return this.numeroPartido;
    }
    
    public void setNumPartido(int numPartido){
        this.numeroPartido = numPartido;
    }
    
    public String getnombSede(){
        return this.nombreSede;
    }
    
    public void setnombSede(String nombSede){
        this.nombreSede = nombSede;
    }
}
