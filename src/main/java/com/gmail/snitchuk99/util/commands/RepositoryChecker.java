package com.gmail.snitchuk99.util.commands;

import com.gmail.snitchuk99.util.FileManager;

public class RepositoryChecker {

    private static final String GIT = ".git";


    public static void isGitRepository(String path){
        if(FileManager.isFolder(path)
                && FileManager.hasFolder(path, GIT)){
            System.out.println("Git Repo!");
        }
        else {
            System.out.println("Other file.");
        }
    }

}
