package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/your_db";
        String user = "postgres";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
