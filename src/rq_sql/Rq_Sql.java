
/*
* Version à finaliser en cours des test
* 
 */
package rq_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author patrick
 */
public class Rq_Sql {
    static String            DB_URL      = "jdbc:mysql://localhost:3306/parc";    // URL de la BBD
    static String            DB_DRV      = "org.mariadb.jdbc.Driver";            // Driver MySQL
    static String            DB_USER     = "mysql";                                // Utilisateur MYSQL
    static String            DB_PASSWD   = "azerty";                             // Mot de passe
    static boolean           erreur      = false;
    static Connection        dcl_connect = null;
    static Statement         lie_connect = null;
    static ResultSet         tab_result  = null;
    static RqSQL_Requeteur   ecr_rq;
    static RqSQL_Parametre   ecr_pa;
    static RqSQL_About       ecr_as;
    static ResultSetMetaData info_result;

    Rq_Sql() {
        RqSQL_Requeteur requeteur = new RqSQL_Requeteur();
        Rq_Sql.ecr_rq = requeteur;
        java.awt.EventQueue.invokeLater(() -> {
		requeteur.setVisible(true);
	});


        RqSQL_Parametre parametre = new RqSQL_Parametre();
        Rq_Sql.ecr_pa = parametre;
        java.awt.EventQueue.invokeLater(() -> {
		parametre.setVisible(true);
	});


        RqSQL_About ausujet = new RqSQL_About();
        Rq_Sql.ecr_as = ausujet;
        java.awt.EventQueue.invokeLater(() -> {
		ausujet.setVisible(false);
	});

    }

    public static void AuSujet() {

        // TODO code application logic here
    }

    public static void Executer() {

        // TODO code application logic here
    }

    public static void Parametres() {

        // TODO code application logic here
    }

    public static void Quitter() {

        // TODO code application logic here
    }

    public static void Tester(String Ident, String Mdp) {
        try {
            dcl_connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
        } catch (SQLException ex) {
            erreur = true;
            System.out.printf("Erreur de connection à la base de donnée --> " + ex + "\n");
        }
    }

    public static void Valider(String Ident, String Mdp) {

        // TODO code application logic here
        // DB_URL = ecr_pa.
    }

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
    public static void main(String[] args) {

        // TODO code application logic here }
        // RqSQL_Interface Application = new RqSQL_Interface ();
        Rq_Sql Application = new Rq_Sql();

        System.out.println("Appuyez sur entree pour continuer...\n");
        new java.util.Scanner(System.in).nextLine();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
