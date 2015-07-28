/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlehorasvoo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author anonymous
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtObservacoes = new javax.swing.JTextField();
        cbxSimulador = new javax.swing.JComboBox();
        cbxFuncao = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        try{  
            javax.swing.text.MaskFormatter horaMin = new javax.swing.text.MaskFormatter("##/##/####");  
            txtData = new javax.swing.JFormattedTextField(horaMin);  
        }  
        catch (Exception e){  
        }
        txtPousos = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JTextField();
        txtAerodromoOrigem = new javax.swing.JTextField();
        txtAerodromoDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNoturno = new javax.swing.JFormattedTextField();
        try{  
            javax.swing.text.MaskFormatter horaMin = new javax.swing.text.MaskFormatter("##:##");  
            txtNoturno = new javax.swing.JFormattedTextField(horaMin);  
        }  
        catch (Exception e){  
        }
        txtDiurno = new javax.swing.JFormattedTextField();
        try{  
            javax.swing.text.MaskFormatter horaMin = new javax.swing.text.MaskFormatter("##:##");  
            txtDiurno = new javax.swing.JFormattedTextField(horaMin);  
        }  
        catch (Exception e){  
        }
        txtNavegacao = new javax.swing.JFormattedTextField();
        try{  
            javax.swing.text.MaskFormatter horaMin = new javax.swing.text.MaskFormatter("##:##");  
            txtNavegacao = new javax.swing.JFormattedTextField(horaMin);  
        }  
        catch (Exception e){  
        }
        txtCapota = new javax.swing.JFormattedTextField();
        try{  
            javax.swing.text.MaskFormatter horaMin = new javax.swing.text.MaskFormatter("##:##");  
            txtCapota = new javax.swing.JFormattedTextField(horaMin);  
        }  
        catch (Exception e){  
        }
        txtInstrumento = new javax.swing.JFormattedTextField();
        try{  
            javax.swing.text.MaskFormatter horaMin = new javax.swing.text.MaskFormatter("##:##");  
            txtInstrumento = new javax.swing.JFormattedTextField(horaMin);  
        }  
        catch (Exception e){  
        }
        btnSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRelatorios = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(199, 225, 242));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de vôo"));
        jPanel1.setName(""); // NOI18N

        cbxSimulador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Sim", "Não" }));
        cbxSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSimuladorActionPerformed(evt);
            }
        });

        cbxFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Co-Piloto", "Instrutor de Vôo", "Piloto em Comando", "Piloto em Instrução" }));

        jLabel10.setText("Data");

        jLabel11.setText("Pousos");

        jLabel12.setText("Observações");

        jLabel13.setText("Simulador");

        jLabel14.setText("Função a bordo");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtPousos.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtPousos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPousosActionPerformed(evt);
            }
        });
        txtPousos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPousosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPousos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(cbxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtObservacoes)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(txtPousos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempo de vôo"));

        txtAerodromoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAerodromoDestinoActionPerformed(evt);
            }
        });

        jLabel1.setText("Matrícula");

        jLabel2.setText("Aérodromo de Origem");

        jLabel3.setText("Diúrno");

        jLabel4.setText("Navegação");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Habilitação");

        jLabel6.setText("Noturno");

        jLabel7.setText("Aérodromo de Destino");

        jLabel8.setText("Instrumento Real");

        jLabel9.setText("Sob capota");

        txtNoturno.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtNoturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoturnoActionPerformed(evt);
            }
        });
        txtNoturno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoturnoKeyReleased(evt);
            }
        });

        txtDiurno.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtDiurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiurnoActionPerformed(evt);
            }
        });
        txtDiurno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiurnoKeyReleased(evt);
            }
        });

        txtNavegacao.setEnabled(false);
        txtNavegacao.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtNavegacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNavegacaoActionPerformed(evt);
            }
        });

        txtCapota.setEnabled(false);
        txtCapota.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtCapota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapotaActionPerformed(evt);
            }
        });
        txtCapota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCapotaKeyReleased(evt);
            }
        });

        txtInstrumento.setEnabled(false);
        txtInstrumento.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstrumentoActionPerformed(evt);
            }
        });
        txtInstrumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInstrumentoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAerodromoOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtDiurno)
                    .addComponent(txtNavegacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(184, 184, 184))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAerodromoDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtCapota)
                            .addComponent(txtNoturno, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtInstrumento))
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAerodromoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtAerodromoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.setPreferredSize(new java.awt.Dimension(80, 23));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        menuRelatorios.setText("Menu");

        jMenuItem2.setText("Relatórios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuRelatorios.add(jMenuItem2);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Dados do vôo");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAerodromoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAerodromoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAerodromoDestinoActionPerformed

    private void cbxSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSimuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSimuladorActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Registro reg = new Registro();
        Calendar data = null;				
                
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(txtData.getText());
            data = Calendar.getInstance();
            data.setTime(date);
	} catch (Exception e) {
            out.println("Erro na conversão da data");
            return; //para a execução do método
	}
        
        reg.setData(data);
        reg.setPousos(stringToMinutes(txtPousos.getText()));
        reg.setFuncao(cbxFuncao.getSelectedItem().toString());
        reg.setObservacoes(txtObservacoes.getText());
        reg.setSimulador(cbxSimulador.getSelectedItem().toString());
        reg.setMatricula(txtMatricula.getText());
        reg.setAerodromoOrigem(txtAerodromoOrigem.getText());
        reg.setDiurno(stringToMinutes(txtDiurno.getText()));
        reg.setNavegacao(stringToMinutes(txtNavegacao.getText()));
        reg.setAerodromoDestino(txtAerodromoDestino.getText());
        reg.setNoturno(stringToMinutes(txtNoturno.getText()));
        reg.setInstrumento(stringToMinutes(txtInstrumento.getText()));
        reg.setCapota(stringToMinutes(txtCapota.getText()));
        
        RegistroDao regDao = new RegistroDao();
        regDao.adiciona(reg);
        
        JOptionPane.showMessageDialog(null, "Inclusão efetuada com sucesso!");
        
        txtData.setText("");
        
            
    }//GEN-LAST:event_btnSalvarActionPerformed
   
    private void txtNoturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoturnoActionPerformed

    private void txtDiurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiurnoActionPerformed

    private void txtNavegacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNavegacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNavegacaoActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtDiurnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiurnoKeyReleased
        // TODO add your handling code here:
        if(txtDiurno.getText().length() >= 5
                && !txtDiurno.getText().contains(" ")){
            txtNavegacao.setEnabled(true);
            txtInstrumento.setEnabled(true);
            txtCapota.setEnabled(true);
        }else{
            if(txtDiurno.getText().contains(" ")){
                    txtNavegacao.setEnabled(false);
                    txtInstrumento.setEnabled(false);
                    txtCapota.setEnabled(false);
            }           
        }
    }//GEN-LAST:event_txtDiurnoKeyReleased

    private void txtCapotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapotaActionPerformed

    private void txtCapotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapotaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapotaKeyReleased

    private void txtPousosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPousosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPousosActionPerformed

    private void txtInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstrumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstrumentoActionPerformed

    private void txtInstrumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInstrumentoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstrumentoKeyReleased

    private void txtPousosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPousosKeyReleased
        // TODO add your handling code here:
        txtPousos.setText(txtPousos.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtPousosKeyReleased

    private void txtNoturnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoturnoKeyReleased
        // TODO add your handling code here:
        if(txtNoturno.getText().length() >= 5
                && !txtNoturno.getText().contains(" ")){
            txtNavegacao.setEnabled(true);
            txtInstrumento.setEnabled(true);
            txtCapota.setEnabled(true);
        }else{
             if(txtDiurno.getText().contains(" ")){
                    txtNavegacao.setEnabled(false);
                    txtInstrumento.setEnabled(false);
                    txtCapota.setEnabled(false);
            }     
        }
    }//GEN-LAST:event_txtNoturnoKeyReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here
        Relatorio rel = new Relatorio();
        rel.setLocationRelativeTo(this);
        rel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private int stringToMinutes(String str){
       try{
            int hours = Integer.parseInt(str.substring(0, 2))*60;
            int minutes = Integer.parseInt(str.substring(3, 5));
            int total = hours + minutes;
            return total;
       }catch(Exception e){
            return 0;
       }
    }
    
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxFuncao;
    private javax.swing.JComboBox cbxSimulador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JTextField txtAerodromoDestino;
    private javax.swing.JTextField txtAerodromoOrigem;
    private javax.swing.JFormattedTextField txtCapota;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDiurno;
    private javax.swing.JFormattedTextField txtInstrumento;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JFormattedTextField txtNavegacao;
    private javax.swing.JFormattedTextField txtNoturno;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JFormattedTextField txtPousos;
    // End of variables declaration//GEN-END:variables
}