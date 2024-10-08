
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class FrameInput extends javax.swing.JFrame {

    /**
     * Creates new form FrameInput
     */
    public FrameInput() {
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

        btnKelamin = new javax.swing.ButtonGroup();
        panelBawah = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        inputTemLahir = new javax.swing.JTextField();
        inputTanLahir = new javax.swing.JTextField();
        inputAlamat = new javax.swing.JTextField();
        inputTelp = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        btnPerempuan = new javax.swing.JRadioButton();
        btnLakiLaki = new javax.swing.JRadioButton();
        inputProdi = new javax.swing.JTextField();
        pilihFakultas = new javax.swing.JComboBox<>();
        btnBatal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnCentang = new javax.swing.JRadioButton();
        panelAtas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBawah.setBackground(new java.awt.Color(51, 153, 0));
        panelBawah.setAlignmentY(0.0F);

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama :");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tempat Lahir :");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Lahir :");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Kelamin :");

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alamat :");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No. Telp : ");

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email :");

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Prodi :");

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fakultas :");

        inputNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        inputTemLahir.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputTemLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTemLahirActionPerformed(evt);
            }
        });

        inputTanLahir.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputTanLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTanLahirActionPerformed(evt);
            }
        });

        inputAlamat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        inputTelp.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelpActionPerformed(evt);
            }
        });

        inputEmail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        btnKelamin.add(btnPerempuan);
        btnPerempuan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPerempuan.setForeground(new java.awt.Color(255, 255, 255));
        btnPerempuan.setText("Perempuan");
        btnPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerempuanActionPerformed(evt);
            }
        });

        btnKelamin.add(btnLakiLaki);
        btnLakiLaki.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnLakiLaki.setForeground(new java.awt.Color(255, 255, 255));
        btnLakiLaki.setText("Laki - Laki");
        btnLakiLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLakiLakiActionPerformed(evt);
            }
        });

        inputProdi.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputProdiActionPerformed(evt);
            }
        });

        pilihFakultas.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        pilihFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Fakultas--", "Fakultas Teknik", "Fakultas Lainnya" }));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnCentang.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCentang.setForeground(new java.awt.Color(255, 255, 255));
        btnCentang.setText("Data Yang Saya Masukkan Sudah Benar");

        javax.swing.GroupLayout panelBawahLayout = new javax.swing.GroupLayout(panelBawah);
        panelBawah.setLayout(panelBawahLayout);
        panelBawahLayout.setHorizontalGroup(
            panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBawahLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pilihFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12)
                        .addGroup(panelBawahLayout.createSequentialGroup()
                            .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(23, 23, 23)
                            .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputTemLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(inputNama)))
                        .addGroup(panelBawahLayout.createSequentialGroup()
                            .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(btnBatal)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputTanLahir, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputTelp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputProdi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBawahLayout.createSequentialGroup()
                                    .addComponent(btnPerempuan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLakiLaki)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panelBawahLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(btnReset)
                                    .addGap(64, 64, 64)
                                    .addComponent(btnSimpan))))
                        .addComponent(btnCentang)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelBawahLayout.setVerticalGroup(
            panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBawahLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputTemLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputTanLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnPerempuan)
                    .addComponent(btnLakiLaki))
                .addGap(15, 15, 15)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(inputProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pilihFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCentang)
                .addGap(15, 15, 15)
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnReset)
                    .addComponent(btnSimpan))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(panelBawah, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 470, 490));

        panelAtas.setBackground(new java.awt.Color(0, 102, 0));
        panelAtas.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION FORM");

        jLabel2.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("==============================================================================");

        jLabel3.setFont(new java.awt.Font("Futura-Heavy", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INPUT DATA USER");

        javax.swing.GroupLayout panelAtasLayout = new javax.swing.GroupLayout(panelAtas);
        panelAtas.setLayout(panelAtasLayout);
        panelAtasLayout.setHorizontalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(6, 6, 6))
        );
        panelAtasLayout.setVerticalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(panelAtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputTemLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTemLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTemLahirActionPerformed

    private void inputTanLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTanLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTanLahirActionPerformed

    private void btnPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerempuanActionPerformed

    private void btnLakiLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLakiLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLakiLakiActionPerformed

    private void inputTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelpActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputProdiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        FrameOutput frameoutput = new FrameOutput();
        if(btnCentang.isSelected()){
            frameoutput.lbNama.setText(inputNama.getText());
            frameoutput.lbTemLahir.setText(inputTemLahir.getText());
            frameoutput.lbTanLahir.setText(inputTanLahir.getText());
            if (btnLakiLaki.isSelected()) {
                frameoutput.lbKelamin.setText("Laki-Laki");
            } else if (btnPerempuan.isSelected()) {
                frameoutput.lbKelamin.setText("Perempuan");
            }
            frameoutput.lbAlamat.setText(inputAlamat.getText());
            frameoutput.lbTelp.setText(inputTelp.getText());
            frameoutput.lbEmail.setText(inputEmail.getText());
            frameoutput.lbProdi.setText(inputProdi.getText());
            String Fakultas = (String) pilihFakultas.getSelectedItem().toString();
            frameoutput.lbFakultas.setText(Fakultas);
            
        } else {
            JOptionPane.showMessageDialog(this,"Data Belum Berhasil di Simpan, Mohon Dicek Kembali","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (inputNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong","Error",JOptionPane.INFORMATION_MESSAGE);
        }else if (inputTemLahir.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong","Error",JOptionPane.INFORMATION_MESSAGE);
        }else if (inputTanLahir.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong","Error",JOptionPane.INFORMATION_MESSAGE);
        }else if (inputAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong","Error",JOptionPane.INFORMATION_MESSAGE);
        }else if (inputTelp.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong","Error",JOptionPane.INFORMATION_MESSAGE);
        }else if (inputProdi.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong","Error",JOptionPane.INFORMATION_MESSAGE);
        } else {
            frameoutput.setVisible(true);
            JOptionPane.showMessageDialog(this,"Berhasil di Simpan","Sukses",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        inputEmail.setText("");
        inputNama.setText("");
        inputTanLahir.setText("");
        inputTemLahir.setText("");
        inputTelp.setText("");
        inputProdi.setText("");
        pilihFakultas.setSelectedItem("--Fakultas--");
        btnKelamin.clearSelection();
        
        JOptionPane.showMessageDialog(this,"Berhasil di Reset","Sukses",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed


    
    
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
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JRadioButton btnCentang;
    private javax.swing.ButtonGroup btnKelamin;
    private javax.swing.JRadioButton btnLakiLaki;
    private javax.swing.JRadioButton btnPerempuan;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputProdi;
    private javax.swing.JTextField inputTanLahir;
    private javax.swing.JTextField inputTelp;
    private javax.swing.JTextField inputTemLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JPanel panelBawah;
    private javax.swing.JComboBox<String> pilihFakultas;
    // End of variables declaration//GEN-END:variables
}
