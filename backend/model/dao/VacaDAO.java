package model.dao;

import ConnectionFactory.ConnectionFactory;
import animais.Vaca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacaDAO {
    private Connection connection;
    private ArrayList<Vaca>vacas = new ArrayList<Vaca>();
    
    public VacaDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void addVaca(Vaca vaca){
        System.out.println("VacaDAO - " + vaca.toString());
        String sql = "INSERT INTO Vaca(codVaca,nomeVaca) VALUES (?,?)"; 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, vaca.getBrinco());
            stmt.setString(2, vaca.getNome());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " +ex);
            throw new RuntimeException (ex);
        }
            vacas.add(vaca);}
    

   public void delete(Vaca vaca) {
         

        String sql = "DELETE FROM vaca WHERE codNome = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, vaca.getNome());
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        vacas.add(vaca);
    }

}
