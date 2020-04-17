package model.dao;
import ConnectionFactory.ConnectionFactory;
import animais.Touro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TouroDAO {
    private Connection connection;
    private ArrayList<Touro> touros = new ArrayList<Touro>();
    
    public TouroDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void addTouro (Touro touro){
        System.out.println("TouroDAO - " + touro.toString());
        String sql = "INSERT INTO Touro(codTouro,nomeTouro) VALUES (?,?)"; 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, touro.getBrinco());
            stmt.setString(2, touro.getNome());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" +ex);
            throw new RuntimeException (ex);
        }
            touros.add(touro);}
    
 public void delete(Touro touro) {
        String sql = "DELETE FROM touro WHERE codNome = ?";
try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, touro.getNome());
            stmt.execute();
        JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u); }
                    touros.add(touro); 
    }

    
}
