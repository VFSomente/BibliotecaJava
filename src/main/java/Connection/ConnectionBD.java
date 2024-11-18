package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    // Usuário e senha Admin banco de dados //
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "2006vgbr";

    private static Connection conn;

    public static Connection getConnection() {
        try {
            // Validação de acesso ao banco de dados //
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                conn.setAutoCommit(true);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }

}

