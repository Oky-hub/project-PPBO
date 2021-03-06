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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LENOVO
 */
public class jadwal extends javax.swing.JFrame {

    /**
     * Creates new form jadwal
     */
    public jadwal() {
        initComponents();
        tampilData();
        kosongForm();
        tanggal();
    }
    public String tgl;
    public void tanggal(){
        try{
            String sql="SELECT * FROM jadwal1 where kode_jadwal='"+txtKodeJadwal.getText()+"'";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                Date.setDate(res.getDate("tanggal"));
            }
        }catch(SQLException e){
            
        }
    }
    public void kosongForm(){
        txtKodeJadwal.setEditable(true);
        txtKodeJadwal.setText(null);
        cbTujuan.setSelectedItem(this);
        Date.setDateFormatString(null);
        txtHarga.setText(null);
    }
    public void tampilData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Jadwal");
        model.addColumn("Tujuan");
        model.addColumn("Tanggal");
        model.addColumn("Harga");
        
        try{
            int no=1;
            String sql="SELECT * FROM `jadwal1`";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{
                    no++,
                    res.getString(1),
                    res.getString(2),
                    res.getDate(3),
                    res.getString(4)});
            }
            tblKeberangkatan.setModel(model);
        }catch(SQLException e){
            System.out.println("Error "+e.getMessage());
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
        btCetak = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        txtKodeJadwal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKeberangkatan = new javax.swing.JTable();
        cbTujuan = new javax.swing.JComboBox<>();
        btnLogOut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(164, 164, 164));
        jPanel1.setForeground(new java.awt.Color(164, 164, 164));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("Jadwal Keberangkatan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 30, 386, 58);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Kode Jadwal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 120, 130, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Tujuan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 190, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Tanggal");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(710, 280, 90, 20);

        btCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/printer.png"))); // NOI18N
        btCetak.setText("Print");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btCetak);
        btCetak.setBounds(350, 450, 101, 41);

        btSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/plus.png"))); // NOI18N
        btSimpan.setText("Add");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btSimpan);
        btSimpan.setBounds(510, 450, 120, 41);

        btUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/pencil_edit.png"))); // NOI18N
        btUbah.setText("Edit");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btUbah);
        btUbah.setBounds(660, 450, 120, 40);

        btBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/refresh.png"))); // NOI18N
        btBatal.setText("Refresh");
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btBatal);
        btBatal.setBounds(970, 450, 130, 40);

        btHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/trash_box.png"))); // NOI18N
        btHapus.setText("Delete");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btHapus);
        btHapus.setBounds(810, 450, 130, 40);

        txtKodeJadwal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtKodeJadwal);
        txtKodeJadwal.setBounds(710, 140, 390, 30);

        tblKeberangkatan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKeberangkatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKeberangkatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKeberangkatan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 130, 590, 280);

        cbTujuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---", "Muara Bungo", "Dhamasraya", "Pekanbaru", "Dumai" }));
        jPanel1.add(cbTujuan);
        cbTujuan.setBounds(710, 210, 390, 30);

        btnLogOut.setForeground(new java.awt.Color(255, 0, 0));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/close_delete.png"))); // NOI18N
        btnLogOut.setText("Close");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(200, 450, 120, 41);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/arrow_left.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 450, 110, 41);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Harga");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(710, 360, 70, 20);

        txtHarga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtHarga);
        txtHarga.setBounds(710, 380, 390, 30);

        Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DatePropertyChange(evt);
            }
        });
        jPanel1.add(Date);
        Date.setBounds(710, 300, 390, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/Logo-removebg-preview.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(680, 80, 400, 510);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/backOk_1.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 1170, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Keluar aplikasi???",
            "Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void tblKeberangkatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKeberangkatanMouseClicked
        // TODO add your handling code here:
        txtKodeJadwal.setEditable(false);
        int baris = tblKeberangkatan.rowAtPoint(evt.getPoint());
        String kode_jadwal = tblKeberangkatan.getValueAt(baris, 1).toString();
        txtKodeJadwal.setText(kode_jadwal);

        String tujuan = tblKeberangkatan.getValueAt(baris, 3).toString();
        cbTujuan.setSelectedItem(tujuan);
        
        /*String tanggal = tblKeberangkatan.getValueAt(baris, 4).toString();
        Date.setDateFormatString(tanggal);*/
        tanggal();
        
        String harga = tblKeberangkatan.getValueAt(baris, 4).toString();
        txtHarga.setText(harga);
        

    }//GEN-LAST:event_tblKeberangkatanMouseClicked

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM jadwal1 WHERE kode_jadwal='"+txtKodeJadwal.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilData();
        kosongForm();
    }//GEN-LAST:event_btHapusActionPerformed

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        // TODO add your handling code here:
        kosongForm();
    }//GEN-LAST:event_btBatalActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(Date.getDate()));
        try{
            String sql = "UPDATE jadwal1 SET " +
            "kode_jadwal='"+txtKodeJadwal.getText()+"'," +
            "tujuan='"+cbTujuan.getSelectedItem()+"',"+
            "tanggal='"+tanggal+"',"+
            "harga='"+txtHarga.getText()+"'WHERE " +
            "kode_jadwal= '"+txtKodeJadwal.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilData();
        kosongForm();
    }//GEN-LAST:event_btUbahActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(Date.getDate()));
        try{
            String sql="INSERT INTO jadwal1 VALUES('"+txtKodeJadwal.getText()+"',"
                    +"'"+cbTujuan.getSelectedItem()+"',"
                    +"'"+tanggal+"',"
                    +"'"+txtHarga.getText()+"')";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Baru Berhasil");
            tampilData();
            kosongForm();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void DatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePropertyChange

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        // TODO add your handling code here:
        try{
            InputStream is = pemesanan.class.getResourceAsStream("/cetak/jadwal.jasper");
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
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btUbah;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JComboBox<String> cbTujuan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKeberangkatan;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKodeJadwal;
    // End of variables declaration//GEN-END:variables
}
