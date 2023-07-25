/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.CadVO;
import persistencia.ConexaoBanco;

public class CadDAO {
    public void cadastrar(CadVO fVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            // Verifica se o CPF já está cadastrado no banco
            String cpfExistQuery = "SELECT id FROM cadastro WHERE cpf = '" + fVO.getCpf() + "'";
            ResultSet cpfExistResult = stat.executeQuery(cpfExistQuery);

            if (cpfExistResult.next()) {
                throw new SQLException("CPF já cadastrado");
            }

            // Caso o CPF não esteja cadastrado, realiza o cadastro normalmente
            String sql = "INSERT INTO cadastro (id, nome, datanasc, cpf, cidade, estado, email, senha) "
                    + "VALUES (null, '" + fVO.getNome() + "', '"
                    + fVO.getDatanasc() + "', '"
                    + fVO.getCpf() + "', '"
                    + fVO.getCidade() + "', '"
                    + fVO.getEstado() + "', '"
                    + fVO.getEmail() + "', '"
                    + fVO.getSenha() + "')";

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar usuário: " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    // ... outros métodos da classe ...
      public ArrayList<CadVO> buscar() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select id, nome, datanasc, cpf, cidade, estado, email, '********' as senha from cadastro";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<CadVO> func = new ArrayList<>();
            while (rs.next()) {
                CadVO fVO = new CadVO();
                fVO.setId(rs.getInt("id"));
                fVO.setNome(rs.getString("nome"));
                fVO.setDatanasc(rs.getString("datanasc"));
                fVO.setCpf(rs.getString("cpf"));
                fVO.setCidade(rs.getString("cidade"));
                fVO.setEstado(rs.getString("estado"));
                fVO.setEmail(rs.getString("email"));
                fVO.setSenha(rs.getString("senha")); // Neste caso, a senha será exibida como "********"
                func.add(fVO);
            }
            return func;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar usuário! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

       public void deletar(int id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql ="delete from cadastro where id = " + id;
            stat.execute(sql);
            
        }catch(SQLException se){
            throw new SQLException("Erro ao deletar usuario! " + se.getMessage());
        }finally{
            con.close();
            stat.close();
        }//fim finally
    }
        public ArrayList<CadVO> filtrar(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "select * from cadastro " + query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<CadVO> func = new ArrayList<>();
            while(rs.next() ){
                CadVO fVO = new CadVO();
                fVO.setId(rs.getInt("id"));
                fVO.setNome(rs.getString("nome"));
                fVO.setDatanasc(rs.getString("datanasc"));
                fVO.setCpf(rs.getString("cpf"));
                fVO.setCidade(rs.getString("cidade"));
                fVO.setEstado(rs.getString("estado"));
                fVO.setEmail(rs.getString("email"));
                fVO.setSenha(rs.getString("senha"));
                func.add(fVO);
            }//fecha o laço while
            
            return func;
        }catch(SQLException se){
            throw new SQLException("Erro ao filtrar usuario! " + se.getMessage() );
        }finally{
            con.close();
            stat.close();
        }
   }
    public void alterar(CadVO fVO)throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "update cadastro set "
                    + "nome = ' " + fVO.getNome() + " ', "
                    + "datanasc = '" + fVO.getDatanasc() + "' , "
                    + "cpf = '" + fVO.getCpf() + "' , "
                    + "cidade = '"+ fVO.getCidade()+"', "
                    + "estado = '"+ fVO.getEstado()+"', "
                    + "email = '"+ fVO.getEmail()+"', "
                    + "senha = "+ fVO.getSenha()+" "
                    + "where id = " + fVO.getId() + " ";
            stat.executeUpdate(sql);
        }catch(SQLException se){
            throw new SQLException("Erro ao alterar usuario! " + se.getMessage() );
        }finally{
            con.close();
            stat.close();
        }//fim do finally
        
    }//fecha o método alterarProduto
    
    
}