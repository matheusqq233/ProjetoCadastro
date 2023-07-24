/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CadVO;
import persistencia.ConexaoBanco;

public class CadDAO {
        public void cadastrar(CadVO fVO)throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
               sql = "insert into cadastro(id , nome , datanasc , cpf , cidade , estado, email, senha)"
                    + "values (null, '" + fVO.getNome() + "', '"
                                       + fVO.getDatanasc() + "' , "
                                       + fVO.getCpf() + " , '"
                                       + fVO.getCidade() + "' , '"
                                       + fVO.getEstado() + "' , '"
                                       + fVO.getEmail()+ "' , '"
                                       + fVO.getSenha() +"') ";
          stat.execute(sql);
            
        }catch (SQLException e){
            throw new SQLException("Erro ao cadastrar Funcionario!");
        }finally{
            con.close();
            stat.close();
        }
    }
}