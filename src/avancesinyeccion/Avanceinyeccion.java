/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avancesinyeccion;

import Dao.dao_corrida;
import Dao.dao_inyeccion;
import Modelo.Corridas;
import Modelo.Inyeccion;
import Numericos.Onlydigits;
import Server.Serversql;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GATEWAY1-
 */
public class Avanceinyeccion extends javax.swing.JFrame {

    private final dao_inyeccion di = new dao_inyeccion();
    String prod = "1";
    Inyeccion arr;

    /**
     * Creates new form Avanceinyeccion
     */
    public Avanceinyeccion() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/factory_robot_manufacturing_industry_robotics_machine_robotic_arm_automation_industrial_production_icon_231898.png"));
        setIconImage(icon);
        setLocationRelativeTo(null);
    }

    /**
     * Se obtiene la conexion de acuerdo a si es a modo de pruebas o no Hay que
     * tener en cuenta que solo se va aa abrir y en la consulta o fin de la
     * operacion con sql finalizará la conexion.
     *
     * @return
     */
    private Connection getcon() {
        Connection c = null;
        try {
            Serversql s = new Serversql();
//            c = (prod.equals("1")) ? s.getconexionserver8("avances") : s.getconexionP("avances");
            c = s.getconexionP("avances");
        } catch (ClassNotFoundException | IOException | SQLException ex) {
            Logger.getLogger(Avanceinyeccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    private Connection getconcor() {
        Connection c = null;
        try {
            Serversql s = new Serversql();
            c = (prod.equals("1")) ? s.getconexionserver8("RCPT") : s.getconexionP("RCPT");
        } catch (ClassNotFoundException | IOException | SQLException ex) {
            Logger.getLogger(Avanceinyeccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JtEstilo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JtPares = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JlResp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JlEstilo = new javax.swing.JLabel();
        JlCombinacion = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JlCorrida = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JcPunto = new javax.swing.JComboBox<>();
        JlPeriodo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bordeazul.png")))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cancel_icon-icons.com_54824.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        JtEstilo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JtEstilo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtEstilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtEstiloMousePressed(evt);
            }
        });
        JtEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtEstiloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Agregar puntos y pares a lote");

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel4.setText("Lote");

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel6.setText("NUMERO DE PARES");

        JtPares.setFont(new java.awt.Font("Calibri", 0, 40)); // NOI18N
        JtPares.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtPares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtParesMousePressed(evt);
            }
        });
        JtPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtParesActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ic_send_128_28719.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        JlResp.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        JlResp.setForeground(new java.awt.Color(61, 204, 152));
        JlResp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel8.setText("Punto");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel5.setText("Estilo:");

        JlEstilo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N

        JlCombinacion.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel11.setText("Combinacion:");

        JlCorrida.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel13.setText("Corrida:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JlCombinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlCorrida, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlCombinacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(JlEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(JlCorrida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        JcPunto.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N

        JlPeriodo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        jLabel10.setText("Periodo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JlResp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(JtPares, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JcPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(JlPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JcPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JtPares, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(JlResp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void JtEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtEstiloActionPerformed
        getcombs();
    }//GEN-LAST:event_JtEstiloActionPerformed

    private void JtParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtParesActionPerformed
        JcPunto.requestFocus();
    }//GEN-LAST:event_JtParesActionPerformed

    private void JtEstiloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtEstiloMousePressed
        JtEstilo.setText("");
    }//GEN-LAST:event_JtEstiloMousePressed

    private void JtParesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtParesMousePressed
        JtPares.setText("");
    }//GEN-LAST:event_JtParesMousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        if (arr != null) {
            valida();
        }
    }//GEN-LAST:event_jLabel7MousePressed

    /**
     * Proceso para validar cada uno de los campos y no se vaya por ahi un valor
     * extra o aproposito para fines indebidos
     */
    private void valida() {
        Onlydigits o = new Onlydigits();
        String par = JtPares.getText();
        if (o.verificaint(JtEstilo.getText()) && o.verificaint(par) && Integer.parseInt(par) > 0) {
            setavanceinyeccion();
        } else {
            JOptionPane.showMessageDialog(null,
                    "NO PUEDES INTRODUCIR EN EL ESTILO CARACTERES QUE NO SEAN NUMEROS Y PARES MAYOR A CERO",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            vaciar();
        }
    }

    /**
     * Busca el estilo en la bd y posterior despliega informacion si es que
     * encontro algo con el estilo
     */
    private void getcombs() {
        Onlydigits o = new Onlydigits();
        if (o.verificaint(JtEstilo.getText())) {
            arr = new Inyeccion();
            dao_corrida d = new dao_corrida();
//            Nuevo objeto inyeccion
            arr = di.getinfowith(getcon(), Integer.parseInt(JtEstilo.getText()));
            if (arr != null) {
//                Nuevo objeto corrida
                Corridas cor = d.getCorridaconlote(getconcor(), arr.getCorridacpt());
                llenacombos(arr, cor);
                JtPares.requestFocus();
            } else {
                JlResp.setText("No se encontro ningun lote");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "NO PUEDES INTRODUCIR EN EL ESTILO CARACTERES QUE NO SEAN NUMEROS, INTENTALO DE NUEVO",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            JtEstilo.setText("");
            JtEstilo.requestFocus();
            JlResp.setText("");
        }
    }

    private void llenacombos(Inyeccion i, Corridas c) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        int pi = c.getPi() * 10;
        while (pi <= c.getPf() * 10 + 5) {
            model.addElement(String.valueOf(pi));
            pi += 5;
        }
        JcPunto.setModel(model);
        JlEstilo.setText(i.getEstilo() + "");
        JlCombinacion.setText(i.getCombinacion());
        JlCorrida.setText(i.getCorrida() + "");
        JlPeriodo.setText(i.getPeriodo() + "");
    }

    /**
     * Funcion para insertar en la bd ya con datos validades e listo para
     * iniciar el objeto de tipo inyeccion para la siguiente funcion de la
     * insercion del detalle de avance, ya que no aplica para todos los lotes
     */
    private void setavanceinyeccion() {
        java.util.Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        arr.setFecha(sdf.format(date));
        arr.setPares(Integer.parseInt(JtPares.getText()));
        arr.setPunto(JcPunto.getSelectedItem().toString());
        if (di.new_avancedetalle(getcon(), arr)) {
            JlResp.setText("Exito al agregar punto al Lote: "+arr.getLote());
            vaciar();
        } else {
            JOptionPane.showMessageDialog(null,
                    "ERROR AL AGREGAR AVANCE, INTENTELO DE NEUVO O LLAME A SISTEMAS",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * vacia todos los campos y combos con cantidades
     */
    private void vaciar() {
        JtEstilo.setText("");
        JtPares.setText("");
        JlEstilo.setText("");
        JlCombinacion.setText("");
        JlPeriodo.setText("");
        JlCorrida.setText("");
        JcPunto.removeAllItems();
        JtEstilo.requestFocus();
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Avanceinyeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avanceinyeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avanceinyeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avanceinyeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avanceinyeccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcPunto;
    private javax.swing.JLabel JlCombinacion;
    private javax.swing.JLabel JlCorrida;
    private javax.swing.JLabel JlEstilo;
    private javax.swing.JLabel JlPeriodo;
    private javax.swing.JLabel JlResp;
    private javax.swing.JTextField JtEstilo;
    private javax.swing.JTextField JtPares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}