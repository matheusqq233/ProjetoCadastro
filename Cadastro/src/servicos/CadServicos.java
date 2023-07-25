/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.CadDAO;
import DAO.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CadVO;


public class CadServicos {
    public void cadastrar(CadVO cVO) throws SQLException{
        CadDAO cDAO = DAOFactory.getCadDAO();
        cDAO.cadastrar(cVO); 
    }
        
        public ArrayList<CadVO> buscar() throws SQLException{
        CadDAO fDAO = DAOFactory.getCadDAO();
        
        return fDAO.buscar();
    }//fecha o método buscarProduto
        
        public void deletar(int idfuncionario) throws SQLException{
        CadDAO  fDAO= DAOFactory.getCadDAO();
        fDAO.deletar(idfuncionario);
    }//fecha o método deletarProduto
        
        public ArrayList<CadVO> filtrar(String query) throws SQLException{
        CadDAO fDAO = DAOFactory.getCadDAO();
        return fDAO.filtrar(query);
    }//fecha o método
        
        public void alterar(CadVO fVO) throws SQLException{
        CadDAO fDAO = DAOFactory.getCadDAO();
        fDAO.alterar(fVO);
    }//fecha o método alterarProduto
}
