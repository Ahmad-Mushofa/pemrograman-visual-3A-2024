/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul1;

/**
 *
 * @author AMANDA AULIA
 */
public class JFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame1
     */
    String Nama,Nim,Alamat,Email,JenisKelamin,Prodi;
    public JFrame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelJudul = new javax.swing.JLabel();
        jLabelUtm = new javax.swing.JLabel();
        jLabelTempat = new javax.swing.JLabel();
        jLabelTelp = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jLabelNim = new javax.swing.JLabel();
        jLabelAlamat = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldNim = new javax.swing.JTextField();
        jTextFieldAlamat = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        RadioButtonLK = new javax.swing.JRadioButton();
        RadioButtonPR = new javax.swing.JRadioButton();
        jLabelProdi = new javax.swing.JLabel();
        jComboBoxProdi = new javax.swing.JComboBox<>();
        jCheckBoxValid = new javax.swing.JCheckBox();
        jButtonReset = new javax.swing.JButton();
        jButtonKirim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabelFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\12images__1_-removebg-preview.png")); // NOI18N

        jLabelJudul.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelJudul.setText("FORM PENDAFTARAN UKM-FT");

        jLabelUtm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabelUtm.setText("Universitas Brawijaya Malang");

        jLabelTempat.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabelTempat.setText("Jl.Raya Veteran,NO.10.Ketawanggede,Kota Malang");

        jLabelTelp.setText("Telp : (031)3011146, Fax. (031)3011506");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelFoto)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabelJudul))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelTelp)
                                        .addGap(31, 31, 31))
                                    .addComponent(jLabelTempat, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelUtm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelJudul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUtm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTempat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTelp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabelNama.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabelNama.setText("Nama:");

        jLabelNim.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabelNim.setText("Nim:");

        jLabelAlamat.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabelAlamat.setText("Alamat:");

        jLabelEmail.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabelEmail.setText("Email:");

        jLabelGender.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabelGender.setText("Jenis Kelamin:");

        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });

        jTextFieldNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNimActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonLK);
        RadioButtonLK.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        RadioButtonLK.setText("Laki-Laki");

        buttonGroup1.add(RadioButtonPR);
        RadioButtonPR.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        RadioButtonPR.setText("Perempuan");

        jLabelProdi.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabelProdi.setText("Prodi:");

        jComboBoxProdi.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jComboBoxProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Fakultas Teknik--", "Teknik Informatika", "SistemInformasi", "Teknik Mesin", "Teknik Elektro", "Teknik Industri" }));

        jCheckBoxValid.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jCheckBoxValid.setText("Apakah data sudah benar?");

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonKirim.setText("Kirim");
        jButtonKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKirimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxValid, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonReset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonKirim))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNama)
                                .addComponent(jLabelNim)
                                .addComponent(jLabelAlamat)
                                .addComponent(jLabelEmail)
                                .addComponent(jLabelGender)
                                .addComponent(jLabelProdi))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEmail)
                                .addComponent(jComboBoxProdi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNim)
                                .addComponent(jTextFieldAlamat)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(RadioButtonLK)
                                            .addGap(18, 18, 18)
                                            .addComponent(RadioButtonPR))
                                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNama)
                                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNim)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAlamat))
                    .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(RadioButtonLK)
                    .addComponent(RadioButtonPR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProdi)
                    .addComponent(jComboBoxProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxValid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonKirim))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jTextFieldNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNimActionPerformed

    private void jButtonKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKirimActionPerformed
        // TODO add your handling code here:
        if (!jCheckBoxValid.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Harap mencentang kotak persetujuan sebelum menyimpan!");
        return;
            
        }
        
        Nama = jTextFieldNama.getText();
        Nim = jTextFieldNim.getText();
        Alamat = jTextFieldAlamat.getText();
        Email = jTextFieldEmail.getText();
        
        if (RadioButtonLK.isSelected()){
            JenisKelamin = "Laki- Laki";
        }
        else if(RadioButtonPR.isSelected()){
            JenisKelamin = "Perempuan";
        }
        Prodi = jComboBoxProdi.getSelectedItem().toString();
        
        JFrame2 b = new JFrame2 (Nama,Nim,Alamat,Email,JenisKelamin,Prodi);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonKirimActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jTextFieldNama.setText("");
        jTextFieldNim.setText("");
        jTextFieldAlamat.setText("");
        jTextFieldEmail.setText("");
        buttonGroup1.clearSelection();
        jComboBoxProdi.setSelectedIndex(0);
        jCheckBoxValid.setSelected(false);
          
    }//GEN-LAST:event_jButtonResetActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonLK;
    private javax.swing.JRadioButton RadioButtonPR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonKirim;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxValid;
    private javax.swing.JComboBox<String> jComboBoxProdi;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNim;
    private javax.swing.JLabel jLabelProdi;
    private javax.swing.JLabel jLabelTelp;
    private javax.swing.JLabel jLabelTempat;
    private javax.swing.JLabel jLabelUtm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNim;
    // End of variables declaration//GEN-END:variables
}
