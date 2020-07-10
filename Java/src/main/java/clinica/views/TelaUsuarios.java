/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.views;

import clinica.dao.UsuarioDAO;
import clinica.model.Usuario;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author steph
 */
public class TelaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosCadastrados
     */
    public TelaUsuarios() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabela = new javax.swing.JTable();
        JBNovo = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBVoltar = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        JTNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setText("Clinica du Gustin");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel2.setText("Usuários Cadastrados");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");

        JBPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pesquisar20px.png"))); // NOI18N
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data de Nascimento", "Grupo de Risco", "Cidade", "Tpo de Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTabela);

        JBNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novo20px.png"))); // NOI18N
        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        JBAlterar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alterar20px.png"))); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excluir20px.png"))); // NOI18N
        JBExcluir.setText("Excluir");
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
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

        JBSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair16px.png"))); // NOI18N
        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        JTNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBPesquisar)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(JBNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBAlterar)
                .addGap(117, 117, 117)
                .addComponent(JBExcluir)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(JBVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JBPesquisar)
                    .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNovo)
                    .addComponent(JBAlterar)
                    .addComponent(JBExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(JBSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        TelaAddUsuario tela = new TelaAddUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        final int idx = JTabela.getSelectedRow();

        if (idx < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário!!!");
        } else {
            Usuario usuario = listaUsuarios.get(idx);    
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            
            try {
                usuarioDAO.apagar(usuario);
                listaUsuarios.remove(idx);
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }            
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        final int idx = JTabela.getSelectedRow();

        if (idx < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário!!!");
        } else {
            TelaAddUsuario tela = new TelaAddUsuario();
            tela.preparedEdit(listaUsuarios.get(idx), "Editar");
            tela.setVisible(true);       
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        if("".equals(JTNome.getText())){            
            try {
                preencheTable();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            DefaultTableModel dftm = (DefaultTableModel) JTabela.getModel();

            while (dftm.getRowCount() > 0) {
                dftm.removeRow(0);
            }

            String nome = JTNome.getText();
            Usuario usuario = new Usuario();
            
            try {
                usuario = new UsuarioDAO().buscarPeloNome(nome);
            } catch (SQLException ex) {
                Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            listaUsuarios = new ArrayList<Usuario>();
            listaUsuarios.add(usuario);
            
            if(usuario == null || usuario.getId() == 0){
                JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado por esse nome");
            }
            else{
                for (Usuario u : listaUsuarios) {
                    String[] coluna = new String[6];
                    coluna[0] = u.getId() + "";
                    coluna[1] = u.getNome();
                    coluna[2] = u.getDataNasc().toString(); 
                    coluna[3] = u.getGrupoRisco() + "";
                    coluna[4] = u.getCidade();
                    coluna[5] = u.getTipoUsuario().toString();
                    dftm.addRow(coluna);
                }
            }
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preencheTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void preencheTable() throws ClassNotFoundException {
        DefaultTableModel dftm = (DefaultTableModel) JTabela.getModel();

        while (dftm.getRowCount() > 0) {
            dftm.removeRow(0);
        }
        
        /*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate= formatter.format( obj.getData());*/
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        
        try {
            listaUsuarios = new UsuarioDAO().buscarTodos();
            for (Usuario u : listaUsuarios) {
                String[] coluna = new String[6];
                coluna[0] = u.getId() + "";
                coluna[1] = u.getNome();
                coluna[2] = formatter.format(u.getDataNasc()).toString(); 
                coluna[3] = u.getGrupoRisco() + "";
                coluna[4] = u.getCidade();
                coluna[5] = u.getTipoUsuario().toString();
                dftm.addRow(coluna);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os usuários");
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
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBSair;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTable JTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Usuario> listaUsuarios;
}
