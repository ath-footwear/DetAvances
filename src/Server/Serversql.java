/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GATEWAY1-
 */
public class Serversql {

    private final String url = "jdbc:sqlserver://192.168.6.8\\SQLEXPRESS:9205;databaseName=";
    private final String URLP = "jdbc:sqlserver://192.168.6.75\\SQLEXPRESS:9205;databaseName=";
    private final String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Connection getconexionserver8(String bd) throws ClassNotFoundException, IOException, SQLException {
        Class.forName(drive);
        return DriverManager.getConnection(url + bd, "sa", "Prok2001");
    }

    public Connection getconexionP(String bd) throws ClassNotFoundException, IOException, SQLException {
        Class.forName(drive);
        return DriverManager.getConnection(URLP+bd, "mich", "mich");
    }
}
