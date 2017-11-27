/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Principales.Capitanes;
import Clases.Principales.CuerpoTecnico;
import Clases.Principales.Delegado;
import Clases.Principales.Juegan;
import Clases.Principales.JueganPK;
import Clases.Principales.Partido;
import Clases.Principales.Persona;
import Clases.Principales.Suplentes;
import Clases.Principales.Titulares;
import ConexionDB.CapitanesDB;
import ConexionDB.CuerpoTecnicoDB;
import ConexionDB.DelegadoDB;
import ConexionDB.JueganDB;
import ConexionDB.PartidoDB;
import ConexionDB.PersonaDB;
import ConexionDB.SuplentesDB;
import ConexionDB.TitularesDB;
import java.math.BigInteger;

/**
 *
 * @author M Express
 */
public class InsertarEquipo extends javax.swing.JFrame {
    PartidoDB pdb = new PartidoDB();
    Partido part = new Partido();
    Persona Pers = new Persona();
    PersonaDB perdb = new PersonaDB();
    Titulares tilt = new Titulares();
    TitularesDB tiltdb = new TitularesDB();
    Suplentes supl = new Suplentes();
    SuplentesDB supldb = new SuplentesDB();
    Delegado dele = new Delegado();
    DelegadoDB deledb = new DelegadoDB();
    CuerpoTecnico cutec = new CuerpoTecnico();
    CuerpoTecnicoDB cutecdb = new CuerpoTecnicoDB();
    Juegan juega = new Juegan();
    JueganPK juegapk = new JueganPK();
    JueganDB juegadb = new JueganDB();
    Capitanes caps = new Capitanes();
    CapitanesDB capdb = new CapitanesDB();
    /**
     * Creates new form InsertarEquipo
     */
    public InsertarEquipo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setlblPartido(String num){
        lblNumPartido.setText(num);
    }
    public void cargarTitulares(){
        int numPartido = Integer.parseInt(lblNumPartido.getText());
        int titular1 = Integer.parseInt(txtT1.getText());
        int titular2 = Integer.parseInt(txtT2.getText());
        int titular3 = Integer.parseInt(txtT3.getText());
        int titular4 = Integer.parseInt(txtT4.getText());
        int titular5 = Integer.parseInt(txtT5.getText());
        int titular6 = Integer.parseInt(txtT6.getText());
        int titular7 = Integer.parseInt(txtT7.getText());
        int titular8 = Integer.parseInt(txtT8.getText());
        int titular9 = Integer.parseInt(txtT9.getText());
        int titular10 = Integer.parseInt(txtT10.getText());
        int titular11 = Integer.parseInt(txtT11.getText());
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular1);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular2);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular3);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular4);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular5);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular6);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular7);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular8);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular9);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular10);
        tiltdb.InsertTitulares(tilt);
        tilt = new Titulares();
        tilt.setNumPartido(numPartido);
        tilt.setNumPasaporte(titular11);
        tiltdb.InsertTitulares(tilt);
        
    }
    
    public void cargarSuplentes(){
        int numPartido = Integer.parseInt(lblNumPartido.getText());
        int suplente1 = Integer.parseInt(txtS1.getText());
        int suplente2 = Integer.parseInt(txtS2.getText());
        int suplente3 = Integer.parseInt(txtS3.getText());
        int suplente4 = Integer.parseInt(txtS4.getText());
        int suplente5 = Integer.parseInt(txtS5.getText());
        int suplente6 = Integer.parseInt(txtS6.getText());
        int suplente7 = Integer.parseInt(txtS7.getText());
        int suplente8 = Integer.parseInt(txtS8.getText());
        int suplente9 = Integer.parseInt(txtS9.getText());
        int suplente10 = Integer.parseInt(txtS10.getText());
        int suplente11 = Integer.parseInt(txtS11.getText());
        int suplente12 = Integer.parseInt(txtS12.getText());
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente1);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente2);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente3);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente4);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente5);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente6);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente7);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente8);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente9);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente10);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente11);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
        supl.setNumPartido(numPartido);
        supl.setNumPasaporte(suplente12);
        supldb.InsertSuplentes(supl);
        supl = new Suplentes();
    }
    
    public void delegado(){
        int numPartido = Integer.parseInt(lblNumPartido.getText());
        int delegado = Integer.parseInt(txtDelegado.getText());
        dele = new Delegado();
        dele.setNumPartido(numPartido);
        dele.setNumPasaporte(delegado);
        deledb.InsertDelegado(dele);
    }
    
    public void CT(){
        int numPartido = Integer.parseInt(lblNumPartido.getText());
        int entrenador = Integer.parseInt(txtEnt.getText());
        int asist1 = Integer.parseInt(txtAsist1.getText());
        int asist2 = Integer.parseInt(txtAsist2.getText());
        int medico = Integer.parseInt(txtMed.getText());
        cutec = new CuerpoTecnico();
        cutec.setNumPartido(numPartido);
        cutec.setNumPasaporte(entrenador);
        cutec.setTipo("Entrenador");
        cutecdb.InsertCuerpoTecnico(cutec);
        cutec = new CuerpoTecnico();
        cutec.setNumPartido(numPartido);
        cutec.setNumPasaporte(asist1);
        cutec.setTipo("Asistente1");
        cutecdb.InsertCuerpoTecnico(cutec);
        cutec = new CuerpoTecnico();
        cutec.setNumPartido(numPartido);
        cutec.setNumPasaporte(asist2);
        cutec.setTipo("Asistente2");
        cutecdb.InsertCuerpoTecnico(cutec);
        cutec = new CuerpoTecnico();
        cutec.setNumPartido(numPartido);
        cutec.setNumPasaporte(medico);
        cutec.setTipo("Medico");
        cutecdb.InsertCuerpoTecnico(cutec);
    }
    public void EquipoCap(){
        int numPartido = Integer.parseInt(lblNumPartido.getText());
        int equipo = Integer.parseInt(txtEquipo.getText());
        int cap = Integer.parseInt(txtCap.getText());
        juega = new Juegan();
        BigInteger np = BigInteger.valueOf(numPartido);
        juegapk.setCodigoPais(np);
        BigInteger equ = BigInteger.valueOf(equipo);
        juegapk.setNumeropartido(equ);
        juega.setJueganPK(juegapk);
        juegadb.InsertJuega(juega);
        caps.setNumPartido(numPartido);
        caps.setNumPasaporte(cap);
        capdb.InsertCapitanes(caps);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        txtS4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtS5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtS6 = new javax.swing.JTextField();
        txtS7 = new javax.swing.JTextField();
        txtS8 = new javax.swing.JTextField();
        txtS9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtS10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtS11 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtS12 = new javax.swing.JTextField();
        txtT1 = new javax.swing.JTextField();
        txtT3 = new javax.swing.JTextField();
        txtT2 = new javax.swing.JTextField();
        txtT4 = new javax.swing.JTextField();
        txtT6 = new javax.swing.JTextField();
        txtT5 = new javax.swing.JTextField();
        txtT7 = new javax.swing.JTextField();
        txtT8 = new javax.swing.JTextField();
        txtT9 = new javax.swing.JTextField();
        txtT10 = new javax.swing.JTextField();
        txtT11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtS1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtS2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtS3 = new javax.swing.JTextField();
        txtEnt = new javax.swing.JTextField();
        txtAsist2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAsist1 = new javax.swing.JTextField();
        txtMed = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtDelegado = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblPartido = new javax.swing.JLabel();
        lblEquipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCap = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtEquipo = new javax.swing.JTextField();
        lblNumPartido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setText("Titular");

        jLabel13.setText("Titular");

        jLabel14.setText("Titular");

        jLabel15.setText("Titular");

        jLabel16.setText("Titular");

        jLabel18.setText("Titular");

        jLabel19.setText("Titular");

        jLabel20.setText("Titular");

        txtT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtT5ActionPerformed(evt);
            }
        });

        jLabel21.setText("Sustituto");

        jLabel22.setText("Sustituto");

        jLabel23.setText("Sustituto");

        jLabel24.setText("Sustituto");

        jLabel25.setText("Sustituto");

        jLabel26.setText("Sustituto");

        jLabel28.setText("Sustituto");

        jLabel29.setText("Sustituto");

        jLabel30.setText("Sustituto");

        jLabel31.setText("Sustituto");

        jLabel32.setText("Sustituto");

        jLabel9.setText("Titular");

        jLabel33.setText("Sustituto");

        jLabel10.setText("Titular");

        txtS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtS2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Titular");

        jLabel17.setText("Entrenador");

        jLabel35.setText("Medico");

        jLabel36.setText("Asistente 1");

        jLabel37.setText("Asistente 2");

        jLabel38.setText("Delegedado");

        lblPartido.setText("NumeroPartido");

        lblEquipo.setText("Equipo");

        jLabel3.setText("InsertarEquipo");

        jLabel1.setText("Capitan");

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNumPartido.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtT5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtT4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtT3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtT2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtT1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtT10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtT9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtT8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtT11)
                            .addComponent(txtCap)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPartido)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEquipo)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtS4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtEquipo))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMed, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAsist2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAsist1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDelegado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPartido)
                    .addComponent(lblEquipo)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPartido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(txtS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(txtS6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtS7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txtT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(txtT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)
                                .addComponent(txtS8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(txtT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29)
                                .addComponent(txtS9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(txtT10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30)
                                .addComponent(txtS10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtT11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33)
                                .addComponent(txtS11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAsist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAsist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35))
                            .addGap(320, 320, 320))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDelegado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38))
                            .addGap(279, 279, 279))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtS12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtS2ActionPerformed

    private void txtT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtT5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarTitulares();
        cargarSuplentes();
        delegado();
        EquipoCap();
        CT();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblNumPartido;
    private javax.swing.JLabel lblPartido;
    private javax.swing.JTextField txtAsist1;
    private javax.swing.JTextField txtAsist2;
    private javax.swing.JTextField txtCap;
    private javax.swing.JTextField txtDelegado;
    private javax.swing.JTextField txtEnt;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtMed;
    private javax.swing.JTextField txtS1;
    private javax.swing.JTextField txtS10;
    private javax.swing.JTextField txtS11;
    private javax.swing.JTextField txtS12;
    private javax.swing.JTextField txtS2;
    private javax.swing.JTextField txtS3;
    private javax.swing.JTextField txtS4;
    private javax.swing.JTextField txtS5;
    private javax.swing.JTextField txtS6;
    private javax.swing.JTextField txtS7;
    private javax.swing.JTextField txtS8;
    private javax.swing.JTextField txtS9;
    private javax.swing.JTextField txtT1;
    private javax.swing.JTextField txtT10;
    private javax.swing.JTextField txtT11;
    private javax.swing.JTextField txtT2;
    private javax.swing.JTextField txtT3;
    private javax.swing.JTextField txtT4;
    private javax.swing.JTextField txtT5;
    private javax.swing.JTextField txtT6;
    private javax.swing.JTextField txtT7;
    private javax.swing.JTextField txtT8;
    private javax.swing.JTextField txtT9;
    // End of variables declaration//GEN-END:variables
}
