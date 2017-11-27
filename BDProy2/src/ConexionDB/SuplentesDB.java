/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import Clases.Principales.Suplentes;
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
public class SuplentesDB {
    
    public ArrayList<Suplentes> getListaSuplentes() {
        ArrayList<Suplentes> titular = new ArrayList<>();
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NUMEROPASAPORTE FROM SUPLENTES");
            while (rs.next()) {
                Suplentes conf = new Suplentes();
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
    public Suplentes getSuplentes(String numPartido) {
        Suplentes conf = null;
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NUMEROPASAPORTE"
                    + "    FROM SUPLENTES WHERE NUMEROPARTIDO = '" + numPartido + "'");
            while (rs.next()) {
                conf = new Suplentes();
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

    public void InsertSuplentes(Suplentes titular) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO SUPLENTES(NUMEROPARTIDO, NUMEROPASAPORTE)"
                    + " VALUES(?,?)");
            pst.setInt(1, titular.getNumPartido());
            pst.setInt(2, titular.getNumPasaporte());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }

    public void UpdateSuplentes(Suplentes titular, int numPasaporte) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE  SUPLENTES SET "
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

    public void DeleteSuplentes(String cod) {
        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM SUPLENTES "
                    + " WHERE NUMEROPARTIDO=?");
            pst.setString(1, cod);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
    }
}
