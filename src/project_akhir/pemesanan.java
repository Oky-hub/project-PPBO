/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir;

import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LENOVO
 */
public class pemesanan extends javax.swing.JFrame {

    /**
     * Creates new form pemesanan
     */
    public pemesanan() {
        initComponents();
        tampilData();
        kosongForm();
        cbPenumpang();
        cbKendaraan();
        cbJadwal();
    }
    public String tgl;
    public void tanggal(){
        try{
            String sql="SELECT * FROM pemesanan1 where kode_pemesanan='"+txtKodePemesanan.getText()+"'";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                Date2.setDate(res.getDate("tanggal"));
            }
        }catch(SQLException e){
            
        }
    }
    
    public void kosongForm(){
        txtKodePemesanan.setEditable(true);
        txtKodePemesanan.setText(null);
        Date2.setDateFormatString(null);
        cbPenumpang.setSelectedItem(null);
        cbKendaraan.setSelectedItem(null);
        cbJadwal.setSelectedItem(null);
        txtJam1.setText(null);
        txtFasilitas.setText(null);
        txtPosisi.setText(null);
    }
    public void tampilData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Pemesanan");
        model.addColumn("Kode Jadwal");
        model.addColumn("Kode Penumpang");
        model.addColumn("Kode Kendaraan");
        model.addColumn("Tanggal Pemesanan");
        model.addColumn("Posisi Kursi");
        model.addColumn("Jam Keberangkatan");
        model.addColumn("Fasilitas");
        
        try{
            int no=1;
            String sql="SELECT * FROM pemesanan1";
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
                    res.getDate(5),
                    res.getString(6),
                    res.getString(7),
                    res.getString(8)});
            }
            tblPemesanan.setModel(model);
        }catch(SQLException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    
        public void cbPenumpang(){
        try{
            String sql = "SELECT * FROM penumpang1";
            java.sql.Connection conn = (Connection) konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbPenumpang.addItem(rs.getString("kode_penumpang"));
                
            }
            
            rs.last();
            int jumlahData = rs.getRow();
            rs.first();
        }catch(Exception e){
            
        }
    }
        
    public void cbKendaraan(){
        try{
            String sql = "SELECT * FROM kendaraan1";
            java.sql.Connection conn = (Connection) konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbKendaraan.addItem(rs.getString("kode_kendaraan"));
                
            }
            
            rs.last();
            int jumlahData = rs.getRow();
            rs.first();
        }catch(Exception e){
            
        }
    }
    
    public void cbJadwal(){
        try{
            String sql = "SELECT kode_jadwal FROM `jadwal1`";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbJadwal.addItem(rs.getString("kode_jadwal"));
                
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKodePemesanan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPosisi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJam1 = new javax.swing.JTextField();
        txtFasilitas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPemesanan = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btCetak = new javax.swing.JButton();
        Date2 = new com.toedter.calendar.JDateChooser();
        cbPenumpang = new javax.swing.JComboBox<>();
        cbKendaraan = new javax.swing.JComboBox<>();
        cbJadwal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 155));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(164, 164, 164));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("Pemesanan Tiket");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 50, 267, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kode Penumpang");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 220, 170, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tanggal Pemesanan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(630, 130, 183, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kode Pemesanan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 130, 157, 30);

        txtKodePemesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtKodePemesanan);
        txtKodePemesanan.setBounds(80, 160, 410, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Jam Keberangkatan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(630, 310, 182, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Kode Kendaraan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 310, 190, 30);

        txtPosisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPosisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosisiActionPerformed(evt);
            }
        });
        jPanel1.add(txtPosisi);
        txtPosisi.setBounds(630, 420, 420, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Posisi Kursi");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(630, 390, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Kode Jadwal");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 390, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Fasilitas");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(630, 230, 72, 20);

        txtJam1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtJam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJam1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtJam1);
        txtJam1.setBounds(630, 336, 420, 40);

        txtFasilitas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFasilitasActionPerformed(evt);
            }
        });
        jPanel1.add(txtFasilitas);
        txtFasilitas.setBounds(630, 248, 420, 40);

        tblPemesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPemesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPemesanan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(83, 551, 970, 160);

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/plus.png"))); // NOI18N
        btnSimpan.setText("Add");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan);
        btnSimpan.setBounds(560, 490, 97, 41);

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/pencil_edit.png"))); // NOI18N
        btnUbah.setText("Edit");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah);
        btnUbah.setBounds(680, 490, 95, 41);

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/refresh.png"))); // NOI18N
        btnBatal.setText("Refresh");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal);
        btnBatal.setBounds(800, 490, 121, 41);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/trash_box.png"))); // NOI18N
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus);
        btnHapus.setBounds(940, 490, 113, 41);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/close_delete.png"))); // NOI18N
        btnLogOut.setText("Close");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(80, 490, 107, 41);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/arrow_left.png"))); // NOI18N
        btnKembali.setText("Back");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali);
        btnKembali.setBounds(220, 490, 101, 41);

        btCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/printer.png"))); // NOI18N
        btCetak.setText("Print");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btCetak);
        btCetak.setBounds(360, 490, 101, 41);

        Date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Date2PropertyChange(evt);
            }
        });
        jPanel1.add(Date2);
        Date2.setBounds(630, 156, 420, 40);

        cbPenumpang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbPenumpang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---" }));
        jPanel1.add(cbPenumpang);
        cbPenumpang.setBounds(80, 250, 410, 40);

        cbKendaraan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---" }));
        jPanel1.add(cbKendaraan);
        cbKendaraan.setBounds(80, 340, 410, 40);

        cbJadwal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbJadwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---" }));
        jPanel1.add(cbJadwal);
        cbJadwal.setBounds(80, 420, 410, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/Logo-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 130, 520, 380);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/backOk_1.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 10, 1100, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPosisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosisiActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Keluar aplikasi???",
            "Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void txtFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFasilitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFasilitasActionPerformed

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        // TODO add your handling code here:
        try{
            InputStream is = pemesanan.class.getResourceAsStream("/cetak/cetak.jasper");
            JasperPrint JsPrint = JasperFillManager.fillReport(is, null, konfig.configDB());
            JasperViewer.viewReport(JsPrint, false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal mencetak laporan karena :"
                    + e.getMessage(), "cetak laporan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCetakActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tblPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPemesananMouseClicked
        // TODO add your handling code here:
        txtKodePemesanan.setEditable(false);
        int baris = tblPemesanan.rowAtPoint(evt.getPoint());
        String kode_pemesanan = tblPemesanan.getValueAt(baris, 1).toString();
        txtKodePemesanan.setText(kode_pemesanan);
        
        String kode_jadwal = tblPemesanan.getValueAt(baris, 2).toString();
        cbJadwal.setSelectedItem(kode_jadwal);
        
        String kode_penumpang = tblPemesanan.getValueAt(baris, 3).toString();
        cbPenumpang.setSelectedItem(kode_penumpang); 
                
        String kode_kendaraan = tblPemesanan.getValueAt(baris, 4).toString();
        cbKendaraan.setSelectedItem(kode_kendaraan);
        
        /*String tanggal = tblPemesanan.getValueAt(baris, 5).toString();
        Date.setDateFormatString(tanggal);*/
        tanggal();
        
        String kursi = tblPemesanan.getValueAt(baris, 6).toString();
        txtPosisi.setText(kursi);
        
        String jam_keberangkatan = tblPemesanan.getValueAt(baris, 7).toString();
        txtJam1.setText(jam_keberangkatan);
        
        String fasilitas = tblPemesanan.getValueAt(baris, 8).toString();
        txtFasilitas.setText(fasilitas);
        
    }//GEN-LAST:event_tblPemesananMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        kosongForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql="INSERT INTO pemesanan1 VALUES('"+txtKodePemesanan.getText()+
                    "','"+cbJadwal.getSelectedItem()+
                    "','"+cbPenumpang.getSelectedItem()+
                    "','"+cbKendaraan.getSelectedItem()+
                    "','"+tgl+
                    "','"+txtJam1.getText()+
                    "','"+txtPosisi.getText()+
                    "','"+txtFasilitas.getText()+"')";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Baru Berhasil");
            tampilData();
            kosongForm();
        }catch(HeadlessException | SQLException e){
            System.out.println( e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        /*String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tgl = String.valueOf(fm.format(Date2.getDate()));*/
        try{
            String sql = "UPDATE pemesanan1 SET " +
                    "kode_pemesanan='"+txtKodePemesanan.getText()+"'," +
                    "kode_jadwal='"+cbJadwal.getSelectedItem()+"',"+
                    "kode_penumpang='"+cbPenumpang.getSelectedItem()+"',"+
                    "kode_kendaraan='"+cbKendaraan.getSelectedItem()+"',"+
                    "tanggal='"+tgl+"',"+
                    "kursi='"+txtPosisi.getText()+"',"+
                    "jam_keberangkatan='"+txtJam1.getText()+"',"+
                    "fasilitas='"+txtFasilitas.getText()+"'WHERE " +
                    "kode_pemesanan= '"+txtKodePemesanan.getText()+"'";
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
            String sql = "DELETE FROM pemesanan1 WHERE kode_pemesanan='"+txtKodePemesanan.getText()+"'";
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

    private void Date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Date2PropertyChange
        // TODO add your handling code here:
        if (Date2.getDate() != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            tgl = format.format(Date2.getDate());
        }
    }//GEN-LAST:event_Date2PropertyChange

    private void txtJam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJam1ActionPerformed

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
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbJadwal;
    private javax.swing.JComboBox<String> cbKendaraan;
    private javax.swing.JComboBox<String> cbPenumpang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tblPemesanan;
    private javax.swing.JTextField txtFasilitas;
    private javax.swing.JTextField txtJam1;
    private javax.swing.JTextField txtKodePemesanan;
    private javax.swing.JTextField txtPosisi;
    // End of variables declaration//GEN-END:variables
}
