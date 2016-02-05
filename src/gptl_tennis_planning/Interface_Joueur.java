package gptl_tennis_planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import javax.swing.JOptionPane;

public class Interface_Joueur extends javax.swing.JFrame {

    private DateFormat DF = DateFormat.getDateInstance();

    Interface_Joueur() {
        this.setLocation(0, 0);
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Valider = new javax.swing.JButton();
        Lab_ID = new javax.swing.JLabel();
        Lab_ID2 = new javax.swing.JLabel();
        Lab_ID3 = new javax.swing.JLabel();
        CBTerrain = new javax.swing.JComboBox();
        CBHeure = new javax.swing.JComboBox();
        Lab_ID4 = new javax.swing.JLabel();
        TFReserv = new javax.swing.JTextField();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 750));
        setMinimumSize(new java.awt.Dimension(1050, 750));
        setPreferredSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reserver Terrain d'entrainement :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 30, 670, 90);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Reservation", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jDateChooser1.setMaximumSize(new java.awt.Dimension(30, 22));
        jDateChooser1.setMinimumSize(new java.awt.Dimension(30, 22));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(10, 20));

        Valider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });

        Lab_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_ID.setForeground(new java.awt.Color(255, 255, 255));
        Lab_ID.setText("Date :");

        Lab_ID2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_ID2.setForeground(new java.awt.Color(255, 255, 255));
        Lab_ID2.setText("Terrain Disponible :");

        Lab_ID3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_ID3.setForeground(new java.awt.Color(255, 255, 255));
        Lab_ID3.setText("Créneau Horaire Disponible :");

        CBTerrain.setEditable(true);
        CBTerrain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        CBTerrain.setSelectedIndex(-1);
        CBTerrain.setToolTipText("");
        CBTerrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTerrainchoixJob(evt);
            }
        });

        CBHeure.setEditable(true);
        CBHeure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8H - 10H", "10H - 12H", "14H - 16H", "16H - 18H" }));
        CBHeure.setSelectedIndex(-1);
        CBHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBHeurechoixJob(evt);
            }
        });

        Lab_ID4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_ID4.setForeground(new java.awt.Color(255, 255, 255));
        Lab_ID4.setText("Nom Réservation :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lab_ID3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lab_ID2)
                            .addComponent(Lab_ID)
                            .addComponent(Lab_ID4))
                        .addGap(84, 84, 84)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Valider)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CBTerrain, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_ID4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(TFReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lab_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTerrain, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_ID3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Valider)
                .addGap(118, 118, 118))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 140, 840, 380);

        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neo\\Documents\\CPOA\\1fdf67babd432d7589fb8b0b4b59fc15_large.jpeg")); // NOI18N
        getContentPane().add(BackGround);
        BackGround.setBounds(0, 0, 1106, 716);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        try {
            String DateObtenue = DF.format(jDateChooser1.getDate());
            String url = "jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/p1406314";
            ResultSet rst;
            String req;
            req = "INSERT INTO `Entrainement`(`NoTerrain`, `Horaire`, `DateEntrainement`, `DureeEntrainement`, `NomReservation`) VALUES(?,?,?,?);";
            PreparedStatement ps;
            Connection con;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connexion Successful");
            } catch (ClassNotFoundException e) {
                System.out.println("Connexion Failed " + e);
            }
            con = DriverManager.getConnection(url, "p1406314", "214712");
            System.out.println("Connexion DataBase Successful");
            
            if (DateObtenue == null || CBTerrain.getSelectedItem() == null || CBHeure.getSelectedItem() == null || TFReserv.getText() == "") {
                JOptionPane.showMessageDialog(this, "Veuiilez saisir le formulaire au complet");
            } else {
                ps = con.prepareStatement(req);
                ps.setString(1, CBTerrain.getSelectedItem().toString());
                ps.setString(2, CBHeure.getSelectedItem().toString());
                ps.setString(3, DateObtenue);
                ps.setString(4, TFReserv.getText());
                rst = ps.executeQuery(req);
                JOptionPane.showConfirmDialog(this, "Voulez vous enregistrer ce Formulaire ?");

            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ValiderActionPerformed

    private void CBTerrainchoixJob(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTerrainchoixJob

    }//GEN-LAST:event_CBTerrainchoixJob

    private void CBHeurechoixJob(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBHeurechoixJob

    }//GEN-LAST:event_CBHeurechoixJob

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Interface_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JComboBox CBHeure;
    private javax.swing.JComboBox CBTerrain;
    private javax.swing.JLabel Lab_ID;
    private javax.swing.JLabel Lab_ID2;
    private javax.swing.JLabel Lab_ID3;
    private javax.swing.JLabel Lab_ID4;
    private javax.swing.JTextField TFReserv;
    private javax.swing.JButton Valider;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
