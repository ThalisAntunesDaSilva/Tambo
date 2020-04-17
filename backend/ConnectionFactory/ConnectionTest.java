package ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
//@ThalisAntunes
public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        try {
         Connection connection = new ConnectionFactory().getConnection();
         System.out.println("Sucesso Conexão Aberta!");
         connection.close();
        } catch (SQLException e) {
            throw new SQLException("Problemas nos parâmetros de conexão.\n" + e.getMessage());
        }
     }
}
