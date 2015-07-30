/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlehorasvoo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anonymous
 */
public class RegistroDao {
    
    private Connection connection;
    
    public RegistroDao() {
		this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Registro reg) {
        String sql = "insert into controlehoras "+                       
        "(data,pousos,funcao_a_bordo,observacoes,simulador,matricula,"+ 
        "aerodromo_origem,diurno,navegacao,aerodromo_destino,noturno,instrumento_real,sob_capota)"+
        " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try{ //prepared statement para inserção
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
            //seta os valores
            stmt.setDate(1, new Date(
                    reg.getData().getTimeInMillis()));

            stmt.setInt(2,reg.getPousos());
            stmt.setString(3,reg.getFuncao());
            stmt.setString(4,reg.getObservacoes());
            stmt.setString(5,reg.getSimulador());
            stmt.setString(6,reg.getMatricula());
            stmt.setString(7,reg.getAerodromoOrigem());
            stmt.setInt(8,reg.getDiurno());
            stmt.setInt(9,reg.getNavegacao());
            stmt.setString(10,reg.getAerodromoDestino());
            stmt.setInt(11,reg.getNoturno());
            stmt.setInt(12,reg.getInstrumento());
            stmt.setInt(13,reg.getCapota());

            // executa
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Registro> getLista() {
        try {
                this.connection = new ConnectionFactory().getConnection();
                ArrayList<Registro> regs = new ArrayList<Registro>();
                PreparedStatement stmt = (PreparedStatement) this.connection.
                                prepareStatement("select * from controlehoras");
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                        // criando o objeto Contato
                        Registro reg = new Registro();

                        // montando a data através do Calendar
                        Calendar data = Calendar.getInstance();
                        data.setTime(rs.getDate("data"));
                        reg.setData(data);

                        reg.setPousos(rs.getInt("pousos"));
                        reg.setFuncao(rs.getString("funcao_a_bordo"));
                        reg.setObservacoes(rs.getString("observacoes"));
                        reg.setSimulador(rs.getString("simulador"));
                        reg.setMatricula(rs.getString("matricula"));
                        reg.setAerodromoOrigem(rs.getString("aerodromo_origem"));
                        reg.setAerodromoDestino(rs.getString("aerodromo_destino"));
                        reg.setDiurno(rs.getInt("diurno"));                              
                        reg.setNoturno(rs.getInt("noturno"));
                        reg.setNavegacao(rs.getInt("navegacao"));
                        reg.setInstrumento(rs.getInt("instrumento_real"));                                                              
                        reg.setCapota(rs.getInt("sob_capota"));

                        regs.add(reg);
                }
                rs.close();
                stmt.close();

                return regs;
        }catch(SQLException e){
                throw new RuntimeException(e);		
        }
    }
    
    public ArrayList<Registro> getListaDetalhada(String dataInicio, String dataFim) {
        try {
                this.connection = new ConnectionFactory().getConnection();
                ArrayList<Registro> regs = new ArrayList<Registro>();
                PreparedStatement stmt = (PreparedStatement) this.connection.
                                prepareStatement("select * from controlehoras where "
                                +"data between ? and ?");
            
                Calendar data1 = null;    
                java.util.Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataInicio);
                data1 = Calendar.getInstance();
                data1.setTime(date1);
                
                Calendar data2 = null;    
                java.util.Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(dataFim);
                data2 = Calendar.getInstance();
                data2.setTime(date2);
                
                stmt.setDate(1, new Date(
                    data1.getTimeInMillis()));

                stmt.setDate(2, new Date(
                    data2.getTimeInMillis()));
                
                ResultSet rs = stmt.executeQuery();
               
                while (rs.next()) {

                        // criando o objeto Contato
                        Registro reg = new Registro();

                        // montando a data através do Calendar
                        Calendar data = Calendar.getInstance();
                        data.setTime(rs.getDate("data"));
                        reg.setData(data);

                        reg.setPousos(rs.getInt("pousos"));
                        reg.setFuncao(rs.getString("funcao_a_bordo"));
                        reg.setObservacoes(rs.getString("observacoes"));
                        reg.setSimulador(rs.getString("simulador"));
                        reg.setMatricula(rs.getString("matricula"));
                        reg.setAerodromoOrigem(rs.getString("aerodromo_origem"));
                        reg.setAerodromoDestino(rs.getString("aerodromo_destino"));
                        reg.setDiurno(rs.getInt("diurno"));                              
                        reg.setNoturno(rs.getInt("noturno"));
                        reg.setNavegacao(rs.getInt("navegacao"));
                        reg.setInstrumento(rs.getInt("instrumento_real"));                                                              
                        reg.setCapota(rs.getInt("sob_capota"));

                        regs.add(reg);
                }
                rs.close();
                stmt.close();

                return regs;
        }catch(SQLException e){
                throw new RuntimeException(e);		
        } catch (ParseException ex) {
            Logger.getLogger(RegistroDao.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
            
    public ArrayList<Registro> getListaTotais() {
        try {
                this.connection = new ConnectionFactory().getConnection();
                ArrayList<Registro> regs = new ArrayList<Registro>();
                PreparedStatement stmt = (PreparedStatement) this.connection.                               
                   prepareStatement("SELECT SUM(diurno),SUM(noturno),SUM(navegacao),"
                           + "SUM(instrumento_real),SUM(sob_capota) FROM controlehoras;");
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                        // criando o objeto Contato
                        Registro reg = new Registro();

                        reg.setDiurno(rs.getInt("SUM(diurno)"));                              
                        reg.setNoturno(rs.getInt("SUM(noturno)"));
                        reg.setNavegacao(rs.getInt("SUM(navegacao)"));
                        reg.setInstrumento(rs.getInt("SUM(instrumento_real)"));                                                              
                        reg.setCapota(rs.getInt("SUM(sob_capota)"));

                        regs.add(reg);
                }
                rs.close();
                stmt.close();

                return regs;
        }catch(SQLException e){
                throw new RuntimeException(e);		
        }
    }
    
    public ArrayList<Registro> getListaTotaisDetalhados(String dataInicio, String dataFim) {
        try {
                this.connection = new ConnectionFactory().getConnection();
                ArrayList<Registro> regs = new ArrayList<Registro>();
                PreparedStatement stmt = (PreparedStatement) this.connection.                               
                   prepareStatement("SELECT SUM(diurno),SUM(noturno),SUM(navegacao),"
                           + "SUM(instrumento_real),SUM(sob_capota) FROM controlehoras"
                           + " where data between ? and ?");
                
                Calendar data1 = null;    
                java.util.Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataInicio);
                data1 = Calendar.getInstance();
                data1.setTime(date1);
                
                Calendar data2 = null;    
                java.util.Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(dataFim);
                data2 = Calendar.getInstance();
                data2.setTime(date2);
                
                stmt.setDate(1, new Date(
                    data1.getTimeInMillis()));

                stmt.setDate(2, new Date(
                    data2.getTimeInMillis()));
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                        // criando o objeto Contato
                        Registro reg = new Registro();

                        reg.setDiurno(rs.getInt("SUM(diurno)"));                              
                        reg.setNoturno(rs.getInt("SUM(noturno)"));
                        reg.setNavegacao(rs.getInt("SUM(navegacao)"));
                        reg.setInstrumento(rs.getInt("SUM(instrumento_real)"));                                                              
                        reg.setCapota(rs.getInt("SUM(sob_capota)"));

                        regs.add(reg);
                }
                rs.close();
                stmt.close();

                return regs;
        }catch(SQLException e){
                throw new RuntimeException(e);		
        } catch (ParseException ex) {
            Logger.getLogger(RegistroDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
