/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul3.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Desain2 extends javax.swing.JFrame {
    int x = 0;

    /**
     * Creates new form Desain2
     */
    public Desain2() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Uang = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Bulan1 = new javax.swing.JCheckBox();
        Bulan2 = new javax.swing.JCheckBox();
        Bulan3 = new javax.swing.JCheckBox();
        Bulan4 = new javax.swing.JCheckBox();
        Bulan5 = new javax.swing.JCheckBox();
        Bulan6 = new javax.swing.JCheckBox();
        Bulan7 = new javax.swing.JCheckBox();
        Bulan8 = new javax.swing.JCheckBox();
        Bulan9 = new javax.swing.JCheckBox();
        Bulan10 = new javax.swing.JCheckBox();
        Bulan11 = new javax.swing.JCheckBox();
        Bulan12 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Haga = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jurusan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul3/pkg3/puber.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul3/pkg3/puber.png"))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 204, 51));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PEMBAYARAN  SPP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 58, 0, 0);
        jPanel10.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SMK 10 NOVEMBER SIDOARJO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 8, 32, 6);
        jPanel10.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Masukan Nama Siswa :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 204, 51));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Total Spp:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 204, 51));
        jPanel7.setLayout(new java.awt.GridLayout(4, 0, 8, 8));

        Bulan1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan1.setForeground(new java.awt.Color(255, 255, 255));
        Bulan1.setText("JANUARI");
        Bulan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bulan1ActionPerformed(evt);
            }
        });
        jPanel7.add(Bulan1);

        Bulan2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan2.setForeground(new java.awt.Color(255, 255, 255));
        Bulan2.setText("FEBRUARI");
        jPanel7.add(Bulan2);

        Bulan3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan3.setForeground(new java.awt.Color(255, 255, 255));
        Bulan3.setText("MARET");
        jPanel7.add(Bulan3);

        Bulan4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan4.setForeground(new java.awt.Color(255, 255, 255));
        Bulan4.setText("APRIL");
        Bulan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bulan4ActionPerformed(evt);
            }
        });
        jPanel7.add(Bulan4);

        Bulan5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan5.setForeground(new java.awt.Color(255, 255, 255));
        Bulan5.setText("MEI");
        Bulan5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bulan5ActionPerformed(evt);
            }
        });
        jPanel7.add(Bulan5);

        Bulan6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan6.setForeground(new java.awt.Color(255, 255, 255));
        Bulan6.setText("JUNI");
        jPanel7.add(Bulan6);

        Bulan7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan7.setForeground(new java.awt.Color(255, 255, 255));
        Bulan7.setText("JULI");
        jPanel7.add(Bulan7);

        Bulan8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan8.setForeground(new java.awt.Color(255, 255, 255));
        Bulan8.setText("AGUSTUS");
        jPanel7.add(Bulan8);

        Bulan9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan9.setForeground(new java.awt.Color(255, 255, 255));
        Bulan9.setText("SEPTEMBER");
        jPanel7.add(Bulan9);

        Bulan10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan10.setForeground(new java.awt.Color(255, 255, 255));
        Bulan10.setText("OKTOBER");
        jPanel7.add(Bulan10);

        Bulan11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan11.setForeground(new java.awt.Color(255, 255, 255));
        Bulan11.setText("NOVEMBER");
        jPanel7.add(Bulan11);

        Bulan12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan12.setForeground(new java.awt.Color(255, 255, 255));
        Bulan12.setText("DESEMBER");
        jPanel7.add(Bulan12);

        Table.setBackground(new java.awt.Color(255, 204, 51));
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jurusan", "Bulan", "Harga", "Status"
            }
        ));
        Table.setEnabled(false);
        jScrollPane1.setViewportView(Table);

        jPanel8.setBackground(new java.awt.Color(255, 204, 51));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bayar Spp:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Haga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HagaActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 204, 51));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jurusan :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<<<<< Pilih Jurusan>>>>>>>", "Multimedia", "Teknik Komputer Dan Jaringan", "Akuntasi", "Rekayasa Peranggat lunak", "Kedokteran", " " }));

        jButton1.setText("Bayar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hitung");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uang, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(412, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Haga, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(61, 61, 61)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nama)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurusan, 0, 205, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Haga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UangActionPerformed

    private void Bulan5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bulan5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bulan5ActionPerformed

    private void Bulan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bulan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bulan4ActionPerformed

    private void Bulan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bulan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bulan1ActionPerformed

    private void HagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HagaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int jumlaspp = 0;
        
        if(Bulan1.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan2.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan3.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan4.isSelected()){
            jumlaspp += 190000;
        }   
        if(Bulan5.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan6.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan7.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan8.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan9.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan10.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan11.isSelected()){
            jumlaspp += 190000;
        }
        if(Bulan12.isSelected()){
            jumlaspp += 190000;
        }
        
        Haga.setText(String.valueOf(jumlaspp));
        jumlaspp = 0;
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            
        if(Haga.getText().isEmpty() || Haga.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, " harga belum diisi!", "PERINGATAN!!!", JOptionPane.WARNING_MESSAGE);
        return;
        }

        if(Uang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field uang belum diisi!", "PERINGATAN!!!", JOptionPane.WARNING_MESSAGE);
        return;
        }

        if(Nama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, " nama belum diisi!", "PERINGATAN!!!", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        int totalHarga = Integer.parseInt(Haga.getText().replace("Rp. ", ""));
        int cash = Integer.parseInt(Uang.getText());
        int kembalian = cash - totalHarga;
        if(cash < totalHarga){
            JOptionPane.showMessageDialog(this, "Uang anda kurang!!!!!", "PERINGATAN!!!", JOptionPane.WARNING_MESSAGE);
            return;
        }else if (cash > totalHarga){
            JOptionPane.showMessageDialog(this, "Pembayaran Suksesss\n " + "Kembalian = Rp. "+kembalian, "PERINGATAN!!!", JOptionPane.WARNING_MESSAGE);
//          
        }else {
            JOptionPane.showMessageDialog(this, "Pembayaran Suksesss ","PERINGATAN!!!", JOptionPane.WARNING_MESSAGE);
        }
        
        
        StringBuilder PilihBulan = new StringBuilder();
        
        if(Bulan1.isSelected()){
            PilihBulan.append("Januari");
            Bulan1.setSelected(false);
            Bulan1.setEnabled(false);
            
        }
        if(Bulan2.isSelected()){
            PilihBulan.append("februari");
            Bulan2.setSelected(false);
            Bulan2.setEnabled(false);
        }
        if(Bulan3.isSelected()){
            PilihBulan.append("Maret, ");
            Bulan3.setSelected(false);
            Bulan3.setEnabled(false);
        }
        if(Bulan4.isSelected()){
            PilihBulan.append("April, ");
            Bulan4.setSelected(false);
            Bulan4.setEnabled(false);
        }
        if(Bulan5.isSelected()){
            PilihBulan.append("Mei, ");
            Bulan5.setSelected(false);
            Bulan5.setEnabled(false);
        }
        if(Bulan6.isSelected()){
            PilihBulan.append("Juni, ");
           Bulan6.setSelected(false);
            Bulan6.setEnabled(false);
        }
        if(Bulan7.isSelected()){
            PilihBulan.append("Juli, ");
            Bulan7.setSelected(false);
            Bulan7.setEnabled(false);
        }
        if(Bulan8.isSelected()){
            PilihBulan.append("Agustus, ");
            Bulan8.setSelected(false);
            Bulan8.setEnabled(false);
        }
        if(Bulan9.isSelected()){
            PilihBulan.append("September, ");
            Bulan9.setSelected(false);
            Bulan9.setEnabled(false);
        }
        if(Bulan10.isSelected()){
            PilihBulan.append("Oktober, ");
            Bulan10.setSelected(false);
            Bulan10.setEnabled(false);
        }
        if(Bulan11.isSelected()){
            PilihBulan.append("November, ");
            Bulan11.setSelected(false);
            Bulan11.setEnabled(false);
        }
        if(Bulan12.isSelected()){
            PilihBulan.append("Desember, ");
            Bulan12.setSelected(false);
            Bulan12.setEnabled(false);
        }
        
        Table.setValueAt(Nama.getText(), x, 0);
        Table.setValueAt(jurusan.getSelectedItem(), x, 1);
        Table.setValueAt(PilihBulan.toString(), x, 2);
        Table.setValueAt(Haga.getText(), x, 3);
        Table.setValueAt("Lunas", x,4);
        x = x+1 ;
        
        Nama.setText("");
        Haga.setText("");
        Uang.setText("");
        Uang.setText("");
        jurusan.setSelectedItem("<<<<<< Pilih Jurusan>>>>>>>");
        Bulan1.setSelected(false);
        Bulan2.setSelected(false);
        Bulan3.setSelected(false);
        Bulan4.setSelected(false);
        Bulan5.setSelected(false);
        Bulan6.setSelected(false);
        Bulan7.setSelected(false);
        Bulan8.setSelected(false);
        Bulan9.setSelected(false);
        Bulan10.setSelected(false);
        Bulan11.setSelected(false);
        Bulan12.setSelected(false);
        
        Haga.setText("0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Desain2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desain2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desain2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desain2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desain2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Bulan1;
    private javax.swing.JCheckBox Bulan10;
    private javax.swing.JCheckBox Bulan11;
    private javax.swing.JCheckBox Bulan12;
    private javax.swing.JCheckBox Bulan2;
    private javax.swing.JCheckBox Bulan3;
    private javax.swing.JCheckBox Bulan4;
    private javax.swing.JCheckBox Bulan5;
    private javax.swing.JCheckBox Bulan6;
    private javax.swing.JCheckBox Bulan7;
    private javax.swing.JCheckBox Bulan8;
    private javax.swing.JCheckBox Bulan9;
    private javax.swing.JTextField Haga;
    private javax.swing.JTextField Nama;
    private javax.swing.JTable Table;
    private javax.swing.JTextField Uang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusan;
    // End of variables declaration//GEN-END:variables
}