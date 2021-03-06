/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DicionarioSpanish;
import controller.DicionarioEnglishAmerican;
import controller.DicionarioPortugueseBrazilian;
import model.Ordenacao;
import static view.TelaMenuIdiomas.pais;

/**
 *
 * @author Sam Gatoo
 */
public class TelaBusca extends javax.swing.JFrame {

    Ordenacao vetor = new Ordenacao();

    /**
     * Creates new form TelaBusca
     */
    public TelaBusca() {
        initComponents();

        switch (pais) {
            case 1: {
                jLabel6.setText("DICIONARIO PORTUGUES");
                break;
            }
            case 2: {
                jLabel6.setText("DICIONARIO INGLES");
                break;
            }
            case 3: {
                jLabel6.setText("DICIONARIO ESPANHOL");
                break;
            }
            default: {
                jLabel6.setText("SELECIONE UM DICIONARIO");
                break;
            }
        }
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
        jButtonSequencial = new javax.swing.JButton();
        jButtonBinário = new javax.swing.JButton();
        jTextFieldPalavraBusca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldResultadoSequencial = new javax.swing.JTextField();
        jTextFieldResultadoBinario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel1.setText("Escolha uma busca");

        jButtonSequencial.setText("Sequencial");
        jButtonSequencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSequencialActionPerformed(evt);
            }
        });

        jButtonBinário.setText("Binário");
        jButtonBinário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinárioActionPerformed(evt);
            }
        });

        jTextFieldPalavraBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPalavraBuscaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        jLabel2.setText("Resultados");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Digite a palavra desejada");

        jTextFieldResultadoSequencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultadoSequencialActionPerformed(evt);
            }
        });

        jTextFieldResultadoBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultadoBinarioActionPerformed(evt);
            }
        });

        jLabel4.setText("------------------------");

        jLabel5.setText("------------------------");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBinário, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldResultadoSequencial)
                    .addComponent(jTextFieldResultadoBinario))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPalavraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPalavraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldResultadoSequencial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBinário, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldResultadoBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldResultadoBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultadoBinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoBinarioActionPerformed

    private void jTextFieldPalavraBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPalavraBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPalavraBuscaActionPerformed

    private void jButtonSequencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSequencialActionPerformed
        // TODO add your handling code here:
        jTextFieldResultadoSequencial.setText("");
        switch (pais) {
            case 1: {
                long start = System.currentTimeMillis();
                //DICIONARIO PORTUGUÊS
                DicionarioPortugueseBrazilian port = new DicionarioPortugueseBrazilian();
                port.LerPortugueseBrazilian();
                String saida = vetor.BuscaSeq(port.getDicionarioPortugueseBrazilian(), jTextFieldPalavraBusca.getText());
                long finish = System.currentTimeMillis();
                float total = finish - start;
                total = total / 1000;
                jTextFieldResultadoSequencial.setText("A busca sequencial da palavra '" + saida + "' demorou " + total + " - Segundos");
                break;

            }
            case 2: {
                long start = System.currentTimeMillis();
                //DICIONARIO INGLÊS
                DicionarioEnglishAmerican eng = new DicionarioEnglishAmerican();
                eng.LerEnglishAmerican();
                String saida = vetor.BuscaSeq(eng.getDicionarioOriginalEnglishAmerican(), jTextFieldPalavraBusca.getText());
                long finish = System.currentTimeMillis();
                float total = finish - start;
                total = total / 1000;
                jTextFieldResultadoSequencial.setText("A busca sequencial da palavra '" + saida + "' demorou " + total + " - Segundos");
                break;
            }
            case 3: {
                long start = System.currentTimeMillis();
                //DICIONARIO ESPANHOL
                DicionarioSpanish span = new DicionarioSpanish();
                span.LerSpanish();
                String saida = vetor.BuscaSeq(span.getDicionarioOriginalSpanish(), jTextFieldPalavraBusca.getText());
                long finish = System.currentTimeMillis();
                float total = finish - start;
                total = total / 1000;
                jTextFieldResultadoSequencial.setText("A busca sequencial da palavra '" + saida + "' demorou " + total + " - Segundos");
                break;
            }
            default: {

            }
        }
    }//GEN-LAST:event_jButtonSequencialActionPerformed

    private void jButtonBinárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinárioActionPerformed
        // TODO add your handling code here:
        jTextFieldResultadoBinario.setText("");
        switch (pais) {
            case 3: {
                long start = System.currentTimeMillis();
                //DICIONARIO ESPANHOL
                DicionarioSpanish span = new DicionarioSpanish();
                span.LerSpanish();
                vetor.MergeSort(span.getDicionarioOriginalSpanish(), span.getDicionarioOriginalSpanish().length);
                String saida = vetor.BuscaBinTamanho(span.getDicionarioOriginalSpanish(), jTextFieldPalavraBusca.getText(), 0, span.getDicionarioOriginalSpanish().length);
                long finish = System.currentTimeMillis();
                float total = finish - start;
                total = total / 1000;
                jTextFieldResultadoBinario.setText("A busca Binária da palavra '" + saida + "' demorou " + total + " - Segundos");
                break;
            }
            case 2: {
                long start = System.currentTimeMillis();
                //DICIONARIO INGLÊS
                DicionarioEnglishAmerican eng = new DicionarioEnglishAmerican();
                eng.LerEnglishAmerican();
                vetor.MergeSort(eng.getDicionarioOriginalEnglishAmerican(), eng.getDicionarioOriginalEnglishAmerican().length);
                String saida = vetor.BuscaBinTamanho(eng.getDicionarioOriginalEnglishAmerican(), jTextFieldPalavraBusca.getText(), 0, eng.getDicionarioOriginalEnglishAmerican().length);
                long finish = System.currentTimeMillis();
                float total = finish - start;
                total = total / 1000;
                jTextFieldResultadoBinario.setText("A busca Binária da palavra '" + saida + "' demorou " + total + " - Segundos");
                break;
            }
            case 1: {
                long start = System.currentTimeMillis();
                //DICIONARIO PORTUGUÊS
                DicionarioPortugueseBrazilian port = new DicionarioPortugueseBrazilian();
                port.LerPortugueseBrazilian();
                vetor.MergeSort(port.getDicionarioPortugueseBrazilian(), port.getDicionarioPortugueseBrazilian().length);
                String saida = vetor.BuscaBinTamanho(port.getDicionarioPortugueseBrazilian(), jTextFieldPalavraBusca.getText(), 0, port.getDicionarioPortugueseBrazilian().length);
                long finish = System.currentTimeMillis();
                float total = finish - start;
                total = total / 1000;
                jTextFieldResultadoBinario.setText("A busca Binária da palavra '" + saida + "' demorou " + total + " - Segundos");
                break;
            }
            default:
                break;
        }
    }//GEN-LAST:event_jButtonBinárioActionPerformed

    private void jTextFieldResultadoSequencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultadoSequencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoSequencialActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaMenuIdiomas nova = new TelaMenuIdiomas();
        this.dispose();
        nova.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBinário;
    private javax.swing.JButton jButtonSequencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldPalavraBusca;
    private javax.swing.JTextField jTextFieldResultadoBinario;
    private javax.swing.JTextField jTextFieldResultadoSequencial;
    // End of variables declaration//GEN-END:variables
}
