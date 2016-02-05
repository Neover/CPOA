package gptl_tennis_planning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Interface_Training extends javax.swing.JFrame {

    Interface_Training() {
        this.setLocation(0, 0);
        initComponents();
        setLocationRelativeTo(this);

        this.afficherJoueur();
    }

    private void afficherJoueur() {
        try {
            String url = "jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/p1406314";
            ResultSet rst;
            String req;
            PreparedStatement ps;
            Connection con;
            DefaultListModel dlm1 = new DefaultListModel();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Connexion Successful");
            } catch (ClassNotFoundException e) {
                System.out.println("Connexion Failed " + e);
            }
            con = DriverManager.getConnection(url, "p1406314", "214712");
            System.out.println("Connexion DataBase Successful");
            req = "SELECT * FROM `Entrainement`;";
            ps = con.prepareStatement(req);
            rst = ps.executeQuery(req);
            while (rst.next()) {
                dlm1.addElement(rst.getString(4) + "  " + rst.getString(3) + "    " + rst.getString(2) + "          " + rst.getString(1));
            }

            list2.setModel(dlm1);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 750));
        setMinimumSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Information Entrainement", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        list2.setBackground(new java.awt.Color(0, 0, 0));
        list2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        list2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(list2);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IDRéservation |    Date    | Créneau Horaire | Terrain");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 120, 480, 260);
        jPanel1.getAccessibleContext().setAccessibleName("Choisir Joueurs pour le 1er Tour :");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Option Training Match", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Algerian", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jButton1.setText("Modifier Date Entrainement");

        jButton2.setText("Supprimer Entrainement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(520, 120, 490, 260);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Training");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 20, 460, 90);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Retour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(880, 650, 110, 30);

        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\Neo\\Documents\\CPOA\\1fdf67babd432d7589fb8b0b4b59fc15_large.jpeg")); // NOI18N
        BackGround.setOpaque(true);
        getContentPane().add(BackGround);
        BackGround.setBounds(0, -2, 1020, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        Interface_Admin IC = new Interface_Admin();
        IC.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String message = " Voulez Vous Vraiment Supprimer Ce Match ? ";
        String title = "Suppression Match";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        JOptionPane.showConfirmDialog(this, evt, "Voulez Vous Vraiment Supprimer Ce Match ?", 100, 100);

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface_Training().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList list2;
    // End of variables declaration//GEN-END:variables
}
