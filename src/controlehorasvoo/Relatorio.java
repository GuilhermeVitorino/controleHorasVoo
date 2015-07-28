/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlehorasvoo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author anonymous
 */
public class Relatorio extends javax.swing.JFrame {
    
    private Connection connection;

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        
        tblRegistros.setAutoResizeMode(tblRegistros.AUTO_RESIZE_ALL_COLUMNS); 
        jScrollPane3.setPreferredSize(jScrollPane3.getParent().getPreferredSize());
        
        try{
            //Cria uma instancia da classe registro
           Registro reg = new Registro();
           tblRegistros.removeAll();

           this.connection = new ConnectionFactory().getConnection();
           ArrayList<Registro> regs = new ArrayList<Registro>();
           PreparedStatement stmt = (PreparedStatement) this.connection.
                           prepareStatement("select * from controlehoras");
           ResultSet rs = stmt.executeQuery();

           String[] colunas = new String[]{"Data", "Pousos", "Função a bordo", "Observações", "Simulador", "Matrícula", 
           "Aérodromo de Origem", "Aérodromo de Destino", "Diurno", "Noturno", "Navegação", "Instrumento Real", "Sob Capota"};
           String[] linha = new String[13];

           //"Model" para exibicao dos dados na tabela
           DefaultTableModel model = new DefaultTableModel(null, colunas);

           //Seta "model" como o modelo da tabela "tblResultado"
           tblRegistros.setModel(model);
           
           RegistroDao list = new RegistroDao();
           regs = list.getLista();

           for (Registro x : regs) {
               
                Calendar cal = new GregorianCalendar();
                cal = x.getData();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setCalendar(cal); 
                linha[0] = (dateFormat.format(cal.getTime()));
                
                String strPousos = ""+x.getPousos();
                linha[1] = (strPousos);
                
                linha[2] = (x.getFuncao());
                linha[3] = (x.getObservacoes());
                linha[4] = (x.getSimulador());
                linha[5] = (x.getMatricula());
                linha[6] = (x.getAerodromoOrigem());
                linha[7] = (x.getAerodromoDestino());             
                linha[8] = (viewHours(x.getDiurno()));                                                                                     
                linha[9] = (viewHours(x.getNoturno()));
                linha[10] = (viewHours(x.getNavegacao()));
                linha[11] = (viewHours(x.getInstrumento()));
                linha[12] = (viewHours(x.getCapota()));
                              
                model.addRow(linha);       
           }
          
          /*for(int i=0; i<13; i++){*/ 
   
          //tblRegistros.getColumnModel().getColumn(5).setPreferredWidth(100);
          /*}*/
           
           tblRegistros.setFillsViewportHeight(true);
        }catch(SQLException e){
            
        }
    }
    
    public String viewHours (int time){
        String strH = ""+time/60;
        String strM = ""+time%60;
            if(strH.length()==1)
                strH="0"+strH;
            
            if(strM.length()==1)
                strM="0"+strM;
                        
            String hm =  strH+":"+strM;
        
        return hm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(823, 523));

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblRegistros);

        jMenu2.setText("Menu");

        jMenuItem1.setText("Cadastro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Formulario form = new Formulario();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}