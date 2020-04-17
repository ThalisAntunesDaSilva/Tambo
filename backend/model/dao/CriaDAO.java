package model.dao;

import ConnectionFactory.ConnectionFactory;
import animais.Cria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CriaDAO {
    private Connection connection;
    private ArrayList<Cria>crias = new ArrayList<Cria>();
    
    public CriaDAO (){
        this.connection = ConnectionFactory.getConnection();
    }
     public void addVaca(Cria cria){
        System.out.println("CriaDAO - " + cria.toString());
        String sql = "INSERT INTO Cria(codCria,nomeCria) VALUES (?,?)"; 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cria.getBrinco());
            stmt.setString(2, cria.getNome());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" +ex);
            throw new RuntimeException (ex);
        }
            crias.add(cria);}
    public void delete(Cria cria) {
        String sql = "DELETE FROM cria WHERE codNome = ?";
try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cria.getNome());
            stmt.execute();
        JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u); }
                    crias.add(cria); 
    }
}
