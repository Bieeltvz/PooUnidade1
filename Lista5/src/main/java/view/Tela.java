/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Ponto;
import model.Quadrante;
import static model.Quadrante.PRIMEIRO;

/**
 *
 * @author gtvargas
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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
        jTFeixoX = new javax.swing.JTextField();
        jTFeixoY = new javax.swing.JTextField();
        jBtnAvaliar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCbincideX = new javax.swing.JCheckBox();
        jCbincideY = new javax.swing.JCheckBox();
        jCbprimeiro = new javax.swing.JCheckBox();
        jCbsegundo = new javax.swing.JCheckBox();
        jCbterceiro = new javax.swing.JCheckBox();
        jCbquarto = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Eixo X:");

        jLabel2.setText("Eixo Y:");

        jBtnAvaliar.setText("Avaliar");
        jBtnAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAvaliarActionPerformed(evt);
            }
        });

        jLabel3.setText("Posição:");

        jCbincideX.setText("Incide sobre o eixo X");
        jCbincideX.setEnabled(false);

        jCbincideY.setText("Incide Eixo Y");
        jCbincideY.setEnabled(false);

        jCbprimeiro.setText("No primeiro Quadrante");
        jCbprimeiro.setEnabled(false);

        jCbsegundo.setText("No segundo Quadrante");
        jCbsegundo.setEnabled(false);

        jCbterceiro.setText("No terceiro Quadrante");
        jCbterceiro.setEnabled(false);

        jCbquarto.setText("No quarto Quadrante");
        jCbquarto.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFeixoX, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jTFeixoY)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(38, 38, 38)
                        .addComponent(jBtnAvaliar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCbincideY)
                            .addComponent(jCbincideX)
                            .addComponent(jCbprimeiro)
                            .addComponent(jCbsegundo)
                            .addComponent(jCbterceiro)
                            .addComponent(jCbquarto))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFeixoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFeixoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jBtnAvaliar)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCbincideX))
                .addGap(18, 18, 18)
                .addComponent(jCbincideY)
                .addGap(17, 17, 17)
                .addComponent(jCbprimeiro)
                .addGap(18, 18, 18)
                .addComponent(jCbsegundo)
                .addGap(18, 18, 18)
                .addComponent(jCbterceiro)
                .addGap(18, 18, 18)
                .addComponent(jCbquarto)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAvaliarActionPerformed
        limparQuadrantes();
        int x = Integer.parseInt(jTFeixoX.getText());
        int y = Integer.parseInt(jTFeixoY.getText());

        Ponto ponto = new Ponto(x, y);

        switch (ponto.identificarQuadrante()) {
            case PRIMEIRO:
                jCbprimeiro.setSelected(true);
                break;
            case SEGUNDO:
                jCbsegundo.setSelected(true);
                break;
            case TERCEIRO:
                jCbterceiro.setSelected(true);
                break;
            case QUARTO:
                jCbquarto.setSelected(true);
                break;
            default:
                if (ponto.estaIncidindoSobreX()) {
                    jCbincideX.setSelected(true);
                } else {
                    jCbincideY.setSelected(true);
                }
        }

    }

    public void limparQuadrantes() {
        jCbincideX.setSelected(false);
        jCbincideY.setSelected(false);
        jCbprimeiro.setSelected(false);
        jCbsegundo.setSelected(false);
        jCbterceiro.setSelected(false);
        jCbquarto.setSelected(false);
    }//GEN-LAST:event_jBtnAvaliarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAvaliar;
    private javax.swing.JCheckBox jCbincideX;
    private javax.swing.JCheckBox jCbincideY;
    private javax.swing.JCheckBox jCbprimeiro;
    private javax.swing.JCheckBox jCbquarto;
    private javax.swing.JCheckBox jCbsegundo;
    private javax.swing.JCheckBox jCbterceiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTFeixoX;
    private javax.swing.JTextField jTFeixoY;
    // End of variables declaration//GEN-END:variables
}
