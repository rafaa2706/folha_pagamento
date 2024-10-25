/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Dependente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.Constantes;

/**
 *
 * @author 1_DEV
 */
public class DependenteDAO extends GenericDAO{
    
    private Connection conn;

    public DependenteDAO(Connection conn) {
        this.conn = conn;
    }

    public int inserir(Dependente dependente)  throws SQLException {
        String sql = "INSERT INTO dependente (nome_dep, cpf_dep, data_nasc, id_colab) VALUES (?,?,?,?)";
        try ( PreparedStatement stmste = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmste.setString(1, dependente.getNomeDep());
            stmste.setString(2, dependente.getCpfDep());
            stmste.setString(3, dependente.getDataNasc());
            stmste.setInt(4, dependente.getId_colaborador());
            stmste.executeUpdate();
   
            try (ResultSet generatedKeys = stmste.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1); // Retorna o ID gerado
            } else {
                throw new SQLException("Falha ao inserir colaborador, nenhum ID gerado.");
                }
            
            }
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro no método inserir, classe DependenteDAO: " + ex);
                return -1; // Retorna -1 se houver falha
            }
    }
    
    
    
    public List<Dependente> listarDependentes() throws SQLException {
        
        List<Dependente> dependentes = new ArrayList<>();
        String sql = "SELECT co.id_colab, dp.nome_dep, dp.cpf_dep, dp.data_nasc, dp.id_dependente FROM colaborador co JOIN dependente dp ON dp.id_colab = co.id_colab WHERE co.id_colab = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, Constantes.ID_COLAB);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Dependente dep = new Dependente();
            dep.setNomeDep(rs.getString("nome_dep"));
            dep.setCpfDep(rs.getString("cpf_dep"));
            dep.setDataNasc(rs.getString("data_nasc"));
            dep.setId_dep(rs.getInt("id_dependente"));
            
            
            dependentes.add(dep);
        }
        rs.close();
        stmt.close();
        return dependentes;

    }
    
        
}
