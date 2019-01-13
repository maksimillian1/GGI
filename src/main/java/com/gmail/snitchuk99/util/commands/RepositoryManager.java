package com.gmail.snitchuk99.util.commands;

import com.gmail.snitchuk99.model.GitCommands;
import com.gmail.snitchuk99.model.GitRepository;

import java.io.IOException;
import java.util.List;

public class RepositoryManager {

    private static final char SPACE = ' ';

    private GitRepository repository;

    public RepositoryManager(GitRepository repository){
        this.repository = repository;
    }

    public List<String> executeCommand(GitCommands command) throws IOException {
        return  TerminalCommandExecutor.execCommand(command.toString(), repository.getPath());
    }

    public List<String>  executeCommand(GitCommands command, String option) throws IOException {
        String optionalCommand = command.toString() + SPACE + option;
        return  TerminalCommandExecutor.execCommand(optionalCommand, repository.getPath());
    }

}
