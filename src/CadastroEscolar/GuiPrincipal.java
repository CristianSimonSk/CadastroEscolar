
package CadastroEscolar;

public class GuiPrincipal extends javax.swing.JFrame {
    
    private DataBase dataBase = new DataBase();
    private Cadastros cadastroProf = new Cadastros(new java.awt.Frame(), true, dataBase, 0);
    private Cadastros cadastroEst = new Cadastros(new java.awt.Frame(), true, dataBase, 1);
    private Relatorios relatorioProf = new Relatorios(new java.awt.Frame(), true, dataBase, 0);
    private Relatorios relatorioEst = new Relatorios(new java.awt.Frame(), true, dataBase, 1);
    private Sobre infoExtras = new Sobre(this, true);
    
    public GuiPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadProf = new javax.swing.JMenuItem();
        cadEst = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        relProf = new javax.swing.JMenuItem();
        relEst = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        infoExtra = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        cadProf.setText("Cadastro Professor");
        cadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProfActionPerformed(evt);
            }
        });
        jMenu1.add(cadProf);

        cadEst.setText("Cadastro Estudante");
        cadEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEstActionPerformed(evt);
            }
        });
        jMenu1.add(cadEst);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        relProf.setText("Relatório Professores");
        relProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relProfActionPerformed(evt);
            }
        });
        jMenu2.add(relProf);

        relEst.setText("Relatório Estudantes");
        relEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relEstActionPerformed(evt);
            }
        });
        jMenu2.add(relEst);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");

        infoExtra.setText("Informações Extras");
        infoExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoExtraActionPerformed(evt);
            }
        });
        jMenu3.add(infoExtra);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProfActionPerformed
        cadastroProf.setVisible(true);
    }//GEN-LAST:event_cadProfActionPerformed

    private void cadEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEstActionPerformed
        cadastroEst.setVisible(true);
    }//GEN-LAST:event_cadEstActionPerformed

    private void relProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relProfActionPerformed
        relatorioProf.setVisible(true);
    }//GEN-LAST:event_relProfActionPerformed

    private void relEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relEstActionPerformed
        relatorioEst.setVisible(true);
    }//GEN-LAST:event_relEstActionPerformed

    private void infoExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoExtraActionPerformed
        infoExtras.setVisible(true);
    }//GEN-LAST:event_infoExtraActionPerformed

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
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadEst;
    private javax.swing.JMenuItem cadProf;
    private javax.swing.JMenuItem infoExtra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem relEst;
    private javax.swing.JMenuItem relProf;
    // End of variables declaration//GEN-END:variables
}
