/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uc15projetoatividade4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author su
 */
public class TelaOrcamento extends javax.swing.JFrame {

    private List<Orcamento> orcamentoList = new ArrayList<>();

    public TelaOrcamento() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdOrcamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeClienteOrcamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProdOrcamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQntOrcamento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorOrcamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPagamentoOrcamento = new javax.swing.JTextField();
        jButtonCadastrarOrcamento = new javax.swing.JButton();
        jButtonPesquisarOrcamento = new javax.swing.JButton();
        jButtonLimparTela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFreteOrcamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldVendedorOrcamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPrazoEntrOrcamento = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jTextFieldIdOrcamento.setToolTipText("");
        jPanel1.add(jTextFieldIdOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 230, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("CLIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jTextFieldNomeClienteOrcamento.setToolTipText("Digite aqui o nome do Cliente.");
        jPanel1.add(jTextFieldNomeClienteOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 230, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("PRODUTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jTextFieldProdOrcamento.setToolTipText("Digite aqui o nome do Produto.");
        jPanel1.add(jTextFieldProdOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 230, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("  QUANTIDADE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, -1));

        jTextFieldQntOrcamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldQntOrcamento.setToolTipText("Digite aqui a quantidade do produto");
        jTextFieldQntOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldQntOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQntOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldQntOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("VALOR UNITÁRIO R$");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jTextFieldValorOrcamento.setToolTipText("Digite aqui o preço do produto");
        jPanel1.add(jTextFieldValorOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 230, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("CONDIÇÃO DE PAGAMENTO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jTextFieldPagamentoOrcamento.setToolTipText("Digite aqui a forma de pagamento");
        jPanel1.add(jTextFieldPagamentoOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 230, -1));

        jButtonCadastrarOrcamento.setBackground(new java.awt.Color(255, 255, 153));
        jButtonCadastrarOrcamento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonCadastrarOrcamento.setForeground(new java.awt.Color(153, 0, 0));
        jButtonCadastrarOrcamento.setText("CADASTRAR");
        jButtonCadastrarOrcamento.setToolTipText("Clique aqui para Salvar o cadastro");
        jButtonCadastrarOrcamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastrarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 30));

        jButtonPesquisarOrcamento.setBackground(new java.awt.Color(255, 255, 153));
        jButtonPesquisarOrcamento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonPesquisarOrcamento.setForeground(new java.awt.Color(153, 0, 0));
        jButtonPesquisarOrcamento.setText("PESQUISAR");
        jButtonPesquisarOrcamento.setToolTipText("Clique aqui para Pesquisar o cadastro");
        jButtonPesquisarOrcamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPesquisarOrcamento.setEnabled(false);
        jButtonPesquisarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 120, 30));

        jButtonLimparTela.setBackground(new java.awt.Color(255, 255, 153));
        jButtonLimparTela.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimparTela.setForeground(new java.awt.Color(153, 0, 0));
        jButtonLimparTela.setText("LIMPAR");
        jButtonLimparTela.setToolTipText("Clique aqui para Limpar os dados da tela");
        jButtonLimparTela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparTelaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimparTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 120, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("  ** ORÇAMENTO **");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 210, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("FRETE (CIF/FOB)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jTextFieldFreteOrcamento.setToolTipText("Digite aqui qual o tipo de frete escolhido");
        jPanel1.add(jTextFieldFreteOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 230, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("VENDEDOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jTextFieldVendedorOrcamento.setToolTipText("Digite aqui o nome do Vendedor");
        jPanel1.add(jTextFieldVendedorOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 230, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("PRAZO DE ENTREGA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jTextFieldPrazoEntrOrcamento.setToolTipText("Digite aqui o prazo de entrega desse produto");
        jPanel1.add(jTextFieldPrazoEntrOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 230, -1));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem1.setText("Tela Inicial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarOrcamentoActionPerformed

    private void jButtonCadastrarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarOrcamentoActionPerformed
        // TODO add your handling code here:
        inserirOrcamento(getOrcamento());

        JOptionPane.showMessageDialog(null, "Orçamento cadastrado com sucesso!");

        jTextFieldIdOrcamento.setText("");
        jTextFieldNomeClienteOrcamento.setText("");
        jTextFieldProdOrcamento.setText("");
        jTextFieldQntOrcamento.setText("");
        jTextFieldValorOrcamento.setText("");
        jTextFieldPagamentoOrcamento.setText("");
        jTextFieldFreteOrcamento.setText("");
        jTextFieldVendedorOrcamento.setText("");
        jTextFieldPrazoEntrOrcamento.setText("");

    }//GEN-LAST:event_jButtonCadastrarOrcamentoActionPerformed

    private void jButtonLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparTelaActionPerformed
        // TODO add your handling code here:
        
        jTextFieldIdOrcamento.setText("");
        jTextFieldNomeClienteOrcamento.setText("");
        jTextFieldProdOrcamento.setText("");
        jTextFieldQntOrcamento.setText("");
        jTextFieldValorOrcamento.setText("");
        jTextFieldPagamentoOrcamento.setText("");
        jTextFieldFreteOrcamento.setText("");
        jTextFieldVendedorOrcamento.setText("");
        jTextFieldPrazoEntrOrcamento.setText("");
        
    }//GEN-LAST:event_jButtonLimparTelaActionPerformed

    private void jTextFieldQntOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQntOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQntOrcamentoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarOrcamento;
    private javax.swing.JButton jButtonLimparTela;
    private javax.swing.JButton jButtonPesquisarOrcamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldFreteOrcamento;
    private javax.swing.JTextField jTextFieldIdOrcamento;
    private javax.swing.JTextField jTextFieldNomeClienteOrcamento;
    private javax.swing.JTextField jTextFieldPagamentoOrcamento;
    private javax.swing.JTextField jTextFieldPrazoEntrOrcamento;
    private javax.swing.JTextField jTextFieldProdOrcamento;
    private javax.swing.JTextField jTextFieldQntOrcamento;
    private javax.swing.JTextField jTextFieldValorOrcamento;
    private javax.swing.JTextField jTextFieldVendedorOrcamento;
    // End of variables declaration//GEN-END:variables

    public Orcamento getOrcamento() {

        Orcamento orcamento = new Orcamento();

        orcamento.setId(jTextFieldIdOrcamento.getText());
        orcamento.setCliente(jTextFieldNomeClienteOrcamento.getText());
        orcamento.setProduto(jTextFieldProdOrcamento.getText());
        orcamento.setQuant(jTextFieldQntOrcamento.getText());
        orcamento.setValorUnitario(jTextFieldValorOrcamento.getText());
        orcamento.setCondPagamento(jTextFieldPagamentoOrcamento.getText());
        orcamento.setFrete(jTextFieldFreteOrcamento.getText());
        orcamento.setVendedor(jTextFieldVendedorOrcamento.getText());
        orcamento.setPrazoEntrega(jTextFieldPrazoEntrOrcamento.getText());

        return orcamento;
    }

    public void inserirOrcamento(Orcamento orcamento) {

        orcamentoList.add(orcamento);

    }
}
