/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import Clases.Principales.Cambios;
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
public class CambiosDB {
    public ArrayList<Cambios> getListaCambios() {
        ArrayList<Cambios> titular = new ArrayList<>();
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NUMEROPASAPORTE FROM CAMBIOS");
            while (rs.next()) {
                Cambios conf = new Cambios();
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
    public Cambios getCambios(String numPartido) {
        Cambios conf = null;
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NUMEROPASAPORTE"
                    + "    FROM CAMBIOS WHERE NUMEROPARTIDO = '" + numPartido + "'");
            while (rs.next()) {
                conf = new Cambios();
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

    public void InsertCambios(Cambios cambio) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO CAMBIOS(NUMEROPARTIDO, NUMEROPASAPORTE)"
                    + " VALUES(?,?)");
            pst.setInt(1, cambio.getNumPartido());
            pst.setInt(2, cambio.getNumPasaporte());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }

    public void UpdateCambios(Cambios cambio, int numPasaporte) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE  CAMBIOS SET "
                    + " NUMEROPASAPORTE=? WHERE NUMEROPARTIDO=? AND NUMEROPASAPORTE=?");
            
            pst.setInt(1, cambio.getNumPasaporte());
            pst.setInt(2, cambio.getNumPartido());
            pst.setInt(2, numPasaporte);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }
//cod para Eliminar

    public void DeleteCambios(String cod) {
        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM CAMBIOS "
                    + " WHERE NUMEROPARTIDO=?");
            pst.setString(1, cod);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
    }
}
