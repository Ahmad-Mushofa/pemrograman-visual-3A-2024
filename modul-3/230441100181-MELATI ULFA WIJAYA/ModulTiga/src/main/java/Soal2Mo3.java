
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Soal2Mo3 extends javax.swing.JFrame {

    /**
     * Creates new form Soal2Mo3
     */
    public Soal2Mo3() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Kartu = new javax.swing.JLabel();
        SMA = new javax.swing.JLabel();
        Jalan = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Nama = new javax.swing.JLabel();
        Jumlah = new javax.swing.JLabel();
        TextFieldNama = new javax.swing.JTextField();
        TextFieldJumlahUang = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        CheckBoxJanuari = new javax.swing.JCheckBox();
        Bulan = new javax.swing.JLabel();
        CheckBoxFebruari = new javax.swing.JCheckBox();
        CheckBoxMaret = new javax.swing.JCheckBox();
        CheckBoxApril = new javax.swing.JCheckBox();
        CheckBoxMei = new javax.swing.JCheckBox();
        CheckBoxJuni = new javax.swing.JCheckBox();
        CheckBoxJuli = new javax.swing.JCheckBox();
        CheckBoxAgustus = new javax.swing.JCheckBox();
        CheckBoxSeptember = new javax.swing.JCheckBox();
        CheckBoxOktober = new javax.swing.JCheckBox();
        CheckBoxNovember = new javax.swing.JCheckBox();
        CheckBoxDesember = new javax.swing.JCheckBox();
        ButtonSimpan = new javax.swing.JButton();
        ButtonStatus = new javax.swing.JButton();
        ButtonHitung = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ButtonTambah = new javax.swing.JButton();
        ButtonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kartu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Kartu.setText("KARTU IURAN SPP");
        jPanel2.add(Kartu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        SMA.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SMA.setText("SMA PAGUYANGAN KAJA");
        jPanel2.add(SMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        Jalan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jalan.setText("Jl. Suradipa I No. 90 Paguyangan Kaja");
        jPanel2.add(Jalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Pemvis\\MODUL 3\\iso smkn 1 nganjuk composing.png")); // NOI18N
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 90, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("_____________________________________________________________________________________________________________________________________________________________");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        Nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nama.setForeground(new java.awt.Color(255, 255, 255));
        Nama.setText("Nama Siswa : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel3.add(Nama, gridBagConstraints);

        Jumlah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jumlah.setForeground(new java.awt.Color(255, 255, 255));
        Jumlah.setText("SPP/Bulan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 14, 0);
        jPanel3.add(Jumlah, gridBagConstraints);

        TextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 35);
        jPanel3.add(TextFieldNama, gridBagConstraints);

        TextFieldJumlahUang.setEditable(false);
        TextFieldJumlahUang.setText("200.000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 14, 35);
        jPanel3.add(TextFieldJumlahUang, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        CheckBoxJanuari.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxJanuari.setText("Januari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 39, 0, 0);
        jPanel4.add(CheckBoxJanuari, gridBagConstraints);

        Bulan.setBackground(new java.awt.Color(51, 204, 255));
        Bulan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bulan.setForeground(new java.awt.Color(255, 255, 255));
        Bulan.setText("Bulan Yang Harus Di Lunasi : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 66, 0, 0);
        jPanel4.add(Bulan, gridBagConstraints);

        CheckBoxFebruari.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxFebruari.setText("Februari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 39, 0, 0);
        jPanel4.add(CheckBoxFebruari, gridBagConstraints);

        CheckBoxMaret.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxMaret.setText("Maret");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 39, 0, 0);
        jPanel4.add(CheckBoxMaret, gridBagConstraints);

        CheckBoxApril.setBackground(new java.awt.Color(0, 102, 204));
        CheckBoxApril.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxApril.setText("April");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 39, 0, 0);
        jPanel4.add(CheckBoxApril, gridBagConstraints);

        CheckBoxMei.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxMei.setText("Mei");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 39, 0, 0);
        jPanel4.add(CheckBoxMei, gridBagConstraints);

        CheckBoxJuni.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxJuni.setText("Juni");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 40, 25, 0);
        jPanel4.add(CheckBoxJuni, gridBagConstraints);

        CheckBoxJuli.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxJuli.setText("Juli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 67, 0, 0);
        jPanel4.add(CheckBoxJuli, gridBagConstraints);

        CheckBoxAgustus.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxAgustus.setText("Agustus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 67, 0, 0);
        jPanel4.add(CheckBoxAgustus, gridBagConstraints);

        CheckBoxSeptember.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxSeptember.setText("September");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 67, 0, 0);
        jPanel4.add(CheckBoxSeptember, gridBagConstraints);

        CheckBoxOktober.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxOktober.setText("Oktober");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 67, 0, 0);
        jPanel4.add(CheckBoxOktober, gridBagConstraints);

        CheckBoxNovember.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxNovember.setText("November");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 67, 0, 41);
        jPanel4.add(CheckBoxNovember, gridBagConstraints);

        CheckBoxDesember.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxDesember.setText("Desember");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 67, 25, 41);
        jPanel4.add(CheckBoxDesember, gridBagConstraints);

        ButtonSimpan.setBackground(new java.awt.Color(204, 204, 204));
        ButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSimpan.setText("Simpan");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        ButtonStatus.setBackground(new java.awt.Color(204, 204, 204));
        ButtonStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonStatus.setText("Status");
        ButtonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStatusActionPerformed(evt);
            }
        });

        ButtonHitung.setBackground(new java.awt.Color(204, 204, 204));
        ButtonHitung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonHitung.setText("Hitung");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setLayout(new java.awt.BorderLayout());

        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Siswa", "SPP PerBulan", "Total Pembayaran", "Sisa Bulan Dibayar"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jPanel7.add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        ButtonTambah.setBackground(new java.awt.Color(204, 204, 204));
        ButtonTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        ButtonKeluar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonKeluar.setText("Keluar");
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(ButtonHitung)
                .addGap(84, 84, 84)
                .addComponent(ButtonSimpan)
                .addGap(92, 92, 92)
                .addComponent(ButtonStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonTambah)
                .addGap(72, 72, 72)
                .addComponent(ButtonKeluar)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSimpan)
                    .addComponent(ButtonHitung)
                    .addComponent(ButtonStatus)
                    .addComponent(ButtonTambah)
                    .addComponent(ButtonKeluar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaActionPerformed
        // TODO add your handling code here:
        String namaSiswa = TextFieldNama.getText();
        if (namaSiswa.isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi Nama Di Kolom", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        inisialisasi total SPP mnjd 0
//centang setiap cekBox
        int totalSPP = 0;
        if(CheckBoxJanuari.isSelected()) totalSPP += 200000;
        if(CheckBoxFebruari.isSelected()) totalSPP += 200000;
        if(CheckBoxMaret.isSelected()) totalSPP += 200000;
        if(CheckBoxApril.isSelected()) totalSPP += 200000;
        if(CheckBoxMei.isSelected()) totalSPP += 200000;
        if(CheckBoxJuni.isSelected()) totalSPP += 200000;
        if(CheckBoxJuli.isSelected()) totalSPP += 200000;
        if(CheckBoxAgustus.isSelected()) totalSPP += 200000;
        if(CheckBoxSeptember.isSelected()) totalSPP += 200000;
        if(CheckBoxOktober.isSelected()) totalSPP += 200000;
        if(CheckBoxNovember.isSelected()) totalSPP += 200000;
        if(CheckBoxDesember.isSelected()) totalSPP += 200000;
         
    }//GEN-LAST:event_TextFieldNamaActionPerformed

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
    // TODO add your handling code here:
    String namaSiswa = TextFieldNama.getText();
    String jumlahUangSPP = TextFieldJumlahUang.getText();

    // nama SISWA
    if (namaSiswa.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan Nama Siswa", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    // UANG
//    if (jumlahUangSPP.isEmpty()) {
//        JOptionPane.showMessageDialog(this, "Masukkan Jumlah Uang SPP per Bulan", "Error", JOptionPane.ERROR_MESSAGE);
//        return;
//    }
    
    double jumlahSPP;
    try {
        jumlahSPP = Double.parseDouble(jumlahUangSPP);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Uang Harus Dalam Bentuk Angka", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    // cekBoxArre
    JCheckBox[] checkBox = {
        CheckBoxJanuari, CheckBoxFebruari, CheckBoxMaret, CheckBoxApril, CheckBoxMei, CheckBoxJuni, CheckBoxJuli, CheckBoxAgustus, CheckBoxSeptember, CheckBoxOktober, CheckBoxNovember, CheckBoxDesember
    };
    boolean pilih = false;
    for (JCheckBox checkBoxx : checkBox) {
        if (checkBoxx.isSelected()) {
            pilih = true;
            break;
        }
    }

    if (!pilih) {
        JOptionPane.showMessageDialog(this, "Pilih Minimal 1 Bulan!!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // TOTAL PEMBAYARAN
    double totalBayar = 0;
    StringBuilder detailPembayaran = new StringBuilder("*** Detail Pembayaran ***\n" + namaSiswa + ":\n");

    // Menghitung total sesuai CheckBox
    String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

    for (int i = 0; i < checkBox.length; i++) {
        if (checkBox[i].isSelected()) {
            totalBayar += jumlahSPP;
            detailPembayaran.append(bulan[i]).append(": ").append(jumlahSPP).append("\n");
        }
    }

    detailPembayaran.append("Total Pembayaran: ").append(totalBayar).append("\n");

    
    JOptionPane.showMessageDialog(this, detailPembayaran.toString(), "Detail Pembayaran", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStatusActionPerformed

    if (Table.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Hitung Total SPP", "Eror", JOptionPane.ERROR_MESSAGE);
        return;
    } else {
        String status = "Lunas";
        StringBuilder belumDibayar = new StringBuilder();
        StringBuilder sudahDibayar = new StringBuilder();

        JCheckBox[] checkBox = {
            CheckBoxJanuari, CheckBoxFebruari, CheckBoxMaret, CheckBoxApril, CheckBoxMei,
            CheckBoxJuni, CheckBoxJuli, CheckBoxAgustus, CheckBoxSeptember, CheckBoxOktober,
            CheckBoxNovember, CheckBoxDesember
        };

        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"
        };
//jika cekBox ^
        for (int i = 0; i < checkBox.length; i++) {
            if (!checkBox[i].isSelected()) {
                status = "Pembayaran SPP Menunggak";
                belumDibayar.append(bulan[i]).append("\n");
            } else {
                sudahDibayar.append(bulan[i]).append("\n");
            }
        }
//SPP telat ditampilkan 
        if (status.equals("Pembayaran SPP Menunggak")) {
            JOptionPane.showMessageDialog(this, "Status : " + status + "\nBulan Belum Bayar SPP : \n" + belumDibayar.toString() + "\nSudah Dibayar : \n" + sudahDibayar.toString());
        } else {
            JOptionPane.showMessageDialog(this, "Status : " + status + "\nSemua SPP Sudah Lunas :");
            }
        }

    }//GEN-LAST:event_ButtonStatusActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        // TODO add your handling code here:
        //ambil nama siswa dan jumlah spp per bulan dari input
    String namaSiswa = TextFieldNama.getText();
    String jumlahSPPStr = TextFieldJumlahUang.getText();
//    validasi input
    if(namaSiswa.isEmpty() || jumlahSPPStr.isEmpty()){
        JOptionPane.showMessageDialog(null, "Silahkan masukkan nama siswa dan jumlah SPP per bulan.", "Error", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    double jumlahSpp;
    try{
        jumlahSpp = Double.parseDouble(jumlahSPPStr);
    }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Jumlah SPP harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
     
    double totalPembayaran = 0;
    double sisaPembayaran = 0;
    StringBuilder pembayaranDetail = new StringBuilder("Detail Pembayaran untuk " + namaSiswa + ":\n");
    
        // Hitung total pembayaran berdasarkan checkbox yang dipilih
    JCheckBox[] checkboxes = {
        CheckBoxJanuari, CheckBoxFebruari, CheckBoxMaret, CheckBoxApril, CheckBoxMei, CheckBoxJuni, CheckBoxJuli, CheckBoxAgustus, CheckBoxSeptember, CheckBoxOktober, CheckBoxNovember, CheckBoxDesember
           } ;
    String[] bulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    
    for (int i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].isSelected()) {
            totalPembayaran += jumlahSpp;
            pembayaranDetail.append(bulan[i]).append(": ").append(jumlahSpp).append("\n");
        }
    }

    // 
    sisaPembayaran = (12 * jumlahSpp) - totalPembayaran;

    // Add the data to the table
    DefaultTableModel model = (DefaultTableModel) Table.getModel();
    int rowCount = model.getRowCount();
    boolean isStudentFound = false;
    int studentRow = -1;
        
    for (int i = 0; i < rowCount; i++) {
        Object value = model.getValueAt(i, 0);
        if (value != null && value.equals(namaSiswa)) {
            isStudentFound = true;
            studentRow = i;
            break;
        }
    }
    
    if (isStudentFound) {
        double keluarTotal = (double) model.getValueAt(studentRow, 2);
        double newTotalPembayaran = keluarTotal + totalPembayaran;
        
        model.setValueAt(newTotalPembayaran, studentRow, 2);
        model.setValueAt((12 * jumlahSpp) - newTotalPembayaran, studentRow, 3);
    } else {
        model.addRow(new Object[]{namaSiswa, jumlahSpp, totalPembayaran, sisaPembayaran});
    }



    // Display the payment details
    JOptionPane.showMessageDialog(this, pembayaranDetail.append("Total Pembayaran : ").append(totalPembayaran).append("\nSisa Bulan Yang Harus Dibayar : ").append(sisaPembayaran).toString());
    
    
    }//GEN-LAST:event_ButtonSimpanActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed

    String namaSiswa = TextFieldNama.getText().trim();
    System.out.println("Button clicked. Nama Siswa: " + namaSiswa);
    
    if (namaSiswa.isEmpty()) {
        TextFieldNama.setText("");
        resetCheckboxes();
        System.out.println("Nama Siswa is empty. Resetting checkboxes.");
        return;
    }
    
    DefaultTableModel model = (DefaultTableModel) Table.getModel();
    int rowCount = model.getRowCount();
    boolean isStudentFound = false;
    int studentRow = -1;
    
    for (int i = 0; i < rowCount; i++) {
        Object value = model.getValueAt(i, 0);
        if (value != null && value.equals(namaSiswa)) {
            isStudentFound = true;
            studentRow = i;
            break;
        }
    }
    
    JCheckBox[] checkboxes = {
        CheckBoxJanuari, CheckBoxFebruari, CheckBoxMaret, CheckBoxApril, CheckBoxMei, CheckBoxJuni, CheckBoxJuli, CheckBoxAgustus, CheckBoxSeptember, CheckBoxOktober, CheckBoxNovember, CheckBoxDesember
           } ;
    
    if (isStudentFound) {
        double totalPembayaran = (double) model.getValueAt(studentRow, 2);
        double jumlahSpp = (double) model.getValueAt(studentRow, 1);
        int monthsPaid = (int) (totalPembayaran / jumlahSpp);
        
        for (int i = 0; i < monthsPaid; i++) {
            checkboxes[i].setSelected(true);
            checkboxes[i].setEnabled(false);
        }
        for (int i = monthsPaid; i < checkboxes.length; i++) {
            checkboxes[i].setSelected(false);
            checkboxes[i].setEnabled(true);
        }
        System.out.println("Student found. Updated checkboxes for paid months.");
        int response = JOptionPane.showConfirmDialog(this, "\nSiswa ini sudah membayar untuk bulan: " + getPaidMonths(monthsPaid) + ".\nSisa bulan yang belum dibayar: " + getUnpaidMonths(monthsPaid) + ". \nApakah ingin melanjutkan pembayaran?", "Konfirmasi Pembayaran", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            // Lanjutkan pembayaran
            double pembayaranBaru = Double.parseDouble(JOptionPane.showInputDialog(this, "Masukkan jumlah pembayaran baru:"));
            totalPembayaran += pembayaranBaru;
            model.setValueAt(totalPembayaran, studentRow, 2);
            monthsPaid = (int) (totalPembayaran / jumlahSpp);
            for (int i = 0; i < monthsPaid; i++) {
                checkboxes[i].setSelected(true);
                checkboxes[i].setEnabled(false);
            }
            for (int i = monthsPaid; i < checkboxes.length; i++) {
                checkboxes[i].setSelected(false);
                checkboxes[i].setEnabled(true);
            }
            if (monthsPaid >= 12) {
                JOptionPane.showMessageDialog(this, "Pembayaran lunas untuk siswa: " + namaSiswa);
                model.setValueAt("Lunas", studentRow, 3); // Asumsi kolom ke-4 adalah status pembayaran
            }
        } else {
            resetCheckboxes();
            TextFieldNama.setText("");
        }
    } else {
        TextFieldNama.setText("");
        resetCheckboxes();
        System.out.println("Student not found. Resetting checkboxes.");
        addNewStudent(namaSiswa);
    }

    }//GEN-LAST:event_ButtonTambahActionPerformed

    
    
    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showConfirmDialog(null,"Ingin Keluar dari Halaman???", "Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        //kalau pilih YES maka tutup program.
        if (keluar == JOptionPane.YES_OPTION){
        //pembatalan
        dispose();
        }
    }//GEN-LAST:event_ButtonKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Soal2Mo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soal2Mo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soal2Mo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soal2Mo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

           
                
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal2Mo3().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bulan;
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JButton ButtonStatus;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JCheckBox CheckBoxAgustus;
    private javax.swing.JCheckBox CheckBoxApril;
    private javax.swing.JCheckBox CheckBoxDesember;
    private javax.swing.JCheckBox CheckBoxFebruari;
    private javax.swing.JCheckBox CheckBoxJanuari;
    private javax.swing.JCheckBox CheckBoxJuli;
    private javax.swing.JCheckBox CheckBoxJuni;
    private javax.swing.JCheckBox CheckBoxMaret;
    private javax.swing.JCheckBox CheckBoxMei;
    private javax.swing.JCheckBox CheckBoxNovember;
    private javax.swing.JCheckBox CheckBoxOktober;
    private javax.swing.JCheckBox CheckBoxSeptember;
    private javax.swing.JLabel Jalan;
    private javax.swing.JLabel Jumlah;
    private javax.swing.JLabel Kartu;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel SMA;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextFieldJumlahUang;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void resetCheckboxes() {
    JCheckBox[] checkboxes = {
        CheckBoxJanuari, CheckBoxFebruari, CheckBoxMaret, CheckBoxApril, CheckBoxMei, CheckBoxJuni, CheckBoxJuli, CheckBoxAgustus, CheckBoxSeptember, CheckBoxOktober, CheckBoxNovember, CheckBoxDesember
           } ;
    
        for (JCheckBox checkbox : checkboxes) {
            checkbox.setSelected(false);
            checkbox.setEnabled(true);
        }
    }

    private String getPaidMonths(int monthsPaid) {
    String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        StringBuilder paidMonths = new StringBuilder();
        for (int i = 0; i < monthsPaid; i++) {
            if (i > 0) paidMonths.append(", ");
            paidMonths.append(months[i]);
        }
        return paidMonths.toString();
    }

    private String getUnpaidMonths(int monthsPaid) {
    String[] months = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        StringBuilder unpaidMonths = new StringBuilder();
        for (int i = monthsPaid; i < months.length; i++) {
            if (i > monthsPaid) unpaidMonths.append(", ");
            unpaidMonths.append(months[i]);
        }
        return unpaidMonths.toString();
    }

    private void addNewStudent(String namaSiswa) {
     DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.addRow(new Object[]{namaSiswa, 0.0, 0.0});
        JOptionPane.showMessageDialog(this, "Siswa baru ditambahkan: " + namaSiswa);
        
    }
}
