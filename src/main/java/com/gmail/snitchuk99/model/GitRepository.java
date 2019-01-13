package com.gmail.snitchuk99.model;

public class GitRepository{

    private final String name;
    private final String path;

    public GitRepository(String name, String path){
        this.name = name;
        this.path = path;
    }


    public String getName() { return name; }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "name: " + name + "\npath: " + path;
    }
}
