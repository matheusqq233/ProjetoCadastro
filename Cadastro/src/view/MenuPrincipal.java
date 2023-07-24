/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author 182210104
 */
public class MenuPrincipal extends javax.swing.JFrame implements InternalFrameListener{
    
    private boolean flagGuiCad = false;
    private boolean flagGuiLogin = false;
    
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jbCadastro = new javax.swing.JButton();
        jbLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCadastro.setText("Cadastro");
        jbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroActionPerformed(evt);
            }
        });
        jbCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastroKeyPressed(evt);
            }
        });

        jbLogin.setText("Login");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jbLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLoginKeyPressed(evt);
            }
        });

        jdpAreaDeTrabalho.setLayer(jbCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpAreaDeTrabalho.setLayer(jbLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jbCadastro)
                .addGap(31, 31, 31)
                .addComponent(jbLogin)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpAreaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastro)
                    .addComponent(jbLogin))
                .addGap(233, 233, 233))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpAreaDeTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       private void abrirCadastro(){
        if(!flagGuiCad){
            GUICad gc = new GUICad();
            jdpAreaDeTrabalho.add(gc);
            gc.setVisible(true);
        }
    }
          private void abrirLogin(){
        if(!flagGuiCad){
            GUILogin gl = new GUILogin();
            jdpAreaDeTrabalho.add(gl);
            gl.setVisible(true);
        }
    }
    private void jbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroActionPerformed
        abrirCadastro();
    }//GEN-LAST:event_jbCadastroActionPerformed

    private void jbCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             abrirCadastro();
         }
    }//GEN-LAST:event_jbCadastroKeyPressed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        abrirLogin();
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             abrirLogin();
         }
    }//GEN-LAST:event_jbLoginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastro;
    private javax.swing.JButton jbLogin;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent ife) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent ife) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent ife) {
        if(ife.getInternalFrame() instanceof GUICad){
             flagGuiCad = false;
         }else if(ife.getInternalFrame() instanceof GUILogin){
             flagGuiLogin = false;
         }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent ife) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent ife) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent ife) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent ife) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}