package gptl_tennis_planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Interface_Tournament extends javax.swing.JFrame {

    Interface_Tournament() {
        this.setLocation(0, 0);
        initComponents();
        setLocationRelativeTo(this);

        this.afficherJoueur();
        ChangeName(jTable1, 0, "Match en Solo");
        ChangeName(jTable1, 1, "Equipe 1");
        ChangeName(jTable1, 2, "Equipe 2");
        ChangeName(jTable2, 0, "Match en Equipe");
        ChangeName(jTable2, 1, "Equipe 1");
        ChangeName(jTable2, 2, "Equipe 2");
    }

    public void ChangeName(JTable table, int col_index, String col_name) {
        table.getColumnModel().getColumn(col_index).setHeaderValue(col_name);
    }

    private void afficherJoueur() {
        try {
            String url = "jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/p1406314";
            ResultSet rst;
            ResultSet rst2;
            String req;
            String req2;
            PreparedStatement ps;
            PreparedStatement ps2;
            Connection con;
            DefaultListModel dlm1 = new DefaultListModel();
            DefaultListModel dlm2 = new DefaultListModel();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connexion Successful");
            } catch (ClassNotFoundException e) {
                System.out.println("Connexion Failed " + e);
            }
            con = DriverManager.getConnection(url, "p1406314", "214712");
            System.out.println("Connexion DataBase Successful");
            req = "SELECT * FROM `match` WHERE equipe = 1;";
            req2 = "SELECT * FROM `match` WHERE equipe = 0;";
            ps = con.prepareStatement(req);
            ps2 = con.prepareStatement(req2);
            rst = ps.executeQuery(req);
            rst2 = ps2.executeQuery(req2);
            while (rst.next()) {
                dlm1.addElement(" " + rst.getString(2) + " / " + rst.getString(3));
                System.out.println();
                dlm1.addElement(" " + rst.getString(4) + " / " + rst.getString(5));
            }
            while (rst2.next()) {
                dlm2.addElement(" " + rst2.getString(2));
                System.out.println();
                dlm2.addElement(" " + rst2.getString(3));
            }

            list1.setModel(dlm1);
            list2.setModel(dlm2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddPlayer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddTeam = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 750));
        setMinimumSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Joueurs Inscrits", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        AddPlayer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddPlayer.setText("Ajouter Joueur ");
        AddPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPlayer(evt);
            }
        });

        list2.setBackground(new java.awt.Color(0, 0, 0));
        list2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        list2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(list2);

        list1.setBackground(new java.awt.Color(0, 0, 0));
        list1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        list1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(list1);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Joueurs Match Simple :");

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Joueurs Match Double :");

        AddTeam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddTeam.setText("Ajouter Equipe");
        AddTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeam(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddTeam)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddTeam)
                    .addComponent(AddPlayer))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 100, 1010, 260);
        jPanel1.getAccessibleContext().setAccessibleName("Choisir Joueurs pour le 1er Tour :");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Joueurs Choisis", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 390, 1010, 250);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tournament");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 20, 460, 90);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(940, 660, 79, 25);

        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neo\\Documents\\CPOA\\1fdf67babd432d7589fb8b0b4b59fc15_large.jpeg")); // NOI18N
        BackGround.setOpaque(true);
        getContentPane().add(BackGround);
        BackGround.setBounds(0, -2, 1090, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPlayer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPlayer
        int i = 0;
        try {
            if (list2.getSelectedValue() != null) {
                jTable1.setValueAt(list2.getSelectedValue(), 0, 1);
            } else {
                JOptionPane.showMessageDialog(this, "Aucun Joueur n'a été séléctionné");
            }
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        /* jTable1.setValueAt(list2.getSelectedValue(), i, 1);
            i = i + 1;*/
    }//GEN-LAST:event_AddPlayer

    private void AddTeam(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeam
        int i = 0;
        try {
            if (list1.getSelectedValue() != null) {
                jTable1.setValueAt(list1.getSelectedValue(), 0, 2);
            } else {
                JOptionPane.showMessageDialog(this, "Aucune Equipe n'a été séléctionnée");
            }
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
    }//GEN-LAST:event_AddTeam

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Interface_Admin IC = new Interface_Admin();
        IC.show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Tournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface_Tournament().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPlayer;
    private javax.swing.JButton AddTeam;
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JList list1;
    private javax.swing.JList list2;
    // End of variables declaration//GEN-END:variables
}
