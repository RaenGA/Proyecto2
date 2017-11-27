/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import Clases.Principales.Disputa;
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
public class DisputaDB {
    public ArrayList<Disputa> getListaDisputa() {
        ArrayList<Disputa> titular = new ArrayList<>();
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NOMBRESEDE FROM DISPUTA");
            while (rs.next()) {
                Disputa conf = new Disputa();
                conf.setNumPartido(rs.getInt("NUMEROPASAPORTE"));
                conf.setnombSede(rs.getString("NOMBRESEDE"));
                titular.add(conf);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error en Listado");
        }

        return titular;
    }
    
    //Obtener Arbitro
    public Disputa getDisputa(String numPartido) {
        Disputa conf = null;
        PersonaDB pdb = new PersonaDB();
        try {
            Connection cnx = DatabaseConnect.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT NUMEROPARTIDO, NOMBRESEDE"
                    + "    FROM DISPUTA WHERE NUMEROPARTIDO = '" + numPartido + "'");
            while (rs.next()) {
                conf = new Disputa();
                conf.setnombSede(rs.getString("NOMBRESEDE"));
                conf.setNumPartido(rs.getInt("NUMEROPARTIDO"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en buscar");
        }
        return conf;
    }
    
    //Insertar DATOS en la DB

    public void InsertDisputa(Disputa cambio) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO DISPUTA(NUMEROPARTIDO, NOMBRESEDE)"
                    + " VALUES(?,?)");
            pst.setInt(1, cambio.getNumPartido());
            pst.setString(2, cambio.getnombSede());
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }

    public void UpdateDisputa(Disputa cambio, int numPasaporte) {

        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE  DISPUTA SET "
                    + " NOMBRESEDE=? WHERE NUMEROPARTIDO=? AND NOMBRESEDE=?");
            
            pst.setString(1, cambio.getnombSede());
            pst.setInt(2, cambio.getNumPartido());
            pst.setInt(2, numPasaporte);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }

    }
//cod para Eliminar

    public void DeleteDisputa(String cod) {
        try {
            Connection cnx = DatabaseConnect.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM DISPUTA "
                    + " WHERE NUMEROPARTIDO=?");
            pst.setString(1, cod);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }
    }
}
