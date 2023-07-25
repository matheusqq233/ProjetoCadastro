/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import modelo.CadVO;
import servicos.CadServicos;
import servicos.ServicosFactory;

/**
 *
 * @author 182210104
 */
public class GUIManu extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUILogin
     */
    public GUIManu() {
        initComponents();
        preencherTabela();
    }

    DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome", "Data Nasc.", "CPF", "Cidade", "Estado", "Email", "Senha"}
        );
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisaFunc = new javax.swing.JTextField();
        jcbPesquisaFunc = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnPreencher = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jbtnConfirmarAlteracao = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
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
        jtfDataNasc = new javax.swing.JFormattedTextField();
        jtfCPF = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter cpfFormatter = new javax.swing.text.MaskFormatter("###.###.###-##");
            cpfFormatter.setPlaceholderCharacter('_'); // Define o caractere de espaço reservado
            jtfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(cpfFormatter));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
            // Ou qualquer outra ação que você queira tomar em caso de erro
        };
        jtfCidade = new javax.swing.JFormattedTextField();
        jtfEmail = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        btn = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Login");

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nasc.", "CPF", "Cidade", "Estado", "Email", "Senha"
            }
        ));
        jScrollPane1.setViewportView(jtUsuario);

        jLabel1.setText("Pesquisa: ");

        jtfPesquisaFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaFuncKeyReleased(evt);
            }
        });

        jcbPesquisaFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "CPF", "Data Nasc.", "Cidade", "Estado", "Email", "Senha" }));

        jbtnPreencher.setText("Preencher");
        jbtnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherActionPerformed(evt);
            }
        });

        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });
        jbtnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAlterarKeyPressed(evt);
            }
        });

        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código: ");

        jLabel3.setText("Nome: ");

        jLabel4.setText("Data Nasc:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Cidade: ");

        jLabel7.setText("Email:");

        jtfCodigo.setEditable(false);

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        jcbEstado.setToolTipText("AC"
            + "AL"
            + "AP"
            + "AM"
            + "BA"
            + "CE"
            + "ES"
            + "GO"
            + "MA"
            + "MT"
            + "MS"
            + "MG"
            + "PA"
            + "PB"
            + "PR"
            + "PE"
            + "PI"
            + "RJ"
            + "RN"
            + "RS"
            + "RO"
            + "RR"
            + "SC"
            + "SP"
            + "SE"
            + "TO"
            + "DF");

        jLabel8.setText("Senha:");

        jbtnConfirmarAlteracao.setText("Confirmar Alteração");
        jbtnConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jbtnConfirmarAlteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnConfirmarAlteracaoKeyPressed(evt);
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

        jLabel10.setText("Estado");

        jLayeredPane2.setLayer(jbtnPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbtnConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfDataNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jpfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome)
                                .addGap(156, 156, 156))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jtfCPF)
                                        .addGap(137, 137, 137))
                                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                        .addComponent(jtfDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                        .addGap(203, 203, 203)))))
                        .addGap(201, 201, 201))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfEmail)
                                    .addComponent(jpfSenha)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCidade)))
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btn))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(177, 177, 177)))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jbtnPreencher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDeletar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jbtnConfirmarAlteracao)
                        .addGap(174, 174, 174)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreencher)
                    .addComponent(jbtnLimpar)
                    .addComponent(jbtnAlterar)
                    .addComponent(jbtnDeletar))
                .addGap(34, 34, 34)
                .addComponent(jbtnConfirmarAlteracao)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfPesquisaFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbPesquisaFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPesquisaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void preencherTabela(){
        try{
            CadServicos fs = ServicosFactory.getCadServicos();
            
            ArrayList<CadVO> func= new ArrayList<>();
            
            func = fs.buscar();
            for( int i=0; i<func.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(func.get(i).getId()),
                    String.valueOf(func.get(i).getNome()),
                    String.valueOf(func.get(i).getDatanasc()),
                    String.valueOf(func.get(i).getCpf()),
                    func.get(i).getCidade(),
                    func.get(i).getEstado(),
                    func.get(i).getEmail(),
                    func.get(i).getSenha()
                });
            }//fecha o laço for

            //Adicionando o modelo de tabela com os dados na tabela produto
            jtUsuario.setModel(dtm);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha o catch
    //fecha o método preencherTabela
    }
     private void limparTabela() {
        
        /*  Para limpar a tabela temos que setar o número de
            linhas para zero no default table model        
        */
        dtm.setNumRows(0);
    }//fecha o método
     
     private void deletar(){
        try{
            int linha = jtUsuario.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(this, "Por favor selecione uma linha!");
            }else{
               int result = JOptionPane.showConfirmDialog(this, 
                        "Tem certeza que deseja deletar o usuario?" + JOptionPane.YES_NO_OPTION);
          
                if(result==JOptionPane.YES_OPTION){
                CadServicos fs = ServicosFactory.getCadServicos();
                String codFuncionario = (String) jtUsuario.getValueAt(linha, 0 );
                fs.deletar(Integer.parseInt(codFuncionario));
                
                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this, 
                        "Usuario excluído com sucesso!");
                limparTabela();
                preencherTabela();
                
                }else if(result==JOptionPane.NO_OPTION){
                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, 
                    "Erro ao deletar Usuario! " + e.getMessage());
        }
        
      }     
     private void filtrar(){
        try{
            if(jtfPesquisaFunc.getText().isEmpty()){
                preencherTabela();
            }else{
                CadServicos fs = ServicosFactory.getCadServicos();
                String pesquisa = (String) jcbPesquisaFunc.getSelectedItem();
                String query = null;
                if(pesquisa.equals("Código") ) {
                    query = "where id = " + jtfPesquisaFunc.getText();
                }else if(!pesquisa.equals("Nome") ) if(pesquisa.equals("Data Nasc.") ) {
                    query = "where datanasc like '%" + jtfPesquisaFunc.getText() + "%' ";
                }else if(!pesquisa.equals("CPF") ){
                    if(!pesquisa.equals("Cidade") ) if(pesquisa.equals("Estado") ){
                        query = "where estado like '%" + jtfPesquisaFunc.getText() + "%' ";
                        } else if(pesquisa.equals("Email")){
                        query = "where email like '%" + jtfPesquisaFunc.getText() +"%' ";
                    
                    }else if(pesquisa.equals("Senha") ){
                        query = "where senha like '%" + jtfPesquisaFunc.getText() + "%' ";
                    }if(pesquisa.equals("Cidade")){
                        query = "where cidade like '%" + jtfPesquisaFunc.getText() + "%' ";
                    } else {
                    }
                }else {
                    query = "where cpf like '%" + jtfPesquisaFunc.getText() + "%' ";
                }else {
                    query = "where nome like '%" + jtfPesquisaFunc.getText() + "%' ";
                }    
                    
                ArrayList<CadVO> func = new ArrayList();
                func = fs.filtrar(query);
                
                for(int i=0; i < func.size(); i++ ){
                    dtm.addRow(new String[] {
                    String.valueOf(func.get(i).getId()),
                    String.valueOf(func.get(i).getNome()),
                    String.valueOf(func.get(i).getDatanasc()),
                    String.valueOf(func.get(i).getCpf()),
                    func.get(i).getCidade(),
                    func.get(i).getEstado(),
                    func.get(i).getEmail(),
                    String.valueOf(func.get(i).getSenha())
                });
                }
                jtUsuario.setModel(dtm);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Erro ao filtrar usuario! " + e.getMessage() );
        }
    }
     private void alterar(){
      try{  
        int linha = jtUsuario.getSelectedRow();
        
        jbtnDeletar.setEnabled(false);
        
        if(linha != -1){
            jtfCodigo.setText ( (String) jtUsuario.getValueAt(linha, 0) );
            jtfNome.setText ( (String) jtUsuario.getValueAt(linha, 1) );
            jtfDataNasc.setText ( (String) jtUsuario.getValueAt(linha, 2) );
            jtfCPF.setText((String) jtUsuario.getValueAt(linha, 3) );
            jtfCidade.setText((String) jtUsuario.getValueAt(linha, 4));
            jcbEstado.setSelectedItem((String) jtUsuario.getValueAt(linha, 5));
            jtfEmail.setText( (String) jtUsuario.getValueAt(linha, 6));
            jpfSenha.setText((String) jtUsuario.getValueAt(linha, 7));
           
           
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Você não selecionou nenhuma linha!");            
        }
      }catch(Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao selecionar uma linha! " + e.getMessage());
        }   
    }     
      private void confirmarAlteracao(){
        try{
            CadVO  fVO = new CadVO();
            if( jtfNome.getText().isEmpty() || jtfDataNasc.getText().isEmpty()|| jtfCPF.getText().isEmpty() || jtfCidade.getText().isEmpty() || jcbEstado.getToolTipText().isEmpty() || jtfEmail.getText().isEmpty() ||jpfSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        rootPane, 
                        "Erro! Pro favor insira as informações corretamente!", 
                        "Erro!" , 
                        JOptionPane.ERROR_MESSAGE);
            }else{
                fVO.setId(Integer.parseInt(jtfCodigo.getText()));
                fVO.setNome(jtfNome.getText());
                fVO.setDatanasc(jtfDataNasc.getText());
                fVO.setCpf(jtfCPF.getText());
                fVO.setCidade(jtfCidade.getText());
                fVO.setEstado((String) jcbEstado.getSelectedItem());
                fVO.setEmail(jtfEmail.getText());
                fVO.setSenha(jpfSenha.getText());




                
                
                
                CadServicos fs = ServicosFactory.getCadServicos();
                fs.alterar(fVO);
                
                JOptionPane.showMessageDialog(this, "Usuario alterado com sucesso!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro! " + e.getMessage());
        }
        
        jbtnDeletar.setEnabled(true);
        limparTabela();
        preencherTabela();
    }
     private void limparAlteracao(){
        jtfCodigo.setText(null);
        jtfNome.setText(null);
        jtfDataNasc.setText(null);
        jtfCPF.setText(null);
        jcbEstado.setToolTipText("AC");
        jtfCidade.setText(null);
        jpfSenha.setText(null);
    }
     
    private void jtfPesquisaFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaFuncKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtfPesquisaFuncKeyReleased

    private void jbtnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherActionPerformed
        // TODO add your handling code here:
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbtnPreencherActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        // TODO add your handling code here:
        limparTabela();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterar();
        }
    }//GEN-LAST:event_jbtnAlterarKeyPressed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        // TODO add your handling code here:
        deletar();
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jbtnConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoActionPerformed
        // TODO add your handling code here:
        confirmarAlteracao();
        limparAlteracao();
    }//GEN-LAST:event_jbtnConfirmarAlteracaoActionPerformed

    private void jbtnConfirmarAlteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnConfirmarAlteracaoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            confirmarAlteracao();
        }
    }//GEN-LAST:event_jbtnConfirmarAlteracaoKeyPressed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        if (btn.isSelected()) {
            // Mostrar a senha
            jpfSenha.setEchoChar((char) 0);
        } else {
            // Esconder a senha (usando o caractere de senha padrão '*')
            jpfSenha.setEchoChar('\u2022'); // Caractere de senha padrão (pode variar dependendo do sistema)
        }
    }//GEN-LAST:event_btnActionPerformed
    public void setUsuarioCadastrado(String CPF, String senha) {
        jtfCPF.setText(CPF);
        jpfSenha.setText(senha);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnConfirmarAlteracao;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnPreencher;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbPesquisaFunc;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JFormattedTextField jtfCPF;
    private javax.swing.JFormattedTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfDataNasc;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JFormattedTextField jtfNome;
    private javax.swing.JTextField jtfPesquisaFunc;
    // End of variables declaration//GEN-END:variables
}
