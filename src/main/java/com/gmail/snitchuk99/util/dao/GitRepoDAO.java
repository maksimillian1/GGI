package com.gmail.snitchuk99.util.dao;

import com.gmail.snitchuk99.model.GitRepository;
import com.gmail.snitchuk99.util.properties.PropertyManager;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GitRepoDAO {

    private static final String PATH = "src/main/resources/sql-querries.properties";

    private static PropertyManager pm;
    private PreparedStatement ps;
    private static Connection connection;

    static {
        try {
            pm = new PropertyManager(PATH);
            connection = ConnectionManager.getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GitRepository getRepositoryByID(int id) throws SQLException {
        String prStat = pm.getProp(StatementType.GetById.toString());
        ps = connection.prepareStatement(prStat);
        ps.setInt(1, id);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        GitRepository result = new GitRepository(resultSet.getString(2), resultSet.getString(3));
        return result;
    }

    public GitRepository getRepositoryByName(String name) throws SQLException{
        String prepared = pm.getProp(StatementType.GetByName.toString());
        ps = connection.prepareStatement(prepared);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return new GitRepository(rs.getString(2), rs.getString(3));
    }

    public List<GitRepository> getAll() throws SQLException{
        List<GitRepository> repos = new ArrayList<>();
        String prepared = pm.getProp(StatementType.GetAll.toString());
        ps = connection.prepareStatement(prepared);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            repos.add(new GitRepository(rs.getString(2), rs.getString(3)));
        }
        return repos;
    }

    public void addRepository(GitRepository repo) throws SQLException{
        String prep = pm.getProp(StatementType.Add.toString());
        ps = connection.prepareStatement(prep);
        ps.setString(1, repo.getName());
        ps.setString(2, repo.getPath());
        ps.executeUpdate();
    }

    public void deleteByID(int id) throws SQLException{
        String prep = pm.getProp(StatementType.DeleteById.toString());
        ps = connection.prepareStatement(prep);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void deleteByName(String name) throws SQLException{
        String prep = pm.getProp(StatementType.DeleteByName.toString());
        ps = connection.prepareStatement(prep);
        ps.setString(1, name);
        ps.executeUpdate();
    }














    public static void main(String[] args) {
        GitRepoDAO gitRepoDAO = new GitRepoDAO();
        try {
            GitRepository gr2 = new GitRepository("GGI", "/home/paimon/Document/Java-Projects/GGI");
            gitRepoDAO.addRepository(gr2);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
