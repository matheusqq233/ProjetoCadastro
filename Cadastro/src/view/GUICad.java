package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import modelo.CadVO;
import servicos.CadServicos;
import javax.swing.text.MaskFormatter;
public class GUICad extends javax.swing.JInternalFrame {


    public GUICad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jcbEstado = new javax.swing.JComboBox<>();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtfDataNasc = new javax.swing.JFormattedTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JFormattedTextField();
        jtfCPF = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter cpfFormatter = new javax.swing.text.MaskFormatter("###.###.###-##");
            cpfFormatter.setPlaceholderCharacter('_'); // Define o caractere de espaço reservado
            jtfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(cpfFormatter));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
            // Ou qualquer outra ação que você queira tomar em caso de erro
        };
        btn = new javax.swing.JToggleButton();
        jtfNome = new javax.swing.JFormattedTextField();
        ((AbstractDocument) jtfNome.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Filtra a inserção de texto permitindo letras, espaços e acentos
                fb.insertString(offset, text.replaceAll("[^\\p{L}\\s]", ""), attr);
            }

            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Filtra a substituição de texto permitindo letras, espaços e acentos
                fb.replace(offset, length, text.replaceAll("[^\\p{L}\\s]", ""), attrs);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro");

        jLayeredPane1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Nome:");

        jLabel2.setText("Data Nascimento:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Email:");

        jLabel7.setText("Senha:");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        try {
            javax.swing.text.MaskFormatter dataFormatter = new javax.swing.text.MaskFormatter("##/##/####");
            dataFormatter.setPlaceholderCharacter('_'); // Define o caractere de espaço reservado
            jtfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(dataFormatter));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
            // Ou qualquer outra ação que você queira tomar em caso de erro
        }

        ((AbstractDocument) jtfCidade.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Filtra a inserção de texto permitindo letras, espaços e acentos
                fb.insertString(offset, text.replaceAll("[^\\p{L}\\s]", ""), attr);
            }

            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Filtra a substituição de texto permitindo letras, espaços e acentos
                fb.replace(offset, length, text.replaceAll("[^\\p{L}\\s]", ""), attrs);
            }
        });

        btn.setText("Mostrar Senha");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfDataNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfEmail))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNome))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpfSenha))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCidade)
                                    .addComponent(jtfCPF))))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btn))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jbCadastrar)
                        .addGap(34, 34, 34)
                        .addComponent(jbCancelar)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn)))
                .addGap(41, 41, 41)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean isValidDate(String dateStr) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false); // Define que a data não será interpretada de forma flexível
    
    try {
        // Transforma a string em um objeto do tipo Calendar
        Calendar date = Calendar.getInstance();
        date.setTime(sdf.parse(dateStr));
        
        // Obtém os valores dos campos de data
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH) + 1; // Os meses em Calendar são indexados a partir de 0
        int day = date.get(Calendar.DAY_OF_MONTH);
        
        // Obtém o ano, mês e dia atual
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int currentMonth = currentDate.get(Calendar.MONTH) + 1;
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
        
        // Verifica se o ano é futuro
        if (year > currentYear) {
            return false;
        }
        
        // Verifica se o mês é válido (entre 1 e 12)
        if (month < 1 || month > 12) {
            return false;
        }
        
        // Verifica se o dia é válido (entre 1 e 31)
        if (day < 1 || day > 31) {
            return false;
        }
        
        // Verifica se o ano é igual ao ano atual e se o mês é futuro
        if (year == currentYear && month > currentMonth) {
            return false;
        }
        
        // Verifica se o ano e o mês são iguais ao ano e mês atual e se o dia é futuro
        if (year == currentYear && month == currentMonth && day > currentDay) {
            return false;
        }
        
        return true;
    } catch (ParseException e) {
        return false; // Caso ocorra um erro de parsing, a data é inválida
    }
}
     
        private void cadastrar(){
            
        try{
            CadVO cVO = new CadVO();
            ArrayList estado = new ArrayList();
            
            
            cVO.setNome(jtfNome.getText());
            cVO.setDatanasc(jtfDataNasc.getText());
            cVO.setCpf(jtfCPF.getText());
            cVO.setCidade(jtfCidade.getText());
            cVO.setEstado((String) jcbEstado.getSelectedItem());
            cVO.setEmail(jtfEmail.getText());
            cVO.setSenha(jpfSenha.getText());
            
            
            CadServicos cs = servicos.ServicosFactory.getCadServicos();
            cs.cadastrar(cVO);
            
                    // Chamar o método setUsuarioCadastrado da classe GUILogin
        GUIManu guiLogin = new GUIManu();
        guiLogin.setUsuarioCadastrado(jtfEmail.getText(), jpfSenha.getText());

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Cadastrado com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void cancelar(){
        jtfNome.setText("");
        jtfDataNasc.setText("");
        jtfCPF.setText("");
        jtfCidade.setText("");
        jcbEstado.setToolTipText("AC");
        jtfEmail.setText("");
        jpfSenha.setText("");
    }
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
            if (!jtfEmail.getText().contains("@") || (!jtfEmail.getText().endsWith("@hotmail.com") && !jtfEmail.getText().endsWith("@gmail.com"))) {
            JOptionPane.showMessageDialog(rootPane, "E-mail inválido. Verifique o formato do e-mail.");
            return; // Não prosseguir com o cadastro
        }else if(jtfNome.getText().equals("")){
           JOptionPane.showMessageDialog(
                    rootPane,
                    "O Campo nome e obrigatório");
           return;
        }else if(jtfCPF.getText().equals("___.___.___-__")){
           JOptionPane.showMessageDialog(
                    rootPane,
                    "O campo CPF é obrigatório");
           return;
        }else if(jtfCidade.getText().equals("")){
           JOptionPane.showMessageDialog(
                    rootPane,
                    "O campo cidade é obrigatório");
           return;
        }else if(jpfSenha.getText().equals("")){
           JOptionPane.showMessageDialog(
                    rootPane,
                    "O campo senha é obrigatório");
           return;
        }else if(!isValidDate(jtfDataNasc.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Data de nascimento inválida. Verifique o formato e os valores dos dias e meses.");
        return; // Não prosseguir com o cadastro
    }
        cadastrar();
        cancelar();
            // Fechar a janela de cadastro
            dispose();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
          if (btn.isSelected()) {
            // Mostrar a senha
            jpfSenha.setEchoChar((char) 0);
        } else {
            // Esconder a senha (usando o caractere de senha padrão '*')
            jpfSenha.setEchoChar('\u2022'); // Caractere de senha padrão (pode variar dependendo do sistema)
        }
    }//GEN-LAST:event_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JFormattedTextField jtfCPF;
    private javax.swing.JFormattedTextField jtfCidade;
    private javax.swing.JFormattedTextField jtfDataNasc;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JFormattedTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}

