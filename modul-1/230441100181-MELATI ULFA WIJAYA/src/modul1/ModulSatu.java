/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ModulSatu extends javax.swing.JFrame {

    /**
     * Creates new form ModulSatu
     */
    public ModulSatu() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelFormulir = new javax.swing.JLabel();
        LabelGambarIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelNIK = new javax.swing.JLabel();
        LabelTTL = new javax.swing.JLabel();
        LabelAlamat = new javax.swing.JLabel();
        LabelNoHP = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        RadioButtonLaki = new javax.swing.JRadioButton();
        RadioButtonPerempuan = new javax.swing.JRadioButton();
        TextFieldNama = new javax.swing.JTextField();
        TextFieldNIK = new javax.swing.JTextField();
        TextFieldTTL = new javax.swing.JTextField();
        TextFieldAlamat = new javax.swing.JTextField();
        TextFieldNoHP = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        ComboBoxPilihanPosisi = new javax.swing.JComboBox<>();
        LabelUmur = new javax.swing.JLabel();
        TextFieldUmur = new javax.swing.JTextField();
        LabelJenisKelamin = new javax.swing.JLabel();
        LabelPilihanPosisi = new javax.swing.JLabel();
        ButtonBatal = new javax.swing.JButton();
        ButtonRiset = new javax.swing.JButton();
        ButtonSimpan = new javax.swing.JButton();
        ckb = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        LabelFormulir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelFormulir.setText("FORMULIR PENDAFTARAN KARYAWAN 2024");

        LabelGambarIcon.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Pemvis\\MODUL 1\\logo1.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("GROWTH MODE MARKETING");

        jLabel3.setText("Jl. Raya Trunojoyo, Kamal Bangkalan - Madura");

        jLabel4.setText("Tlp. (098) 33421 Kode Pos. 64471");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LabelGambarIcon)
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelFormulir)
                        .addGap(75, 75, 75))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LabelFormulir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGambarIcon)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        LabelNama.setText("Nama :");

        LabelNIK.setText("NIK :");

        LabelTTL.setText("Tempat, Tanggal Lahir :");

        LabelAlamat.setText("Alamat Sekarang :");

        LabelNoHP.setText("No. HP :");

        LabelEmail.setText("Email :");

        buttonGroup1.add(RadioButtonLaki);
        RadioButtonLaki.setText("Laki - Laki");

        buttonGroup1.add(RadioButtonPerempuan);
        RadioButtonPerempuan.setText("Perempuan");
        RadioButtonPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonPerempuanActionPerformed(evt);
            }
        });

        TextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaActionPerformed(evt);
            }
        });

        TextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAlamatActionPerformed(evt);
            }
        });

        TextFieldNoHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNoHPActionPerformed(evt);
            }
        });

        ComboBoxPilihanPosisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posisi yang dilamar", "- Admin", "- Marketing", "- Gudang", "- Cleaning Service" }));

        LabelUmur.setText("Umur :");

        LabelJenisKelamin.setText("Jenis Kelamin :");

        LabelPilihanPosisi.setText("Pilihan Posisi");

        ButtonBatal.setText("Batal");
        ButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBatalActionPerformed(evt);
            }
        });

        ButtonRiset.setText("Riset");
        ButtonRiset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRisetActionPerformed(evt);
            }
        });

        ButtonSimpan.setText("Simpan");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        ckb.setText(" ");
        ckb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNama)
                            .addComponent(LabelNIK))
                        .addGap(111, 111, 111)
                        .addComponent(TextFieldNama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelJenisKelamin)
                            .addComponent(LabelUmur)
                            .addComponent(LabelEmail)
                            .addComponent(LabelTTL)
                            .addComponent(LabelAlamat)
                            .addComponent(LabelNoHP)
                            .addComponent(ButtonBatal)
                            .addComponent(LabelPilihanPosisi))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RadioButtonLaki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RadioButtonPerempuan))
                                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldNoHP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldUmur, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldTTL)
                                    .addComponent(ComboBoxPilihanPosisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextFieldNIK)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ButtonRiset)
                                .addGap(81, 81, 81)
                                .addComponent(ButtonSimpan)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ckb)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNama))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNIK)
                    .addComponent(TextFieldNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTTL)
                    .addComponent(TextFieldTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUmur)
                    .addComponent(TextFieldUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNoHP)
                    .addComponent(TextFieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelEmail)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelJenisKelamin)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RadioButtonLaki)
                        .addComponent(RadioButtonPerempuan)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxPilihanPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPilihanPosisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBatal)
                    .addComponent(ButtonRiset)
                    .addComponent(ButtonSimpan))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAlamatActionPerformed

    private void TextFieldNoHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNoHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNoHPActionPerformed

    private void RadioButtonPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonPerempuanActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        // TODO add your handling code here:
        
