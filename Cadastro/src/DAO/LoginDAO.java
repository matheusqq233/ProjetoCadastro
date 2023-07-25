/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CadVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author T-GAMER
 */
public class LoginDAO {
            public void verificarDados(CadVO fVO)throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
          stat.execute(sql);
            
        }catch (SQLException e){
            throw new SQLException("Erro ao cadastrar Funcionario!");
        }finally{
            con.close();
            stat.close();
        }
    }
}
