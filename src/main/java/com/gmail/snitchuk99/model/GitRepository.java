package com.gmail.snitchuk99.model;

import com.gmail.snitchuk99.util.RepositoryChecker;

public class GitRepository{

    private String path;
    private GitRepository instance;

    private GitRepository(){}

    public void addRepository(String path){
//        if(RepositoryChecker.isGitRepository(path)){
//
//        }
    }

    public GitRepository getInstance(){
        return this;
    }

    public String getPath() {
        return path;
    }
}
