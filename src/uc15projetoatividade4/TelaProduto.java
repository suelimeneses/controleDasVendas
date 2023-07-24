package uc15projetoatividade4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaProduto extends javax.swing.JFrame {

     private List<Produto> produtoList = new ArrayList<>();
     
    public TelaProduto() {
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
        jTextFieldIdProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescrProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUnMedidaProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorUnitProduto = new javax.swing.JTextField();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jButtonLimparTela = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFornecedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEstoqueProduto = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("      ** PRODUTO **");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));
        jPanel1.add(jTextFieldIdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 230, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("DESCRIÇÃO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jTextFieldDescrProduto.setToolTipText("Digite aqui o nome do Produto");
        jPanel1.add(jTextFieldDescrProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 230, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("UNID. MEDIDA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextFieldUnMedidaProduto.setToolTipText("Digite aqui se o produto é em pç ou mt etc.");
        jPanel1.add(jTextFieldUnMedidaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("VALOR UNITÁRIO R$");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextFieldValorUnitProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldValorUnitProduto.setToolTipText("Digite aqui o preço de compra do produto");
        jTextFieldValorUnitProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldValorUnitProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 230, -1));

        jButtonCadastrarProduto.setBackground(new java.awt.Color(255, 255, 153));
        jButtonCadastrarProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonCadastrarProduto.setForeground(new java.awt.Color(153, 0, 0));
        jButtonCadastrarProduto.setText("CADASTRAR");
        jButtonCadastrarProduto.setToolTipText("Clique aqui para Salvar o cadastro");
        jButtonCadastrarProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 30));

        jButtonPesquisarProduto.setBackground(new java.awt.Color(255, 255, 153));
        jButtonPesquisarProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonPesquisarProduto.setForeground(new java.awt.Color(153, 0, 0));
        jButtonPesquisarProduto.setText("PESQUISAR");
        jButtonPesquisarProduto.setToolTipText("Clique aqui para Pesquisar o cadastro");
        jButtonPesquisarProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPesquisarProduto.setEnabled(false);
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, 30));

        jButtonLimparTela.setBackground(new java.awt.Color(255, 255, 153));
        jButtonLimparTela.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimparTela.setForeground(new java.awt.Color(153, 0, 0));
        jButtonLimparTela.setText("LIMPAR");
        jButtonLimparTela.setToolTipText("Clique aqui para Limpar os dados da Tela.");
        jButtonLimparTela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparTelaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimparTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("FORNECEDOR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jTextFieldFornecedor.setToolTipText("Digite aqui o nome do Fornecedor");
        jPanel1.add(jTextFieldFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 230, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("ESTOQUE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jTextFieldEstoqueProduto.setToolTipText("Digite aqui o quantidade desse produto tem no estoque");
        jPanel1.add(jTextFieldEstoqueProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 230, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jButtonLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparTelaActionPerformed
        // TODO add your handling code here:
         jTextFieldIdProduto.setText("");
        jTextFieldDescrProduto.setText("");
        jTextFieldUnMedidaProduto.setText("");
        jTextFieldValorUnitProduto.setText("");
        jTextFieldFornecedor.setText("");
        jTextFieldEstoqueProduto.setText("");
        
    }//GEN-LAST:event_jButtonLimparTelaActionPerformed

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        
        inserirProduto(getProduto());

        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

         jTextFieldIdProduto.setText("");
        jTextFieldDescrProduto.setText("");
        jTextFieldUnMedidaProduto.setText("");
        jTextFieldValorUnitProduto.setText("");
        jTextFieldFornecedor.setText("");
        jTextFieldEstoqueProduto.setText("");
        
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonLimparTela;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDescrProduto;
    private javax.swing.JTextField jTextFieldEstoqueProduto;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldIdProduto;
    private javax.swing.JTextField jTextFieldUnMedidaProduto;
    private javax.swing.JTextField jTextFieldValorUnitProduto;
    // End of variables declaration//GEN-END:variables
 
    public Produto getProduto() {

        Produto produto = new Produto();

        produto.setId(jTextFieldIdProduto.getText());
        produto.setDescricao(jTextFieldDescrProduto.getText());
        produto.setUnMedida(jTextFieldUnMedidaProduto.getText());
        produto.setValorUnitario(jTextFieldValorUnitProduto.getText());
        produto.setFornecedor(jTextFieldFornecedor.getText());
        produto.setEstoque(jTextFieldEstoqueProduto.getText());


        return produto;
    }

    public void inserirProduto(Produto produto) {

        produtoList.add(produto);

    }
}