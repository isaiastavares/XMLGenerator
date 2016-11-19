/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.view;

import javax.swing.JOptionPane;

import br.ufg.inf.corretor.CorretorOrtografico;
import br.ufg.inf.generator.XML;

/**
 *
 * @author Hiago
 */
public class M_RoteiroAnalise extends javax.swing.JFrame {

    static boolean flag = false;
    static String mes = "Agosto";
    static int declaracaoConfomidade = 0;

    public static int isDeclaracaoConfomidade() {
        return declaracaoConfomidade;
    }

    public static String getMes() {
        return mes;
    }

    public static void setFlag(boolean flag) {
        M_RoteiroAnalise.flag = flag;
    }

    public static boolean isFlag() {
        return flag;
    }

    public M_RoteiroAnalise() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.escolha.removeAllItems();
        this.escolha.addItem("Janeiro");
        this.escolha.addItem("Fevereiro");
        this.escolha.addItem("Março");
        this.escolha.addItem("Abril");
        this.escolha.addItem("Maio");
        this.escolha.addItem("Junho");
        this.escolha.addItem("Julho");
        this.escolha.addItem("Agosto");
        this.escolha.addItem("Setembro");
        this.escolha.addItem("Outubro");
        this.escolha.addItem("Novembro");
        this.escolha.addItem("Dezembro");
        escolha.setSelectedIndex(7);
        buttonGroup1.add(sim);
        buttonGroup1.add(nao);
        versaoAto.setText(C_OTC.getVersao());
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        versaoAto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        versaoRoteiro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        escolha = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sim = new javax.swing.JRadioButton();
        nao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações do Roteiro de Análise");

        ok.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Informações do Roteiro de Análise Funcional");
        jLabel1.setEnabled(false);

        versaoAto.setText("02.02");

        jLabel4.setText("Versão do Roteiro de Análise Funcional");

        versaoRoteiro.setText("1.0 aplicavel a 02.02");
        versaoRoteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versaoRoteiroActionPerformed(evt);
            }
        });

        jLabel5.setText("Versão do ER (Ato Cotepe)");

        escolha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mês" }));
        escolha.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                escolhaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                escolhaPopupMenuWillBecomeVisible(evt);
            }
        });
        escolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mês lançamento do roteiro");

        jLabel3.setText("Ano lançamento do roteiro");

        ano.setText("2013");
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        jLabel6.setText("Empresa apresentou declaração referente ao requisito XXXI ?");

        jLabel7.setText("Obs.: Integridade de Banco de Dados");

        sim.setText("Sim");
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });

        nao.setText("Não");
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(versaoAto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(versaoRoteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(escolha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ano)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sim)
                                .addGap(70, 70, 70)
                                .addComponent(nao))
                            .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(versaoRoteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(versaoAto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sim)
                    .addComponent(nao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        if ("".equals(versaoAto.getText()) || "".equals(versaoRoteiro.getText()) || (declaracaoConfomidade != 1 && declaracaoConfomidade != 2)) {
            JOptionPane.showMessageDialog(null, "EXISTE(M) CAMPO(S) EM BRANCO(S)!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        } else {

            String correto;

            correto = CorretorOrtografico.corretor(versaoAto.getText());
            XML.setVersaoAto(correto);

            correto = CorretorOrtografico.corretor(versaoRoteiro.getText());
            XML.setVersaoRoteiro(correto);

            correto = CorretorOrtografico.corretor(ano.getText());
            XML.setAno(correto);

            XML.setDeclaracaoConfomidade(declaracaoConfomidade);

            M_RoteiroAnalise.setFlag(true);
            dispose();
        }
    }//GEN-LAST:event_okActionPerformed

    private void escolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaActionPerformed

    }//GEN-LAST:event_escolhaActionPerformed

    private void escolhaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_escolhaPopupMenuWillBecomeVisible

    }//GEN-LAST:event_escolhaPopupMenuWillBecomeVisible

    private void escolhaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_escolhaPopupMenuWillBecomeInvisible
        if (this.escolha.getSelectedIndex() == 0) {
            mes = "Janeiro";
        } else if (this.escolha.getSelectedIndex() == 1) {
            mes = "Fevereiro";
        } else if (this.escolha.getSelectedIndex() == 2) {
            mes = "Março";
        } else if (this.escolha.getSelectedIndex() == 3) {
            mes = "Abril";
        } else if (this.escolha.getSelectedIndex() == 4) {
            mes = "Maio";
        } else if (this.escolha.getSelectedIndex() == 5) {
            mes = "Junho";
        } else if (this.escolha.getSelectedIndex() == 6) {
            mes = "Julho";
        } else if (this.escolha.getSelectedIndex() == 7) {
            mes = "Agosto";
        } else if (this.escolha.getSelectedIndex() == 8) {
            mes = "Setembro";
        } else if (this.escolha.getSelectedIndex() == 9) {
            mes = "Outubro";
        } else if (this.escolha.getSelectedIndex() == 10) {
            mes = "Novembro";
        } else if (this.escolha.getSelectedIndex() == 11) {
            mes = "Dezembro";
        }
    }//GEN-LAST:event_escolhaPopupMenuWillBecomeInvisible

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed
        declaracaoConfomidade = 1;
    }//GEN-LAST:event_simActionPerformed

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed
        declaracaoConfomidade = 2;
    }//GEN-LAST:event_naoActionPerformed

    private void versaoRoteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versaoRoteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_versaoRoteiroActionPerformed

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
            java.util.logging.Logger.getLogger(M_RoteiroAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_RoteiroAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_RoteiroAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_RoteiroAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_RoteiroAnalise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox escolha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton nao;
    private javax.swing.JButton ok;
    private javax.swing.JRadioButton sim;
    private javax.swing.JTextField versaoAto;
    private javax.swing.JTextField versaoRoteiro;
    // End of variables declaration//GEN-END:variables
}
