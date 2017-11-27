/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import Clases.Principales.Titulares;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author M Express
 */
public class TitularesDB {
    
    public ArrayList<Titulares> getListaTitulares() {
        ArrayList<Titulares> titular = new ArrayList<>();
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NUMEROPASAPORTE FROM TITULARES");
            while (rs.next()) {
                Titulares conf = new Titulares();
                conf.setNumPartido(rs.getInt("NUMEROPARTIDO"));
                conf.setNumPasaporte(rs.getInt("NUMEROPASAPORTE"));
                titular.add(conf);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en Listado");
        }

        return titular;
    }
    
    //Obtener Arbitro
    public Titulares getTitulares(String numPartido) {
        Titulares conf = null;
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NUMEROPASAPORTE"
                    + "    FROM TITULARES WHERE NUMEROPARTIDO = '" + numPartido + "'");
            while (rs.next()) {
                conf = new Titulares();
                conf.setNumPasaporte(rs.getInt("NUMEROPASAPORTE"));
                conf.setNumPartido(rs.getInt("NUMEROPARTIDO"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en buscar");
        }
        return conf;
    }
    
    //Insertar DATOS en la DB

    public void InsertTitulares(Titulares titular) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO TITULARES(NUMEROPARTIDO, NUMEROPASAPORTE)"
                    + " VALUES(?,?)");
            pst.setInt(1, titular.getNumPartido());
            pst.setInt(2, titular.getNumPasaporte());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }

    public void UpdateTitulares(Titulares titular, int numPasaporte) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE  TITULARES SET "
                    + " NUMEROPASAPORTE=? WHERE NUMEROPARTIDO=? AND NUMEROPASAPORTE=?");
            
            pst.setInt(1, titular.getNumPasaporte());
            pst.setInt(2, titular.getNumPartido());
            pst.setInt(2, numPasaporte);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }
//cod para Eliminar

    public void DeleteTitulares(String cod) {
        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM TITULARES "
                    + " WHERE NUMEROPARTIDO=?");
            pst.setString(1, cod);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
    }
}
