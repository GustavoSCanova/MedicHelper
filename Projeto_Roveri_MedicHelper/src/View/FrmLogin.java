/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CtrlLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Controller.CtrlListarPaciente;
import Model.Medico;
import Model.Administrador;
import java.sql.SQLException;
import Model.Paciente;
import Model.PacienteDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.persistence.sessions.Login;

/**
 *
 * @author Gustavo Canova
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLoginPaciente
     */
    public FrmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnloginpac = new javax.swing.JButton();
        rdbmed = new javax.swing.JRadioButton();
        rdbpac = new javax.swing.JRadioButton();
        rdbadm = new javax.swing.JRadioButton();
        btnsair = new javax.swing.JButton();
        Tela_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Id");

        jLabel2.setText("Senha");

        btnloginpac.setText("Login");
        btnloginpac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginpacActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbmed);
        rdbmed.setText("Medico");

        buttonGroup1.add(rdbpac);
        rdbpac.setText("Paciente");

        buttonGroup1.add(rdbadm);
        rdbadm.setText("Administrador");

        btnsair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair-menu-2.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        Tela_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela_Login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(rdbmed))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(rdbpac))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnloginpac, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(rdbadm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Tela_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbmed))
                .addGap(27, 27, 27)
                .addComponent(rdbpac)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnloginpac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rdbadm)))
                .addGap(16, 16, 16)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1))
            .addComponent(Tela_Login)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginpacActionPerformed
        // TODO add your handling code here:
        
        if ((txtid.getText().trim().equals(""))) {

            JOptionPane.showMessageDialog(null, "O Campo Id é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if ((txtsenha.getText().trim().equals(""))) {

            JOptionPane.showMessageDialog(null, "O Campo Senha é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);

            return;
        }

        try {

            int id = Integer.parseInt(txtid.getText());

            CtrlLogin Loginpac = new CtrlLogin();

            Paciente pac = new Paciente();
            pac.setID_Paciente(id);
            pac.setSenha(txtsenha.getText());
            pac.setIdSalvo(id);

            CtrlLogin Loginadm = new CtrlLogin();

            Administrador adm = new Administrador();
            adm.setID_Adm(id);
            adm.setSenha(txtsenha.getText());

            CtrlLogin LogMed = new CtrlLogin();

            Medico med = new Medico();
            med.setID_Medico(id);
            med.setSenha(txtsenha.getText());


            if (rdbadm.isSelected()) {
                if (Loginadm.validaLoginAdministrador(adm)) {
                    JOptionPane.showMessageDialog(null, "Seja Bem vindo(a) ao MedicHelper");
                    new FrmTelaInicial().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao Efetuar Login Como Administrador Dados Inválidos");
                }
            }
            if (rdbpac.isSelected()) {
                if (Loginpac.validaLoginPaciente(pac)) {
                    JOptionPane.showMessageDialog(null, "Seja Bem vindo(a) ao MedicHelper");
                    FrmConsultaPaciente frm = new FrmConsultaPaciente(Integer.parseInt(txtid.getText()));
                    frm.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao Efetuar Login Como Paciente Dados Inválidos");
                }
            }
            if (rdbmed.isSelected()) {
                if (LogMed.validaLoginMedico(med)) {
                    JOptionPane.showMessageDialog(null, "Seja Bem vindo(a) ao MedicHelper");
                    new FrmTelaMedico().setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao Efetuar Login Como Médico Dados Inválidos");
                }
               
            }

        } catch (SQLException ex) {

            Logger.getLogger(CtrlLogin.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    null, "Erro não previsto");
        }
        
        txtid.setText(null);
        txtsenha.setText(null);

    }//GEN-LAST:event_btnloginpacActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:

        int resposta = 0;

        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Mesmo Sair do Progama Medic Helper ?");
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();

        }

    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tela_Login;
    private javax.swing.JButton btnloginpac;
    private javax.swing.JButton btnsair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rdbadm;
    private javax.swing.JRadioButton rdbmed;
    private javax.swing.JRadioButton rdbpac;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
