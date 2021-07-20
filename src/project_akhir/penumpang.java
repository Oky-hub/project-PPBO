/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir;

import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
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
public class penumpang extends javax.swing.JFrame {

    /**
     * Creates new form penumpang
     */
    public penumpang() {
        initComponents();
        tampilData();
    }
    public void kosongForm(){
        txtKodePenumpang.setEditable(true);
        txtKodePenumpang.setText(null);
        txtNama.setText(null);
        txtNoIdentitas.setText(null);
        cbJenis.setSelectedItem(this);
        txtUsia.setText(null);
        txtNoTelp.setText(null);
        txtAlamat.setText(null);
    }
    public void tampilData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Penumpang");
        model.addColumn("Nama Penumpang");
        model.addColumn("No. Identitas");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Usia");
        model.addColumn("No. Telepon");
        model.addColumn("Alamat");
        
        try{
            int no=1;
            String sql="SELECT * FROM penumpang1";
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
            tblPenumpang.setModel(model);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btCetak = new javax.swing.JButton();
        txtKodePenumpang = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNoIdentitas = new javax.swing.JTextField();
        txtUsia = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenumpang = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        cbJenis = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(310, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(164, 164, 164));
        jPanel1.setPreferredSize(new java.awt.Dimension(879, 667));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("Data Penumpang");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 40, 259, 58);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kode Penumpang");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 140, 160, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nama Penumpang");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(820, 220, 170, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("No. Identitas");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(820, 290, 120, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(820, 360, 125, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Usia");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(820, 430, 38, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("No. Telepon");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(820, 500, 108, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Alamat");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(820, 570, 70, 22);

        btCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/printer.png"))); // NOI18N
        btCetak.setText("Print");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btCetak);
        btCetak.setBounds(360, 650, 101, 41);

        txtKodePenumpang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtKodePenumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodePenumpangActionPerformed(evt);
            }
        });
        jPanel1.add(txtKodePenumpang);
        txtKodePenumpang.setBounds(820, 160, 390, 40);

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama);
        txtNama.setBounds(820, 240, 390, 40);

        txtNoIdentitas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNoIdentitas);
        txtNoIdentitas.setBounds(820, 310, 390, 40);

        txtUsia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsia);
        txtUsia.setBounds(820, 450, 390, 40);

        txtNoTelp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNoTelp);
        txtNoTelp.setBounds(820, 520, 390, 40);

        txtAlamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlamat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtAlamat);
        txtAlamat.setBounds(820, 590, 390, 40);

        tblPenumpang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPenumpang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenumpangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPenumpang);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 150, 720, 410);

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/plus.png"))); // NOI18N
        btnSimpan.setText("Add");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan);
        btnSimpan.setBounds(600, 650, 100, 40);

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/pencil_edit.png"))); // NOI18N
        btnUbah.setText("Edit");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah);
        btnUbah.setBounds(730, 650, 100, 40);

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/refresh.png"))); // NOI18N
        btnBatal.setText("Refresh");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal);
        btnBatal.setBounds(990, 650, 121, 41);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/trash_box.png"))); // NOI18N
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus);
        btnHapus.setBounds(850, 650, 120, 41);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/close_delete.png"))); // NOI18N
        btnLogOut.setText("Close");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(210, 650, 110, 40);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/arrow_left.png"))); // NOI18N
        btnKembali.setText("Back");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali);
        btnKembali.setBounds(70, 650, 101, 41);

        cbJenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---", "Laki-laki", "Perempuan" }));
        jPanel1.add(cbJenis);
        cbJenis.setBounds(820, 380, 390, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/Logo-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(710, 100, 460, 610);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/backOk_1.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 10, 1280, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsiaActionPerformed

    private void txtKodePenumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodePenumpangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodePenumpangActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE penumpang1 SET " +
                    "kode_penumpang='"+txtKodePenumpang.getText()+"'," +
                    "nama='"+txtNama.getText()+"',"+
                    "identitas='"+txtNoIdentitas.getText()+"',"+
                    "jenis_kelamin='"+cbJenis.getSelectedItem()+"',"+
                    "usia='"+txtUsia.getText()+"',"+
                    "no_telp='"+txtNoTelp.getText()+"',"+
                    "alamat='"+txtAlamat.getText()+"'WHERE " +
                    "kode_penumpang= '"+txtKodePenumpang.getText()+"'";
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

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Keluar aplikasi???",
            "Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tblPenumpangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenumpangMouseClicked
        // TODO add your handling code here:
        txtKodePenumpang.setEditable(false);
        int baris = tblPenumpang.rowAtPoint(evt.getPoint());
        String kode_penumpang = tblPenumpang.getValueAt(baris, 1).toString();
        txtKodePenumpang.setText(kode_penumpang);
        
        String nama = tblPenumpang.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String identitas = tblPenumpang.getValueAt(baris, 3).toString();
        txtNoIdentitas.setText(identitas); 
                
        String jenis_kelamin = tblPenumpang.getValueAt(baris, 4).toString();
        cbJenis.setSelectedItem(jenis_kelamin);
        
        String usia = tblPenumpang.getValueAt(baris, 5).toString();
        txtUsia.setText(usia); 
        
        String no_telp = tblPenumpang.getValueAt(baris, 6).toString();
        txtNoTelp.setText(no_telp);
        
        String alamat = tblPenumpang.getValueAt(baris, 7).toString();
        txtAlamat.setText(alamat);

    }//GEN-LAST:event_tblPenumpangMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        kosongForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql="INSERT INTO penumpang1 VALUES('"+txtKodePenumpang.getText()+"',"
                    +"'"+txtNama.getText()+"',"
                    +"'"+txtNoIdentitas.getText()+"',"
                    +"'"+cbJenis.getSelectedItem()+"',"
                    +"'"+txtUsia.getText()+"',"
                    +"'"+txtNoTelp.getText()+"',"
                    +"'"+txtAlamat.getText()+"')";
            java.sql.Connection conn=(Connection)konfig.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Baru Berhasil");
            tampilData();
            kosongForm();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM penumpang1 WHERE kode_penumpang='"+txtKodePenumpang.getText()+"'";
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

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        // TODO add your handling code here:
        try{
            InputStream is = pemesanan.class.getResourceAsStream("/cetak/penumpang.jasper");
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
            java.util.logging.Logger.getLogger(penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penumpang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbJenis;
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
    private javax.swing.JTable tblPenumpang;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKodePenumpang;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoIdentitas;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtUsia;
    // End of variables declaration//GEN-END:variables
}