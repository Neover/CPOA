package Connexion;

import Joueur.Donnees_Matchs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;

public class DBConnexion {

    private Connection DBConnexion;
    private Connection connexion;

    public DBConnexion() {

    }

    public void openConnection(javax.swing.DefaultListModel listModel) {

        connexion = ConnexionOracleFactory.creerConnexion();
        if (connexion == null) {
            listModel.addElement("Probleme de connection.");
            System.exit(1);
        }
    }

    public void closeConnection(javax.swing.DefaultListModel listModel) {
        try {
            connexion.close();	// Fermeture de la connexion
        } catch (SQLException e) {
            System.out.println("Erreur Oracle " + e.getMessage());
        }
    }

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connexion Successful");
        } catch (ClassNotFoundException e) {
            System.out.println("Connexion Failed " + e);
        }
        String url = "jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/p1406314";
        try {
            DBConnexion = DriverManager.getConnection(url, "p1406314", "214712");
            System.out.println("Connexion DataBase Successful");
        } catch (SQLException sqle) {
            System.out.println("Connexion DataBase Failed " + sqle);
        }
        return DBConnexion;
    }

    public DefaultListModel consulterMatchSimple(DefaultListModel ListModel, List<Donnees_Matchs> lesEmployes) throws SQLException {
        String J1;
        String J2;
        String DateMatchSimple;
        String Arbitre;
        int Terrain;
        String sal;
        String comm;
        int numdept;


        ListModel.clear();
        
        try {
            openConnection(ListModel);
            
            Statement requete;
            requete = connexion.createStatement();
            
            ResultSet ensresul;
            ensresul = requete.executeQuery("select joueur_un ,joueur_deux ,substr(dateMatch,1,10) ,arbitre , terrain from match where equipe != 1");
            
            while (ensresul.next()) {
                J1 = ensresul.getString(1);
                J2 = ensresul.getString(2);
                DateMatchSimple = ensresul.getString(3);
                Arbitre = ensresul.getString(4);
                Terrain = ensresul.getInt(5);
                ListModel.addElement(J1 + "    " + J2 + "    " + DateMatchSimple + "    " + Arbitre + "    " + Terrain);
            }
            ensresul.close();
            requete.close();
            closeConnection(ListModel);
            } catch (SQLException e) {
                ListModel.addElement("Erreur execution requete " + e.getMessage());
        }
        return(ListModel);
    }
}
