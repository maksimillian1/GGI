package com.gmail.snitchuk99.util.dao;

import com.gmail.snitchuk99.util.properties.PropertyManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String PATH = "src/main/resources/config.properties";

    private static Connection con;

    static {
        String url;
        String login;
        String password;
        try {
            PropertyManager pm = new PropertyManager(PATH);
            url = pm.getProp("url");
            login = pm.getProp("user");
            password = pm.getProp("password");
            con = DriverManager.getConnection(url, login, password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ConnectionManager(){}

    public static Connection getConnection() {
        return con;
    }

    public static void close(){
        try {
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
