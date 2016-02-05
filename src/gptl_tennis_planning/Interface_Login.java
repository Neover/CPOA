package gptl_tennis_planning;

import Connexion.DBConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class Interface_Login extends javax.swing.JDialog { //Classe pour se loger

    Connection conn = new DBConnexion().connect();

    public Interface_Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocation(0, 0);
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lab_Pwd = new javax.swing.JLabel();
        Lab_Title = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        Lab_ID = new javax.swing.JLabel();
        TF_PWD = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1050, 725));
        setMinimumSize(new java.awt.Dimension(1050, 725));
        setPreferredSize(new java.awt.Dimension(1050, 725));
        setResizable(false);
        getContentPane().setLayout(null);

        Lab_Pwd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_Pwd.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Pwd.setText("Mot de passe :");
        getContentPane().add(Lab_Pwd);
        Lab_Pwd.setBounds(410, 300, 129, 22);

        Lab_Title.setFont(new java.awt.Font("Algerian", 1, 30)); // NOI18N
        Lab_Title.setForeground(new java.awt.Color(255, 255, 255));
        Lab_Title.setText("Grand Prix Tournoi de lyon ");
        getContentPane().add(Lab_Title);
        Lab_Title.setBounds(370, 20, 487, 97);
        getContentPane().add(TF_ID);
        TF_ID.setBounds(560, 270, 129, 20);

        Lab_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_ID.setForeground(new java.awt.Color(255, 255, 255));
        Lab_ID.setText("Identifiant :");
        getContentPane().add(Lab_ID);
        Lab_ID.setBounds(420, 270, 109, 26);
        getContentPane().add(TF_PWD);
        TF_PWD.setBounds(560, 300, 130, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 440, 100, 30);
        getContentPane().add(BackGround);
        BackGround.setBounds(0, 0, 1100, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "select * from log where login=? and pwd=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, TF_ID.getText());
            ps.setString(2, TF_PWD.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.dispose();
                if (rs.getInt(4) == 1) {
                    Interface_Admin IA = new Interface_Admin();
                    IA.show();
                } else {
                    Interface_Joueur IJ = new Interface_Joueur();
                    IJ.show();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nom d'Utilisateur ou Mot de Passe Invalide");
            }
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            Interface_Login dialog = new Interface_Login(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                ;
                    
            @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel Lab_ID;
    private javax.swing.JLabel Lab_Pwd;
    private javax.swing.JLabel Lab_Title;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JPasswordField TF_PWD;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
