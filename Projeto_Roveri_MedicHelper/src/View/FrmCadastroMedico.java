/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CtrlAtualizarMedico;
import Controller.CtrlAtualizarPaciente;
import Controller.CtrlCadastrarMedico;
import Controller.CtrlDeleteMedico;
import Controller.CtrlListarMedico;
        ;
import Model.Medico;
import Model.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mahs
 */
public class FrmCadastroMedico extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastroMedico
     */
    public FrmCadastroMedico() {
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

        txtsenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Comboespecialidade = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        ano = new javax.swing.JComboBox();
        btnexibir = new javax.swing.JButton();
        btncadastrar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JToggleButton();
        btnatualizar = new javax.swing.JButton();
        btnloginpaciente = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        Tela_Cadastro_Medico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel8.setText("Senha");

        jLabel11.setText("Nome");

        jLabel2.setText("Especialidade");

        Comboespecialidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acupuntura", "Administração em Saúde;", "Anatomia Patológica", "Cuidados Intensivos Pediátricos", "Homeopatia", "Medicina de Família e Comunidade", "Medicina do Trabalho", "Acupunctura Médica", "Alergia e Imunologia", "Alergia e Imunologia Pediátrica", "Anestesiologia", "Anestesiologia", "Angiologia", "Angiologia e Cirurgia Vascular", "Angiorradiologia e Cirurgia Endovascular", "Atendimento ao Queimado", "Avaliação do Dano Corporal", "Cancerologia", "Cardiologia", "Cardiologia", "Cardiologia Pediátrica", "Cardiologia Pediátrica", "Cardiologia de Intervenção", "Cirurgia Cardiotorácica", "Cirurgia Cardiovascular", "Cirurgia Cardíaca", "Cirurgia Crânio-Maxilo-Facial", "Cirurgia Geral", "Cirurgia Geral", "Cirurgia Maxilofacial", "Cirurgia Pediátrica", "Cirurgia Pediátrica", "Cirurgia Plástica", "Cirurgia Plástica Reconstrutiva e Estética", "Cirurgia Torácica", "Cirurgia Torácica", "Cirurgia Vascular", "Cirurgia da Mão", "Cirurgia de cabeça e pescoço", "Cirurgia do Aparelho Digestivo", "Cirurgia do trauma", "Cirurgia videolaparoscópica", "Citopatologia", "Clínica Médica", "Codificação Clínica", "Coloproctologia", "Densitometria óssea", "Dermatologia", "Dermatopatologia", "Dermatovenereologia", "Doenças Infecciosas", "Dor", "EEG/Neurofisiologia", "Ecocardiografia", "Ecologia", "Eletrofisiologia Cardíaca", "Eletrofisiologia clínica invasiva", "Emergência Médica", "Endocrinologia e Metabologia", "Endocrinologia e Nutrição", "Endocrinologia pediátrica", "Endoscopia", "Endoscopia digestiva", "Endoscopia ginecológica", "Endoscopia respiratória", "Ergometria", "Estomatologia", "Farmacologia Clínica", "Foniatria", "Gastrenterologia", "Gastroenterologia", "Gastroenterologia pediátrica", "Genética", "Genética Médica", "Genética médica", "Geriatria", "Geriatria", "Gestão dos Serviços de Saúde", "Ginecologia Oncológica", "Ginecologia e obstetrícia", "Ginecologia/Obstetrícia", "Hansenologia", "Hematologia Clínica", "Hematologia e Hemoterapia", "Hematologia e hemoterapia pediátrica", "Hemodinâmica e cardiologia intervencionista", "Hepatologia", "Hepatologia", "Hidrologia Médica", "Imuno-hemoterapia", "Imunoalergologia", "Infectologia", "Infectologia hospitalar", "Infectologia pediátrica", "Mamografia", "Mastologia", "Medicina Aeronáutica", "Medicina Desportiva", "Medicina Esportiva", "Medicina Farmacêutica", "Medicina Física e Reabilitação", "Medicina Física e Reabilitação", "Medicina Geral e Familiar", "Medicina Hiperbárica e Subaquática", "Medicina Intensiva", "Medicina Intensiva", "Medicina Interna", "Medicina Legal", "Medicina Materno-Fetal", "Medicina Militar", "Medicina Nuclear", "Medicina Paliativa", "Medicina Tropical", "Medicina da Dor", "Medicina da Reprodução", "Medicina de Emergência", "Medicina de urgência", "Medicina do Sono", "Medicina do Trabalho", "Medicina do Tráfego", "Medicina do Viajante", "Medicina do adolescente", "Medicina fetal", "Medicina intensiva pediátrica", "Nefrologia", "Nefrologia pediátrica", "Nefropatologia", "Neonatologia", "Neonatologia", "Neurocirurgia", "Neurofisiologia clínica", "Neurologia", "Neurologia pediátrica", "Neuropatologia", "Neuropediatria", "Neurorradiologia", "Neurorradiologia", "Nutrição parenteral e enteral", "Nutrição parenteral e enteral pediátrica", "Nutrologia pediátrica", "Oftalmologia", "Oncologia Médica", "Oncologia Pediátrica", "Ortodoncia", "Ortopedia", "Ortopedia Infantil", "Otorrinolaringologia", "Patologia Clínica", "Patologia Experimental", "Pediatria", "Peritagem Médica da Segurança Social", "Pneumologia", "Pneumologia pediátrica", "Psicogeriatria", "Psicoterapia", "Psiquiatria", "Psiquiatria Forense", "Psiquiatria da Infância e da Adolescência", "Psiquiatria da infância e adolescência", "Psiquiatria forense", "Radiologia", "Radiologia intervencionista e angiorradiologia", "Radioncologia", "Reumatologia", "Reumatologia pediátrica", "Saúde Pública", "Sexologia", "Transplante de medula óssea", "Ultrassonografia em ginecologia e obstetrícia", "Urologia", " " }));

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jScrollPane2.setViewportView(Lista);

        jLabel3.setText("Dia");

        jLabel4.setText("Mes");

        jLabel5.setText("Ano");

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", " " }));

        btnexibir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnexibir.setText("Exibir Cadastros");
        btnexibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexibirActionPerformed(evt);
            }
        });

        btncadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
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

        btnloginpaciente.setText("Voltar");
        btnloginpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginpacienteActionPerformed(evt);
            }
        });

        btnsair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        Tela_Cadastro_Medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela_Cadastro_Paciente (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(Comboespecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btnexibir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnloginpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Tela_Cadastro_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Comboespecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btnexibir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnloginpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Tela_Cadastro_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        //TODO add your handling code here:
       int resposta = 0;
       
       int ID_Medico = Integer.parseInt(Lista.getValueAt(Lista.getSelectedRow(), 0).toString()); Integer.parseInt(Lista.getValueAt(Lista.getSelectedRow(), 0).toString());
       
       resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente excluir o medico?");
       if (resposta == JOptionPane.YES_OPTION) {
           CtrlDeleteMedico delete = new CtrlDeleteMedico();
           Medico cadmedico = new Medico();
           cadmedico.setID_Medico(ID_Medico);
          
           cadmedico.setSenha(txtsenha.getText());
          
           try {
               JOptionPane.showMessageDialog(null, delete.excluirMedico(cadmedico));
           } catch (SQLException ex) {
               Logger.getLogger(FrmCadastroMedico.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       
       txtnome.setText(null);
       //txtidade.setText(null);
       txtsenha.setText(null);
       
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnexibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexibirActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel m = new DefaultTableModel();
            m.setRowCount(0);
            m.addColumn("ID_Medico");
            m.addColumn("nome");
            m.addColumn("dataNasc");
            m.addColumn("senha");
            m.addColumn("Especialidade");

            CtrlListarMedico mede = new CtrlListarMedico();
            ArrayList<Medico> lista = mede.listar();

            for (Medico med : lista) {
                m.addRow(new Object[]{med.getID_Medico(), med.getNome(), med.getDatanasc(), med.getSenha() ,med.getEspecialidade()});

            }
            Lista.setModel(m);
        } catch (Exception ex) {

        }

        
        txtnome.setText(null);
       // txtidade.setText(null);
        txtsenha.setText(null);
        
    }//GEN-LAST:event_btnexibirActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        // TODO add your handling code here:

        if (txtnome.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Nome é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if (txtsenha.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Senha é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        

        int resposta = 0;

        String datanasc = ano.getSelectedItem() + "-" + mes.getSelectedItem() + "-" + dia.getSelectedItem();

        String Especialidade = Comboespecialidade.getSelectedItem().toString();
        
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Fazer esse Cadastro ?");
        if (resposta == JOptionPane.YES_OPTION) {
           
            Medico cadMed = new Medico();
           
            cadMed.setNome(txtnome.getText());
            cadMed.setDatanasc(datanasc);
            cadMed.setEspecialidade(Especialidade);
            cadMed.setSenha(txtsenha.getText());
            
            CtrlCadastrarMedico CtrlCadastroMed = new CtrlCadastrarMedico();
            try {
                JOptionPane.showMessageDialog(null, CtrlCadastroMed.CadastroMedico(cadMed));
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCadastrarMedico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        // TODO add your handling code here:
     
        if (txtnome.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Nome é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (txtsenha.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "O Campo Senha é Obrigatório", "AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resposta = 0;

         int ID_Medico  =  Integer.parseInt(Lista.getValueAt(Lista.getSelectedRow(), 0).toString());
         String datanasc = ano.getSelectedItem() + "-" + mes.getSelectedItem() + "-" + dia.getSelectedItem();
        
         String Especialidade = Comboespecialidade.getSelectedItem().toString();
         
         resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Atualizar esse Cadastro ?");
         if (resposta == JOptionPane.YES_OPTION) {
            
            Medico atumed = new Medico();
            
            atumed.setID_Medico(ID_Medico);
            atumed.setNome(txtnome.getText());
            atumed.setDatanasc(datanasc);
            atumed.setEspecialidade(Especialidade);
            atumed.setSenha(txtsenha.getText());
            
            CtrlAtualizarMedico CtrlAtualizarMedico = new CtrlAtualizarMedico();

            try {
                JOptionPane.showMessageDialog(null, CtrlAtualizarMedico.atuMedico(atumed));

            } catch (SQLException ex) {
            
            }
        }
       
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:

        int resposta = 0;

        resposta = JOptionPane.showConfirmDialog(null, "Deseja Mesmo Fechar a Tela de Cadastro de Pacientes ?","AVISO !",JOptionPane.WARNING_MESSAGE);
        if(resposta == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnloginpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginpacienteActionPerformed
        // TODO add your handling code here:

        FrmTelaInicial ini = new FrmTelaInicial();
        ini.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnloginpacienteActionPerformed

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        // TODO add your handling code here:
        
        
        txtnome.setText(Lista.getValueAt(Lista.getSelectedRow(), 1).toString());
        
        txtsenha.setText(Lista.getValueAt(Lista.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_ListaMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comboespecialidade;
    private javax.swing.JTable Lista;
    private javax.swing.JLabel Tela_Cadastro_Medico;
    private javax.swing.JComboBox ano;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JToggleButton btnexcluir;
    private javax.swing.JButton btnexibir;
    private javax.swing.JButton btnloginpaciente;
    private javax.swing.JButton btnsair;
    private javax.swing.JComboBox dia;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
