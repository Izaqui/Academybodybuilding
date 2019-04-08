/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Dao.DaoAlunoImpl;
import Entidades.Aluno;
import java.awt.Component;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import tipoSexo.Sexo;

/**
 *
 * @author kiel
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    private String email;
    private DaoAlunoImpl daoAluno;
    public TelaCadastro() {
        initComponents();
    }

    public TelaCadastro(String email) {
        initComponents();
        this.email = email;
        daoAluno = new DaoAlunoImpl();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jFCpf = new javax.swing.JFormattedTextField();
        jTEndereco = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jFTelefone = new javax.swing.JFormattedTextField();
        jFNascimento = new javax.swing.JFormattedTextField();
        jFIngresso = new javax.swing.JFormattedTextField();
        jCPagamento = new javax.swing.JComboBox<>();
        jCStatus = new javax.swing.JComboBox<>();
        jBsalvar = new javax.swing.JButton();
        jBvoltar = new javax.swing.JButton();
        jCSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(231, 236, 241));

        jLabel1.setForeground(new java.awt.Color(231, 237, 243));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/kiel/NetBeansProjects/Academybodybuilding/src/telas/Imagens/msc.gif")); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Cpf:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("E-mail:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Data de Nascimento:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Data de Ingresso:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText("Tipo de Pagamento:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setText("Status:");

        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });

        try {
            jFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCpfActionPerformed(evt);
            }
        });

        jTEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEnderecoActionPerformed(evt);
            }
        });

        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTelefoneActionPerformed(evt);
            }
        });

        try {
            jFNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFNascimentoActionPerformed(evt);
            }
        });

        try {
            jFIngresso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFIngressoActionPerformed(evt);
            }
        });

        jCPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão" }));
        jCPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPagamentoActionPerformed(evt);
            }
        });

        jCStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Devedor" }));

        jBsalvar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        jBvoltar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        jCSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(23, 23, 23)
                        .addComponent(jCPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(jFIngresso))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFCpf)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTEndereco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jFTelefone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFNascimento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(219, 219, 219)
                        .addComponent(jCStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43))
                            .addComponent(jBvoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBvoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jBsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        Menu obj;       
       // TODO add your handling code here:;
        obj = new Menu();  
        Component add;        
        //add = Login.add(obj);
        obj.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        try {
            
            novoAluno();
            
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed

         // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCpfActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCpfActionPerformed

    private void jTEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEnderecoActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEnderecoActionPerformed

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void jFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTelefoneActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTelefoneActionPerformed

    private void jFNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFNascimentoActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jFNascimentoActionPerformed

    private void jFIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFIngressoActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jFIngressoActionPerformed

    private void jCPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPagamentoActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalvar;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JComboBox<String> jCPagamento;
    private javax.swing.JComboBox<String> jCSexo;
    private javax.swing.JComboBox<String> jCStatus;
    private javax.swing.JFormattedTextField jFCpf;
    private javax.swing.JFormattedTextField jFIngresso;
    private javax.swing.JFormattedTextField jFNascimento;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables

    private void novoAluno() throws IOException, ClassNotFoundException {
                
        String nome = jTNome.getText();
        String cpf = jFCpf.getText();
        String endereco = jTEndereco.getText();
        String emailAluno = jTEmail.getText();
        String telefone = jFTelefone.getText();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String sNascimento = jFNascimento.getText();
        LocalDate nascimento = LocalDate.parse(sNascimento, formato);
        
        String sIngresso = jFIngresso.getText();
        LocalDate ingresso = LocalDate.parse(sIngresso, formato);
        
        Enum sexo = null;
        for(int i=0; i<2; i++){
            if(jCSexo.getSelectedIndex()== 0){
                sexo = Sexo.MASCULINO;
            }
            else
                sexo = Sexo.FEMININO;
        }
        
        
        String pagamento = "";
        for(int i=0; i<2; i++){
            if(jCPagamento.getSelectedIndex()== 0){
                pagamento ="Dinheiro";
            }
            else
                pagamento = "Cartão";
        }
        String status ="";
        for(int i=0; i<2; i++){
            if(jCStatus.getSelectedIndex()== 0){
                status ="Pago";
            }
            else
                status = "Devedor";
        }
        
        
        Aluno a = new Aluno(nome, sexo, cpf, endereco, emailAluno, telefone, nascimento, ingresso, pagamento, status);
        daoAluno.addAluno(a);
        
        new Menu(email).setVisible(true);
        this.dispose();
        
        
    }

    
}
