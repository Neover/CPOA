package Connexion;

import java.sql.SQLException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;
import oracle.jdbc.pool.*;

public class ConnexionOracleFactory {

    public static java.sql.Connection creerConnexion() {
        try {
            Properties props = new Properties();
            FileInputStream fichier = new FileInputStream("./src/connexion/connexion.properties");
            props.load(fichier);
            OracleDataSource ods = new OracleDataSource();

            ods.setDriverType(props.getProperty("pilote"));
            ods.setPortNumber(Integer.parseInt(props.getProperty("port")));
            ods.setDatabaseName(props.getProperty("service"));
            ods.setUser(props.getProperty("user"));
            ods.setPassword(props.getProperty("pwd"));
            ods.setServerName(props.getProperty("serveur"));
            return (ods.getConnection());
        } catch (SQLException | IOException | NumberFormatException e) {
            System.out.println("Erreur lors de la lecture du fichier de configuration : " + e.getMessage());
            return null;
        }
    }

    private static java.sql.Connection connexion;

}// fin ConnexionOracleFactory
