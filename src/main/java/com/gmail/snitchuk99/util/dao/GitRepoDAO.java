package com.gmail.snitchuk99.util.dao;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class GitRepoDAO {

    public static void main(String[] args) {

        Connection con = ConnectionManager.getConnection();
        try {
            Statement st = con.createStatement();
            st.executeQuery("SELECT * FROM GitRepo");
            ResultSet rs = st.getResultSet();
            while (rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
