/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author 182210104
 */
public class ServicosFactory {
     private static CadServicos cadServicos = new CadServicos();
    
     public static CadServicos getCadServicos(){
          return cadServicos;
    }
}
