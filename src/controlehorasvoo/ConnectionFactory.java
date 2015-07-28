/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlehorasvoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anonymous
 */
public class ConnectionFactory {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        public Connection getConnection(){
            try{
                return DriverManager.getConnection("jdbc:mysql://localhost/controlehoras", "root", "corinthians1910357");
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
    

