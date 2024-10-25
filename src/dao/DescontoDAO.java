/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Desconto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1_DEV
 */
public class DescontoDAO extends GenericDAO{
    
    private Connection conn;

    public DescontoDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean inserir(Desconto desc)  throws SQLException {
        String sql = "INSERT INTO desconto (inss_valor, vt_valor, irrf_valor, faltas_qtd, faltas_valor, desconto_total, id_colab) VALUES (?,?,?,?,?,?,?)";
        try ( PreparedStatement stmste = conn.prepareStatement(sql)) {
            stmste.setDouble(1, desc.getValorINSS());
            stmste.setDouble(2, desc.getValorVT());
            stmste.setDouble(3, desc.getValorIRRF());
            stmste.setInt(4, desc.getQtdFaltas());
            stmste.setDouble(5, desc.getValorFaltas());
            stmste.setDouble(6, desc.getDescTotal());
            stmste.setInt(7, desc.getId_colaborador());
            stmste.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo inserir, classe DescontoDAO " + ex);
            return false;
        }
    }
}
