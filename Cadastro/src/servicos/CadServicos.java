/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.CadDAO;
import DAO.DAOFactory;
import java.sql.SQLException;
import modelo.CadVO;


public class CadServicos {
    public void cadastrar(CadVO cVO) throws SQLException{
        CadDAO cDAO = DAOFactory.getCadDAO();
        cDAO.cadastrar(cVO); 
    }
}
