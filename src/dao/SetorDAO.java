/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Setor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1_DEV
 */
public class SetorDAO {
    
    private Connection conn;

    public SetorDAO(Connection conn) {
        this.conn = conn;
    }

    public int inserir(Setor setor)  throws SQLException {
        int idSetor = 0;
        String sql = "INSERT INTO setor (setor) VALUES (?)";
        try ( PreparedStatement stmste = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmste.setString(1, setor.getSetor());
            stmste.executeUpdate();
            
            try (ResultSet generatedKeys = stmste.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    idSetor = generatedKeys.getInt(1); // Retorna o ID gerado
                }
            }
            return idSetor;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo inserir, classe SetorDAO " + ex);
            return idSetor;
        }
    }
    
     public List<Setor> listarSetores(){
        
         String sql = "SELECT * FROM setor";
        try (PreparedStatement stmste = conn.prepareStatement(sql)){
            
            ResultSet rs = stmste.executeQuery();
            
            List<Setor> listaSetores = new ArrayList<>();
            
            while(rs.next()){
                Setor setor = new Setor(sql);
                setor.setSetor(rs.getString("setor"));
                setor.setIdSetor(rs.getInt("id_setor"));
                System.out.println(setor.getSetor());
                
                listaSetores.add(setor);
            }
            
            rs.close();
            return listaSetores;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo listarSetores, classe setorDAO "+ex);
            return null;
        }
    }
}
