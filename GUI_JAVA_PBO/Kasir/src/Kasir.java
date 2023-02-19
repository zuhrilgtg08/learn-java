import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;

/**
 *
 * @author Lenovo
 */
public class Kasir extends javax.swing.JFrame {
    public StringTokenizer token;
    public String gantiFormat = "";
    public String nama_barang = "";
    public long harga_barang;
    public long jumlah_beli;
    public long jumlah_harga;
    public long kembalian;
    public long total_bayar;

    public Kasir() {
        initComponents();
    }

    private void initComponents() {
        namaBarangLabel = new javax.swing.JLabel();
        hargaBarangLabel = new javax.swing.JLabel();
        jumlahBeliLabel = new javax.swing.JLabel();
        totalHargaLabel = new javax.swing.JLabel();
        hargaYangDibayarLabel = new javax.swing.JLabel();
        kembalianLabel = new javax.swing.JLabel();
        jTextField1HargaBarang = new javax.swing.JTextField();
        jTextField2JumlahBeli = new javax.swing.JTextField();
        jTextField3TotalHarga = new javax.swing.JTextField();
        jTextField4HargaYangDibayar = new javax.swing.JTextField();
        jTextField5Kembalian = new javax.swing.JTextField();
        ListNamaBarang = new javax.swing.JComboBox<>();
        btnTotalHarga = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namaBarangLabel.setText("NAMA BARANG : ");

        hargaBarangLabel.setText("HARGA BARANG : ");

        jumlahBeliLabel.setText("JUMLAH BELI :");

        totalHargaLabel.setText("TOTAL HARGA :");

        hargaYangDibayarLabel.setText("HARGA YANG DIBAYAR : ");

        kembalianLabel.setText("KEMBALIAN : ");

        jTextField1HargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1HargaBarangActionPerformed(evt);
            }
        });

        jTextField2JumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2JumlahBeliActionPerformed(evt);
            }
        });

        jTextField3TotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3TotalHargaActionPerformed(evt);
            }
        });

        jTextField4HargaYangDibayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4HargaYangDibayarActionPerformed(evt);
            }
        });

        ListNamaBarang.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[] { "Mouse", "Headphone", "Keyboard", "Speaker", " " }
        ));
        ListNamaBarang.setSelectedIndex(-1);
        ListNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListNamaBarangActionPerformed(evt);
            }
        });

        btnTotalHarga.setText("HITUNG TOTAL HARGA");
        btnTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalHargaActionPerformed(evt);
            }
        });

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENGHITUNG TOTAL HARGA PADA KASIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(kembalianLabel)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jTextField5Kembalian,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        125,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                        .addComponent(
                                                                                                hargaYangDibayarLabel)
                                                                                        .addGap(81, 81, 81)
                                                                                        .addComponent(
                                                                                                jTextField4HargaYangDibayar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                157,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(namaBarangLabel)
                                                                                        .addComponent(hargaBarangLabel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(totalHargaLabel)
                                                                                        .addComponent(jumlahBeliLabel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                                .addGap(138, 138, 138)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(
                                                                                                jTextField1HargaBarang)
                                                                                        .addComponent(ListNamaBarang, 0,
                                                                                                133, Short.MAX_VALUE)
                                                                                        .addComponent(
                                                                                                jTextField2JumlahBeli)
                                                                                        .addComponent(
                                                                                                jTextField3TotalHarga)))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(41, 41, 41)
                                                                .addComponent(btnTotalHarga)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(btnKeluar)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namaBarangLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ListNamaBarang, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hargaBarangLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1HargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jumlahBeliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2JumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalHargaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hargaYangDibayarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4HargaYangDibayar,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(kembalianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTotalHarga)
                                        .addComponent(btnKeluar))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        pack();
    }

    private void jTextField1HargaBarangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField4HargaYangDibayarActionPerformed(java.awt.event.ActionEvent evt) {
        total_bayar = Long.parseLong(jTextField4HargaYangDibayar.getText());
        kembalian = total_bayar - jumlah_harga;

        gantiFormat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(total_bayar);
        token = new StringTokenizer(gantiFormat, ".");
        gantiFormat = token.nextToken();
        gantiFormat = gantiFormat.replace(',', '.');
        jTextField4HargaYangDibayar.setText(gantiFormat);

        gantiFormat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(kembalian);
        token = new StringTokenizer(gantiFormat, ".");
        gantiFormat = token.nextToken();
        gantiFormat = gantiFormat.replace(',', '.');
        jTextField5Kembalian.setText(gantiFormat);
    }

    private void btnTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {
        jumlah_beli = Integer.parseInt(jTextField2JumlahBeli.getText());
        jumlah_harga = jumlah_beli * harga_barang;

        gantiFormat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(jumlah_harga);
        token = new StringTokenizer(gantiFormat, ".");
        gantiFormat = token.nextToken();
        gantiFormat = gantiFormat.replace(',', '.');
        jTextField3TotalHarga.setText(gantiFormat);
    }

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void ListNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {
        nama_barang = (String) ListNamaBarang.getSelectedItem();

        if (nama_barang == "Mouse") {
            harga_barang = 250000;
        } else if (nama_barang == "Headphone") {
            harga_barang = 300000;
        } else if (nama_barang == "Keyboard") {
            harga_barang = 200000;
        } else if (nama_barang == "Speaker") {
            harga_barang = 150000;
        }

        gantiFormat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(harga_barang);
        token = new StringTokenizer(gantiFormat, ".");
        gantiFormat = token.nextToken();
        gantiFormat = gantiFormat.replace(',', '.');
        jTextField1HargaBarang.setText(gantiFormat);
    }

    private void jTextField2JumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField3TotalHargaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> ListNamaBarang;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTotalHarga;
    private javax.swing.JLabel hargaBarangLabel;
    private javax.swing.JLabel hargaYangDibayarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1HargaBarang;
    private javax.swing.JTextField jTextField2JumlahBeli;
    private javax.swing.JTextField jTextField3TotalHarga;
    private javax.swing.JTextField jTextField4HargaYangDibayar;
    private javax.swing.JTextField jTextField5Kembalian;
    private javax.swing.JLabel jumlahBeliLabel;
    private javax.swing.JLabel kembalianLabel;
    private javax.swing.JLabel namaBarangLabel;
    private javax.swing.JLabel totalHargaLabel;
    // End of variables declaration
}
