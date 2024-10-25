/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utils.Constantes;

/**
 *
 * @author 1_DEV
 */
public class ColaboradorDAO extends GenericDAO {

    private Connection conn;

    public ColaboradorDAO(Connection conn) {
        this.conn = conn;
    }

    public int inserir(Colaborador colaborador) throws SQLException {
        int idColab = 0;
        String sql = "INSERT INTO colaborador (nome_colab, cpf, salario_liquido, id_cargo, id_setor, id_empresa) VALUES (?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement stmste = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmste.setString(1, colaborador.getNome());
            stmste.setString(2, colaborador.getCpf());
            stmste.setDouble(3, colaborador.getSalLiquido());
            stmste.setInt(4, colaborador.getId_cargo());
            stmste.setInt(5, colaborador.getId_setor());
            stmste.setInt(6, Constantes.ID_EMPRESA);
            stmste.executeUpdate();

            try ( ResultSet generatedKeys = stmste.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    idColab = generatedKeys.getInt(1); // Retorna o ID gerado
                }
            }
            return idColab;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo inserir, classe ColaboradorDAO " + ex);
            return idColab;
        }
    }

    public int atualizarSalarioLiquido(double salLiquido, int idColab) throws SQLException {
        String sql = "UPDATE colaborador SET salario_liquido = ? WHERE id_colab = ? ";
        try ( PreparedStatement stmste = conn.prepareStatement(sql)) {
            stmste.setDouble(1, salLiquido);
            stmste.setInt(2, idColab);
            stmste.executeUpdate();
            
            return idColab;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo inserir, classe ColaboradorDAO " + ex);
            return idColab;
        }
    }

    public Colaborador buscarColaborador(String cpf, int idEmpresa) throws SQLException {
        String sql = "SELECT co.id_colab, co.nome_colab, co.cpf, co.id_setor, co.salario_liquido, ca.cargo, se.setor, ve.hora_extra_qtd, ve.hora_extra_valor, ve.hora_extra_fd_qtd, ve.hora_extra_fd_valor, ve.salario_familia_valor, ve.venc_total, ve.fgts_valor, de.inss_valor, de.vt_valor, de.irrf_valor, de.faltas_qtd, de.faltas_valor, de.desconto_total FROM colaborador co JOIN cargo ca ON co.id_cargo = ca.id_cargo JOIN setor se ON se.id_setor = co.id_setor JOIN vencimento ve ON ve.id_colab = co.id_colab JOIN desconto de ON de.id_colab = co.id_colab WHERE co.id_empresa = ? AND co.cpf = ? ";

        Colaborador colaborador = new Colaborador();

        try ( PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idEmpresa);
            stmt.setString(2, cpf);
            // Execute a consulta e obtenha o número de linhas correspondentes
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                colaborador.setNome(rs.getString("nome_colab"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setSalLiquido(rs.getDouble("salario_liquido"));
                colaborador.setHoraExtraQtd(rs.getInt("hora_extra_qtd"));
                colaborador.setHoraExtraValor(rs.getDouble("hora_extra_valor"));
                colaborador.setHoraExtraFdQtd(rs.getInt("hora_extra_fd_qtd"));
                colaborador.setHoraExtraFdValor(rs.getDouble("hora_extra_fd_valor"));
                colaborador.setSalFamiiaValor(rs.getDouble("salario_familia_valor"));
                colaborador.setVencTotal(rs.getDouble("venc_total"));
                colaborador.setFgtsValor(rs.getDouble("fgts_valor"));
                colaborador.setInssValor(rs.getDouble("inss_valor"));
                colaborador.setVtValor(rs.getDouble("vt_valor"));
                colaborador.setIrrfValor(rs.getDouble("irrf_valor"));
                colaborador.setFaltasQtd(rs.getInt("faltas_qtd"));
                colaborador.setFaltasValor(rs.getDouble("faltas_valor"));
                colaborador.setDescTotal(rs.getDouble("desconto_total"));
                colaborador.setId_colab(rs.getInt("id_colab"));
                colaborador.setId_setor(rs.getInt("id_setor"));
                
                Constantes.ID_SETOR = colaborador.getId_setor();
                
                Constantes.ID_COLAB = rs.getInt("id_colab");
            }

            return colaborador;
        } catch (SQLException e) {
            e.printStackTrace();
            return colaborador;
        }       
        
    }
    
    
    
}