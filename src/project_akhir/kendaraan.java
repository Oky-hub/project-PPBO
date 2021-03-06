/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir;

import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LENOVO
 */
public class kendaraan extends javax.swing.JFrame {

    /**
     * Creates new form kendaraan
     */
    public kendaraan() {
        initComponents();
        tampilData();
        kosongForm();
        tampilCombo();
        tampilCombo1();
    }
    public void kosongForm(){
        txtKodeKendaraan.setEditable(true);
        txtKodeKendaraan.setText(null);
        txtKodePlat.setText(null);
        cbSupir.setSelectedItem(this);
        txtNama.setText(null);
        cbJenis.setSelectedItem(this);
        txtPosisiKursi.setText(null);
        cbStatus.setSelectedItem(null);
    }
    public void tampilData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Kendaraan");
        model.addColumn("No. Plat");
        model.addColumn("Kode Supir");
        model.addColumn("Nama Kendaraan");
        model.addColumn("Jenis Kendaraan");
        model.addColumn("Posisi Kursi");
        model.addColumn("Status Kursi");
        
        try{
            int no=1;
            String sql="SELECT * FROM kendaraan1";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{
                    no++,
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
                    res.getString(7)});
            }
            tblKendaraan.setModel(model);
        }catch(SQLException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    
    public void tampilCombo(){
        try{
            String sql = "SELECT * FROM kendaraan1";
            java.sql.Connection conn = (Connection) konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbJenis.addItem(rs.getString("jenis_mobil"));
                
            }
            
            rs.last();
            int jumlahData = rs.getRow();
            rs.first();
        }catch(Exception e){
            
        }
    }
    
    public void tampilCombo1(){
        try{
            String sql = "SELECT * FROM supir";
            java.sql.Connection conn = (Connection) konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbSupir.addItem(rs.getString("kode_supir"));
                
            }
            
            rs.last();
            int jumlahData = rs.getRow();
            rs.first();
        }catch(Exception e){
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btCetak = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        txtKodeKendaraan = new javax.swing.JTextField();
        txtKodePlat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKendaraan = new javax.swing.JTable();
        cbJenis = new javax.swing.JComboBox<>();
        btSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPosisiKursi = new javax.swing.JTextField();
        cbSupir = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(164, 164, 164));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Kode_Kendaraan");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(750, 110, 170, 30);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("Data Kendaraan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 30, 244, 58);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("No. Plat");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(750, 190, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nama Kendaraan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(750, 360, 158, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Jenis Kendaraan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(750, 450, 151, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kode Supir");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(750, 270, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Status Isi");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(750, 630, 150, 30);

        btCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/printer.png"))); // NOI18N
        btCetak.setText("Print");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btCetak);
        btCetak.setBounds(400, 740, 101, 41);

        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---", "Ada", "Tidak" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });
        jPanel1.add(cbStatus);
        cbStatus.setBounds(750, 670, 350, 40);

        txtKodeKendaraan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtKodeKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeKendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(txtKodeKendaraan);
        txtKodeKendaraan.setBounds(750, 140, 350, 40);

        txtKodePlat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtKodePlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodePlatActionPerformed(evt);
            }
        });
        jPanel1.add(txtKodePlat);
        txtKodePlat.setBounds(750, 220, 350, 40);

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama);
        txtNama.setBounds(750, 390, 350, 40);

        tblKendaraan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKendaraanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKendaraan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 120, 648, 590);

        cbJenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---" }));
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });
        jPanel1.add(cbJenis);
        cbJenis.setBounds(750, 480, 350, 40);

        btSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/plus.png"))); // NOI18N
        btSimpan.setText("Add");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btSimpan);
        btSimpan.setBounds(550, 740, 120, 41);

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/pencil_edit.png"))); // NOI18N
        btnUbah.setText("Edit");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah);
        btnUbah.setBounds(700, 740, 110, 41);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/trash_box.png"))); // NOI18N
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus);
        btnHapus.setBounds(830, 740, 113, 41);

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/refresh.png"))); // NOI18N
        btnBatal.setText("Refresh");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal);
        btnBatal.setBounds(970, 740, 130, 41);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/arrow_left.png"))); // NOI18N
        btnKembali.setText("Back");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali);
        btnKembali.setBounds(80, 740, 120, 41);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/close_delete.png"))); // NOI18N
        btnLogOut.setText("Close");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(230, 740, 130, 41);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Posisi Kursi");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 540, 150, 30);

        txtPosisiKursi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtPosisiKursi);
        txtPosisiKursi.setBounds(750, 570, 350, 40);

        cbSupir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbSupir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---" }));
        cbSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSupirActionPerformed(evt);
            }
        });
        jPanel1.add(cbSupir);
        cbSupir.setBounds(750, 300, 350, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/Logo-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(710, 120, 370, 450);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/backOk_1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 10, 1150, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodePlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodePlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodePlatActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Keluar aplikasi???",
            "Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void tblKendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKendaraanMouseClicked
        // TODO add your handling code here:
        txtKodeKendaraan.setEditable(false);
        int baris = tblKendaraan.rowAtPoint(evt.getPoint());
        String kode_kendaraan = tblKendaraan.getValueAt(baris, 1).toString();
        txtKodeKendaraan.setText(kode_kendaraan);
        
        String no_plat = tblKendaraan.getValueAt(baris, 2).toString();
        txtKodePlat.setText(no_plat);
        
        String kode_supir = tblKendaraan.getValueAt(baris, 3).toString();
        cbSupir.setSelectedItem(kode_supir);
        
        String nama_kendaraan = tblKendaraan.getValueAt(baris, 4).toString();
        txtNama.setText(nama_kendaraan);  
        
        String jenis_kendaraan = tblKendaraan.getValueAt(baris, 5).toString();
        cbJenis.setSelectedItem(jenis_kendaraan);
        
        String nama_kursi = tblKendaraan.getValueAt(baris, 6).toString();
        txtPosisiKursi.setText(nama_kursi); 
        
        String status = tblKendaraan.getValueAt(baris, 7).toString();
        cbStatus.setSelectedItem(status);
    }//GEN-LAST:event_tblKendaraanMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        kosongForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql="INSERT INTO kendaraan1 VALUES('"+txtKodeKendaraan.getText()+"',"
                    +"'"+txtKodePlat.getText()+"',"
                    +"'"+cbSupir.getSelectedItem()+"',"
                    +"'"+txtNama.getText()+"',"
                    +"'"+cbJenis.getSelectedItem()+"',"
                    +"'"+txtPosisiKursi.getText()+"',"
                    +"'"+cbStatus.getSelectedItem()+"')";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Baru Berhasil");
            tampilData();
            kosongForm();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilData();
        kosongForm();
        tampilCombo();
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE kendaraan1 SET " +
                    "kode_kendaraan='"+txtKodeKendaraan.getText()+"'," +
                    "no_plat='"+txtKodePlat.getText()+"'," +
                    "kode_supir='"+cbSupir.getSelectedItem()+"',"+
                    "nama_kendaraan='"+txtNama.getText()+"',"+
                    "jenis_kendaraan='"+cbJenis.getSelectedItem()+"',"+
                    "nama_kursi='"+txtPosisiKursi.getText()+"'"+
                    "status='"+cbStatus.getSelectedItem()+"'WHERE " +
                    "kode_kendaraan= '"+txtKodePlat.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilData();
        kosongForm();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM kendaraan1 WHERE kode_kendaraan='"+txtKodeKendaraan.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilData();
        kosongForm();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJenisActionPerformed

    private void cbSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSupirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSupirActionPerformed

    private void txtKodeKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKendaraanActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        // TODO add your handling code here:
        try{
            InputStream is = pemesanan.class.getResourceAsStream("/cetak/kendaraan.jasper");
            JasperPrint JsPrint = JasperFillManager.fillReport(is, null, konfig.configDB());
            JasperViewer.viewReport(JsPrint, false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal mencetak laporan karena :"
                + e.getMessage(), "cetak laporan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCetakActionPerformed

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
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kendaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbSupir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKendaraan;
    private javax.swing.JTextField txtKodeKendaraan;
    private javax.swing.JTextField txtKodePlat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPosisiKursi;
    // End of variables declaration//GEN-END:variables
}
