package ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//@ThalisAntunes
public class ConnectionFactory {

    private static ConnectionFactory conexaoUtil;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/tambo";
    private static final String user = "root";
    private static final String senha = "";

    public static  Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, user, senha);
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro da conexão: ", ex);
       }}
   
    public static void encerrarConexao(Connection con){
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }}}    

    public static void encerrarConexao(Connection con, PreparedStatement stnt){
        encerrarConexao(con);
        if(stnt != null){
            try {
                stnt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }}}
    public static void encerrarConexao (Connection con, PreparedStatement stnt, ResultSet rs){
       encerrarConexao(con,stnt);
       if(rs != null){
           try {
               rs.close();
           } catch (SQLException ex) {
               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
           }}}

     
}
