/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.views;

/**
 *
 * @author steph
 */
public class TelaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdministrador
     */
    public TelaAdministrador() {
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

        JLTitulo = new javax.swing.JLabel();
        JBCadastrar = new javax.swing.JButton();
        JBCadastrados = new javax.swing.JButton();
        JLSubTitulo = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLTitulo.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        JLTitulo.setText("Clinica du Gustin");

        JBCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBCadastrados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBCadastrados.setText("Cadastrados");
        JBCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastradosActionPerformed(evt);
            }
        });

        JLSubTitulo.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        JLSubTitulo.setText("Usuários");

        JBVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar20px.png"))); // NOI18N
        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JBSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair16px.png"))); // NOI18N
        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(JBVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(JLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(JLSubTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addGap(27, 27, 27)
                .addComponent(JLSubTitulo)
                .addGap(38, 38, 38)
                .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(JBSair))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        TelaAddUsuario tela = new TelaAddUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastradosActionPerformed
        TelaUsuarios tela = new TelaUsuarios();
        tela.setVisible(true);
    }//GEN-LAST:event_JBCadastradosActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrados;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBSair;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLSubTitulo;
    private javax.swing.JLabel JLTitulo;
    // End of variables declaration//GEN-END:variables
}