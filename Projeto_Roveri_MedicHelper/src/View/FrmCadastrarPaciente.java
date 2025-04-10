/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Paciente;
import Controller.CtrlCadastrarPaciente;
import Controller.CtrlAtualizarPaciente;
import Controller.CtrlExcluirPaciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Controller.CtrlListarPaciente;
import java.sql.SQLException;
import Model.PacienteDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author Gustavo Canova
 */
public class FrmCadastrarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form frm_Listar_Paciente
     */
    public FrmCadastrarPaciente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtrg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<String>();
        ano = new javax.swing.JComboBox<String>();
        mes = new javax.swing.JComboBox<String>();
        btnexibir = new javax.swing.JButton();
        btnexcluir = new javax.swing.JToggleButton();
        btnatualizar = new javax.swing.JButton();
        btncadastrar = new javax.swing.JButton();
        btnloginpaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela_Cadastro_Paciente (1).png"))); // NOI18N

        jLabel8.setText("Senha");

        jLabel9.setText("Cpf");

        jLabel11.setText("Nome");

        jLabel12.setText("Rg");

        jLabel13.setText("Data de Nascimento");

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        btnexibir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnexibir.setText("Exibir Cadastros");
        btnexibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexibirActionPerformed(evt);
            }
        });

        btnexcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnexcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnatualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnatualizar.setText("Atualizar Cadastro");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        btncadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        btnloginpaciente.setText("Voltar");
        btnloginpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginpacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(btnexibir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnloginpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel11))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexibir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnloginpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        // TODO add your handling code here: 
        int ID_Paciente= Integer.parseInt(Lista.getValueAt(Lista.getSelectedRow(), 0).toString());
        txtnome.setText(Lista.getValueAt(Lista.getSelectedRow(), 1).toString());
        txtrg.setText(Lista.getValueAt(Lista.getSelectedRow(), 3).toString());
        txtcpf.setText(Lista.getValueAt(Lista.getSelectedRow(), 4).toString());
        txtsenha.setText(Lista.getValueAt(Lista.getSelectedRow(), 5).toString());

        {

        }

    }//GEN-LAST:event_ListaMouseClicked

    private void btnloginpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginpacienteActionPerformed
        // TODO add your handling code here:

        FrmTelaInicial ini = new FrmTelaInicial();
        ini.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnloginpacienteActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        // TODO add your handling code here:

        if (txtnome.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Nome é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtrg.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Rg é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtcpf.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Cpf é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtsenha.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Senha é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resposta = 0;

        int ID_Paciente = Integer.parseInt(Lista.getValueAt(Lista.getSelectedRow(), 0).toString());
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Atualizar esse Cadastro ?");

        if (resposta == JOptionPane.YES_OPTION) {
            Paciente atupac = new Paciente();
            String idade = ano.getSelectedItem() + "-" + mes.getSelectedItem() + "-" + dia.getSelectedItem();
            CtrlAtualizarPaciente CtrAtualizar = new CtrlAtualizarPaciente();

            atupac.setID_Paciente(ID_Paciente);
            atupac.setNome(txtnome.getText());
            atupac.setDatanasc(idade);
            atupac.setRg(txtrg.getText());
            atupac.setCpf(txtcpf.getText());
            atupac.setSenha(txtsenha.getText());

            try {
                JOptionPane.showMessageDialog(null, CtrAtualizar.atuPaciente(atupac));

            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // TODO add your handling code her

        if (txtnome.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Nome é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtrg.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Rg é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtcpf.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Cpf é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtsenha.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Senha é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resposta = 0;

        int id = Integer.parseInt("0");

        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Fazer esse Cadastro ?");
        if (resposta == JOptionPane.YES_OPTION) {
            CtrlCadastrarPaciente CtrCadastro = new CtrlCadastrarPaciente();
            String idade = ano.getSelectedItem() + "-" + mes.getSelectedItem() + "-" + dia.getSelectedItem();

            Paciente cadpac = new Paciente();

            cadpac.setID_Paciente(id);
            cadpac.setNome(txtnome.getText());
            cadpac.setDatanasc(idade);
            cadpac.setRg(txtrg.getText());
            cadpac.setCpf(txtcpf.getText());
            cadpac.setSenha(txtsenha.getText());

            try {
                JOptionPane.showMessageDialog(null, CtrCadastro.cadpaciente(cadpac));
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCadastrarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnexibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexibirActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel m = new DefaultTableModel();
            m.setRowCount(0);
            m.addColumn("ID_Paciente");
            m.addColumn("nome");
            m.addColumn("datanasc");
            m.addColumn("rg");
            m.addColumn("cpf");
            m.addColumn("senha");

            CtrlListarPaciente pac = new CtrlListarPaciente();
            ArrayList<Paciente> lista = pac.listar();

            for (Paciente paclist : lista) {
                m.addRow(new Object[]{paclist.getID_Paciente(), paclist.getNome(), paclist.getDatanasc(), paclist.getRg(), paclist.getCpf(), paclist.getSenha()});

            }
            Lista.setModel(m);
        } catch (Exception ex) {

        }

        txtnome.setText(null);
        txtrg.setText(null);
        txtcpf.setText(null);
        txtsenha.setText(null);
    }//GEN-LAST:event_btnexibirActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        //TODO add your handling code here:

        int resposta = 0;

        int ID_Paciente = Integer.parseInt(Lista.getValueAt(Lista.getSelectedRow(), 0).toString());
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir esse Cadastrado ?");
        if (resposta == JOptionPane.YES_OPTION) {
            CtrlExcluirPaciente CtrDel = new CtrlExcluirPaciente();
            String idade = ano.getSelectedItem() + "-" + mes.getSelectedItem() + "-" + dia.getSelectedItem();
            Paciente excpac = new Paciente();

            excpac.setID_Paciente(ID_Paciente);
            excpac.setNome(txtnome.getText());
            excpac.setDatanasc(idade);
            excpac.setRg(txtrg.getText());
            excpac.setCpf(txtcpf.getText());
            excpac.setSenha(txtsenha.getText());

            try {
                JOptionPane.showMessageDialog(null, CtrDel.expaciente(excpac));
            } catch (SQLException e) {
            }

            txtnome.setText(null);
            txtrg.setText(null);
            txtcpf.setText(null);
            txtsenha.setText(null);

        }
    }//GEN-LAST:event_btnexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastrarPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Lista;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JToggleButton btnexcluir;
    private javax.swing.JButton btnexibir;
    private javax.swing.JButton btnloginpaciente;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtrg;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
