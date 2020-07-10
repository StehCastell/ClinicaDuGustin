/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.views;

import clinica.dao.UsuarioDAO;
import clinica.enums.ETipoUsuario;
import clinica.model.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author steph
 */
public class TelaAddUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarUsuario
     */
    public TelaAddUsuario() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLLogin = new javax.swing.JLabel();
        JLSenha = new javax.swing.JLabel();
        JLNome = new javax.swing.JLabel();
        JLDataNasc = new javax.swing.JLabel();
        JLGrupoRisco = new javax.swing.JLabel();
        JLCidade = new javax.swing.JLabel();
        JBSalvar = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        JBVoltar = new javax.swing.JButton();
        JTLogin = new javax.swing.JTextField();
        JTSenha = new javax.swing.JTextField();
        JTNome = new javax.swing.JTextField();
        FTDataNasc = new javax.swing.JTextField();
        JRSim = new javax.swing.JRadioButton();
        JRNao = new javax.swing.JRadioButton();
        JTCidade = new javax.swing.JTextField();
        JLTipoUsuario = new javax.swing.JLabel();
        JCTipoUsuario = new javax.swing.JComboBox<>();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setText("Clinica du Gustin");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel2.setText("Cadastrar Usuário");

        JLLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLLogin.setText("Login:");

        JLSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLSenha.setText("Senha:");

        JLNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLNome.setText("Nome:");

        JLDataNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLDataNasc.setText("Data de Nascimento: ");

        JLGrupoRisco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLGrupoRisco.setText("Grupo de Risco:");

        JLCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLCidade.setText("Cidade:");

        JBSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar20px.png"))); // NOI18N
        JBSalvar.setText("Salvar");
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JBSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair16px.png"))); // NOI18N
        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        JBVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar20px.png"))); // NOI18N
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JTLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        JTSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        JTNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        FTDataNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        buttonGroup1.add(JRSim);
        JRSim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JRSim.setSelected(true);
        JRSim.setText("Sim");

        buttonGroup1.add(JRNao);
        JRNao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JRNao.setText("Não");

        JTCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        JLTipoUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLTipoUsuario.setText("Tipo de Usuário:");

        JCTipoUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JCTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(JBVoltar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBSair))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JLSenha)
                                        .addComponent(JLLogin)
                                        .addComponent(JLNome)
                                        .addComponent(JLDataNasc)
                                        .addComponent(JLGrupoRisco)
                                        .addComponent(JLCidade)
                                        .addComponent(JLTipoUsuario))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(JRSim)
                                            .addGap(18, 18, 18)
                                            .addComponent(JRNao))
                                        .addComponent(JTCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(FTDataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(JTNome)
                                            .addComponent(JTSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTLogin))
                                        .addComponent(JCTipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(JBSalvar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLogin)
                    .addComponent(JTLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSenha)
                    .addComponent(JTSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNome)
                    .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDataNasc)
                    .addComponent(FTDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLGrupoRisco)
                    .addComponent(JRSim)
                    .addComponent(JRNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCidade)
                    .addComponent(JTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTipoUsuario)
                    .addComponent(JCTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(JBSair))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCTipoUsuarioActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        try{
            if(!"".equals(JTLogin.getText()) && !"".equals(JTSenha.getText()) && !"".equals(JTNome.getText()) 
               && !"".equals(FTDataNasc.getText()) /*&& !"".equals(JTEndereco.getText()) */ 
               && !"".equals(JTCidade.getText()))
            {
                String login = JTLogin.getText();
                String senha = JTSenha.getText();
                String nome = JTNome.getText(); 
                String tipoUsuario = (String) JCTipoUsuario.getSelectedItem();                
                ETipoUsuario eTipoUsuario = ETipoUsuario.valueOf(tipoUsuario);
                
                SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
                Date datanasc = stf.parse(FTDataNasc.getText()); 
                
                Boolean grupoRisco = false;
                if(JRSim.isSelected()){
                    grupoRisco = true;
                }
                else if(JRNao.isSelected()){
                    grupoRisco = false;
                }
                
                String cidade = JTCidade.getText(); 
  
                Usuario usuario;
                
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                
                if(operacao == null){
                    usuario = new Usuario(0, eTipoUsuario, login, senha, nome, datanasc, grupoRisco, cidade);
                    usuarioDAO.salvar(usuario);
                }
                else if(operacao.equals("Editar")){
                    usuario = new Usuario(usuarioGlobal.getId(), eTipoUsuario, login, senha, nome, datanasc, grupoRisco, cidade);
                    usuarioDAO.alterar(usuario);
                }
                
                JOptionPane.showMessageDialog(null, "Operação realizada com Sucesso!!!");
                setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Campos login, senha, nome, data de nascimento, \n grupo de risco e cidade sao obrigatórios.");
            }  
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencheCombo();
    }//GEN-LAST:event_formWindowOpened

    String[] dados = {"CADASTRO", "RESPONSAVELTECNICO", "SUPERVISOR", "PACIENTE", "ADMINISTRADOR"};
    
    private void preencheCombo() {        
        
        JCTipoUsuario.removeAllItems(); 

        for(int i = 0; i < dados.length; i++) {
            JCTipoUsuario.addItem(dados[i]);
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FTDataNasc;
    private javax.swing.JButton JBSair;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JComboBox<String> JCTipoUsuario;
    private javax.swing.JLabel JLCidade;
    private javax.swing.JLabel JLDataNasc;
    private javax.swing.JLabel JLGrupoRisco;
    private javax.swing.JLabel JLLogin;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLSenha;
    private javax.swing.JLabel JLTipoUsuario;
    private javax.swing.JRadioButton JRNao;
    private javax.swing.JRadioButton JRSim;
    private javax.swing.JTextField JTCidade;
    private javax.swing.JTextField JTLogin;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTSenha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private Usuario usuarioGlobal;
    private String operacao;
    
    void preparedEdit(Usuario user, String op) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        this.usuarioGlobal = user;
        this.operacao = op;

        JTLogin.setText(usuarioGlobal.getLogin());
        JTSenha.setText(usuarioGlobal.getSenha());
        JTNome.setText(usuarioGlobal.getNome());
        JCTipoUsuario.setSelectedItem(usuarioGlobal.getTipoUsuario());
        FTDataNasc.setText(formatter.format(usuarioGlobal.getDataNasc()).toString());
        JRSim.setSelected(usuarioGlobal.getGrupoRisco());
        JRNao.setSelected(!usuarioGlobal.getGrupoRisco());
        JTCidade.setText(usuarioGlobal.getCidade());
    }
}