//      SIMPAN -  ambil data dari form
    String Nama = TextFieldNama.getText();
    String NIK = TextFieldNIK.getText();
    String TTL = TextFieldTTL.getText();
    String Umur = TextFieldUmur.getText();
    String Alamat = TextFieldAlamat.getText();
    String NoHP = TextFieldNoHP.getText();
    String Email = TextFieldEmail.getText();
    String JenisKelamin = RadioButtonLaki.isSelected()? "Laki - Laki": RadioButtonPerempuan.isSelected()? "Perempuan" : "";
    String PilihanPosisi = ComboBoxPilihanPosisi.getSelectedItem().toString();
    
//     cek box di centang atau tidak
       if (!ckb.isSelected()){
           JOptionPane.showMessageDialog(this, "Harap centang checkbox untuk melanjutkan", "ERROR", JOptionPane.WARNING_MESSAGE);
           return;
       }
//       combobox kosong
    ComboBoxPilihanPosisi.addItem("");
    ComboBoxPilihanPosisi.setSelectedIndex(4);
    
//    data harus diisi
    if (TextFieldNama.getText().isEmpty() || TextFieldAlamat.getText().isEmpty() || TextFieldNoHP.getText().isEmpty() || TextFieldTTL.getText().isEmpty() || TextFieldUmur.getText().isEmpty() || TextFieldNIK.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "HArap disii terlebih dahulu!!!", "EROR", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
//    buat pilihan dari frame kedua dan kirim data
    LanjutanModulSatu lanjutanModulSatu = new LanjutanModulSatu();
    lanjutanModulSatu.setData(Nama, NIK, TTL, Umur, Alamat, NoHP, Email, JenisKelamin, PilihanPosisi);
    lanjutanModulSatu.setVisible(true);
    dispose();
    
//    lanjutanModulSatu.setVisible(false);


    
    
    }//GEN-LAST:event_ButtonSimpanActionPerformed

    private void ButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBatalActionPerformed
        // TODO add your handling code here:
//        BATAL - Membatalkan 
    this.setVisible(false);

    }//GEN-LAST:event_ButtonBatalActionPerformed

    private void ButtonRisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRisetActionPerformed
        // TODO add your handling code here:
        
//   RISET 
        TextFieldNama.setText(null);
        TextFieldNIK.setText(null);
        TextFieldTTL.setText(null);
        TextFieldUmur.setText(null);
        TextFieldAlamat.setText(null);
        TextFieldNoHP.setText(null);
        TextFieldEmail.setText(null);
//        hapus pilihan dari tombol
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//      hapus cek box
        ckb.setSelected(false);
//       atur combo box pilihan posisi
        ComboBoxPilihanPosisi.setSelectedIndex(0);
    }//GEN-LAST:event_ButtonRisetActionPerformed

    private void ckbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbActionPerformed

    private void TextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNamaActionPerformed

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
            java.util.logging.Logger.getLogger(ModulSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModulSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModulSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModulSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModulSatu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBatal;
    private javax.swing.JButton ButtonRiset;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JComboBox<String> ComboBoxPilihanPosisi;
    private javax.swing.JLabel LabelAlamat;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelFormulir;
    private javax.swing.JLabel LabelGambarIcon;
    private javax.swing.JLabel LabelJenisKelamin;
    private javax.swing.JLabel LabelNIK;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelNoHP;
    private javax.swing.JLabel LabelPilihanPosisi;
    private javax.swing.JLabel LabelTTL;
    private javax.swing.JLabel LabelUmur;
    private javax.swing.JRadioButton RadioButtonLaki;
    private javax.swing.JRadioButton RadioButtonPerempuan;
    private javax.swing.JTextField TextFieldAlamat;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNIK;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JTextField TextFieldNoHP;
    private javax.swing.JTextField TextFieldTTL;
    private javax.swing.JTextField TextFieldUmur;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox ckb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
