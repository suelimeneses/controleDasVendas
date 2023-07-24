/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uc15projetoatividade4;

/**
 *
 * @author su
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        jButtonFornecedor = new javax.swing.JButton();
        jButtonProduto = new javax.swing.JButton();
        jButtonOrcamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Escolha uma das opções abaixo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 320, 30));

        jButtonCliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(51, 0, 51));
        jButtonCliente.setText("CLIENTE");
        jButtonCliente.setToolTipText("Clique aqui para acessar a Tela Cliente");
        jButtonCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, -1));

        jButtonFornecedor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonFornecedor.setForeground(new java.awt.Color(51, 0, 51));
        jButtonFornecedor.setText("FORNECEDOR");
        jButtonFornecedor.setToolTipText("Clique aqui para acessar a Tela Fornecedor");
        jButtonFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, -1));

        jButtonProduto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonProduto.setForeground(new java.awt.Color(51, 0, 51));
        jButtonProduto.setText("PRODUTO");
        jButtonProduto.setToolTipText("Clique aqui para acessar a Tela Produto");
        jButtonProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, -1));

        jButtonOrcamento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonOrcamento.setForeground(new java.awt.Color(51, 0, 51));
        jButtonOrcamento.setText("ORÇAMENTO");
        jButtonOrcamento.setToolTipText("Clique aqui para acessar a Tela Orçamento");
        jButtonOrcamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        // TODO add your handling code here:
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setVisible(true);

    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed
        // TODO add your handling code here:

        TelaProduto telaProduto = new TelaProduto();
        telaProduto.setVisible(true);

    }//GEN-LAST:event_jButtonProdutoActionPerformed

    private void jButtonFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorActionPerformed
        // TODO add your handling code here:
        TelaFornecedor telaFornecedor = new TelaFornecedor();
        telaFornecedor.setVisible(true);

    }//GEN-LAST:event_jButtonFornecedorActionPerformed

    private void jButtonOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrcamentoActionPerformed
        // TODO add your handling code here:

        TelaOrcamento telaOrcamento = new TelaOrcamento();
        telaOrcamento.setVisible(true);

    }//GEN-LAST:event_jButtonOrcamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonFornecedor;
    private javax.swing.JButton jButtonOrcamento;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
