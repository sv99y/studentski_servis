/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentski_servis;

/**
 *
 * @author domenosojnik
CREATE OR REPLACE FUNCTION dodaja_oglasa (opisx TEXT, neto FLOAT, bruto FLOAT, mesta INT, trajanje VARCHAR(50), kraj VARCHAR(50), podjetje VARCHAR(50), kategorija VARCHAR(50))
RETURNS integer AS $$
BEGIN
INSERT INTO oglasi (podjetje_id, kraj_id, kategorija_id, neto_placa, bruto_placa, st_prostih_mest, trajanje, opis) VALUES ((SELECT id FROM podjetja WHERE ime LIKE podjetje), (SELECT id FROM kraji WHERE ime LIKE kraj), (SELECT id FROM kategorije WHERE ime LIKE kategorija), neto, bruto, mesta, trajanje, opisx);
RETURN 1;
END;
$$
LANGUAGE plpgsql;
 */
public class dodaj_oglas extends javax.swing.JFrame {

    /** Creates new form dodaj_oglas */
    public dodaj_oglas() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kraj_oglasa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        opis_oglasa = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        trajanje_oglasa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kategorija_oglasa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        prosta_mesta_oglasa = new javax.swing.JTextField();
        bruto_oglasa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        neto_oglasa = new javax.swing.JTextField();
        placa_po_dogovoru = new javax.swing.JRadioButton();
        izbira_po_dogovoru = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        kontakt_oglasa = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Times", 1, 18)); // NOI18N
        jLabel1.setText("Dodajanje novega oglasa");

        kraj_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N
        kraj_oglasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        opis_oglasa.setColumns(20);
        opis_oglasa.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        opis_oglasa.setRows(5);
        jScrollPane1.setViewportView(opis_oglasa);

        jLabel2.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel2.setText("Opis oglasa");

        jLabel3.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel3.setText("Kraj dela");

        jLabel4.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel4.setText("Trajanje");

        trajanje_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel6.setText("Kategorija");

        kategorija_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N
        kategorija_oglasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel7.setText("Stevilo prostih mest");

        prosta_mesta_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N

        bruto_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel8.setText("Plača");

        jLabel9.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel9.setText("Bruto plača:");

        jLabel10.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel10.setText("Neto plača:");

        neto_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N

        placa_po_dogovoru.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        placa_po_dogovoru.setForeground(new java.awt.Color(0, 163, 0));
        placa_po_dogovoru.setText("Po dogovoru");
        placa_po_dogovoru.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                placa_po_dogovoruStateChanged(evt);
            }
        });

        izbira_po_dogovoru.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        izbira_po_dogovoru.setForeground(new java.awt.Color(0, 118, 5));
        izbira_po_dogovoru.setText("Po dogovoru");
        izbira_po_dogovoru.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                izbira_po_dogovoruStateChanged(evt);
            }
        });
        izbira_po_dogovoru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                izbira_po_dogovoruKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jButton1.setText("Objavi oglas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times", 1, 13)); // NOI18N
        jLabel11.setText("Kontakt");

        kontakt_oglasa.setFont(new java.awt.Font("Times", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(554, 554, 554))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(590, 590, 590))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kraj_oglasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(kategorija_oglasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(prosta_mesta_oglasa)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(343, 343, 343))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bruto_oglasa)
                                            .addComponent(neto_oglasa)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(placa_po_dogovoru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6)))
                                .addGap(218, 218, 218))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(trajanje_oglasa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(551, 551, 551))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(245, 245, 245))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(276, 276, 276))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(izbira_po_dogovoru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kontakt_oglasa)
                        .addGap(11, 11, 11))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(330, 330, 330))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kraj_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kategorija_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel9))
                        .addComponent(bruto_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(neto_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trajanje_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(placa_po_dogovoru)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izbira_po_dogovoru)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(kontakt_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prosta_mesta_oglasa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object varName = (Object)kraj_oglasa.getSelectedItem();
        String kraj = kraj_oglasa.getSelectedItem().toString();

        

        Object varName2 = (Object)kategorija_oglasa.getSelectedItem();
        String kategorija = kategorija_oglasa.getSelectedItem().toString();


        String opisoglasa = opis_oglasa.getText();
        int mesta = Integer.parseInt(prosta_mesta_oglasa.getText());
        float bruto = Float.parseFloat(bruto_oglasa.getText()) ;
        float neto = Float.parseFloat(neto_oglasa.getText()) ;
        String kontakt = kontakt_oglasa.getText();
        String trajanje = trajanje_oglasa.getText();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void izbira_po_dogovoruKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_izbira_po_dogovoruKeyPressed
        // TODO add your handling code here:
        trajanje_oglasa.setEnabled(false);
    }//GEN-LAST:event_izbira_po_dogovoruKeyPressed

    private void izbira_po_dogovoruStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_izbira_po_dogovoruStateChanged
        // TODO add your handling code here:
       if(izbira_po_dogovoru.isSelected())
       {
           trajanje_oglasa.setEnabled(false);
       } 
       else
       {
           trajanje_oglasa.setEnabled(true);
       }
 
    }//GEN-LAST:event_izbira_po_dogovoruStateChanged

    private void placa_po_dogovoruStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_placa_po_dogovoruStateChanged
        // TODO add your handling code here:
        if(placa_po_dogovoru.isSelected())
       {
           neto_oglasa.setEnabled(false);
           bruto_oglasa.setEnabled(false);
       } 
       else
       {
           neto_oglasa.setEnabled(true);
           bruto_oglasa.setEnabled(true);
       }
    }//GEN-LAST:event_placa_po_dogovoruStateChanged

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
            java.util.logging.Logger.getLogger(dodaj_oglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dodaj_oglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dodaj_oglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dodaj_oglas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dodaj_oglas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bruto_oglasa;
    private javax.swing.JRadioButton izbira_po_dogovoru;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategorija_oglasa;
    private javax.swing.JTextField kontakt_oglasa;
    private javax.swing.JComboBox<String> kraj_oglasa;
    private javax.swing.JTextField neto_oglasa;
    private javax.swing.JTextArea opis_oglasa;
    private javax.swing.JRadioButton placa_po_dogovoru;
    private javax.swing.JTextField prosta_mesta_oglasa;
    private javax.swing.JTextField trajanje_oglasa;
    // End of variables declaration//GEN-END:variables

}
