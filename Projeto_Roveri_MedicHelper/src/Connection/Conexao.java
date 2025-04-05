/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Gustavo Canova
 */
public class Conexao {

    private static final String DATABASE = "conexaomedhelper";
    private static final String HOST = "localhost:3306";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://" + HOST + "/" + DATABASE;
    private static final String USR = "root";
    private static String PWD = "";

    public static Connection Conectar() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PWD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
    }

    public static void Desconectar(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("ERRO:" + e.getMessage());
        }
    }
}
