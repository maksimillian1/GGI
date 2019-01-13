package com.gmail.snitchuk99;

import com.gmail.snitchuk99.model.GitCommands;
import com.gmail.snitchuk99.model.GitRepository;
import com.gmail.snitchuk99.util.commands.RepositoryChecker;
import com.gmail.snitchuk99.util.commands.RepositoryManager;
import com.gmail.snitchuk99.util.dao.GitRepoDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Run extends Application{


    public static void main(String[] args) {

    }

//    public static void main(String[] args) {
//        try {
//            GitRepoDAO gitRepoDAO = new GitRepoDAO();
//            GitRepository repo1 = gitRepoDAO.getRepositoryByID(5);
//            RepositoryManager rm = new RepositoryManager(repo1);
//            List<String> lst = rm.executeCommand(GitCommands.Init);
//            for (String st:lst) {
//                System.out.println(st);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        String path = "/home/paimon/Downloads/GitTester";
//        RepositoryChecker.isGitRepository(path);
//    }

}
