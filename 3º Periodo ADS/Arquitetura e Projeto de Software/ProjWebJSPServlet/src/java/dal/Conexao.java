/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Conexao {
    
    private static Connection c = null;
    
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/nome_da_database";
    String user = "postgres";
    String password = "123456";
    
    public Connection getConnection(){
    
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
