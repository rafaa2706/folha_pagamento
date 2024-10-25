/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Vencimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1_DEV
 */
public class VencimentoDAO extends GenericDAO{
    private Connection conn;

    public VencimentoDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean inserir(Vencimento venc)  throws SQLException {
        String sql = "INSERT INTO vencimento (hora_extra_qtd, hora_extra_valor, hora_extra_fd_qtd, hora_extra_fd_valor, salario_familia_valor, venc_total,fgts_valor, id_colab) VALUES (?,?,?,?,?,?,?,?)";
        try ( PreparedStatement stmste = conn.prepareStatement(sql)) {
            stmste.setInt(1, venc.getHoraExtraQtd());
            stmste.setDouble(2, venc.getHoraExtraValor());
            stmste.setInt(3, venc.getHoraExtraFDQtd());
            stmste.setDouble(4, venc.getHoraExtraFDValor());
            stmste.setDouble(5, venc.getSalarioFamilia());
            stmste.setDouble(6, venc.getVencTotal());
            stmste.setDouble(7, venc.getValorFGTS());
            stmste.setInt(8, venc.getId_colaborador());
            stmste.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no metodo inserir, classe VencimentoDAO " + ex);
            return false;
        }
    }
}
