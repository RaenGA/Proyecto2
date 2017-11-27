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
public class CuerpoTecnico {
    private int numeroPartido;
    private int numeroPasaporte;
    private String tipo;
    
    public CuerpoTecnico(){
    }
    
    public CuerpoTecnico(int numPartido, int numPasaporte, String tipo){
        this.numeroPartido = numPartido;
        this.numeroPasaporte = numPasaporte;
        this.tipo = tipo;
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
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
}
