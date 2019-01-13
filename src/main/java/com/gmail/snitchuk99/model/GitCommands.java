package com.gmail.snitchuk99.model;

public enum GitCommands {

    Init("init"),
    Status("status"),
    Add("add"),
    AddAll("add ."),
    Commit("commit"),
    Push("push origin master");

    private static final String GIT= "git ";

    private String command;

    private GitCommands(String command){
        this.command = GIT.concat(command);
    }

    @Override
    public String toString() {
        return command;
    }
}
