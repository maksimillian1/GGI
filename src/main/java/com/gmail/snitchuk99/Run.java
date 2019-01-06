package com.gmail.snitchuk99;

import com.gmail.snitchuk99.util.RepositoryChecker;
import com.gmail.snitchuk99.util.TerminalCommandExecutor;

import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {
        try {
            TerminalCommandExecutor.execCommand("ls", "/home/paimon");
        }catch (IOException e){
            e.printStackTrace();
        }
        String path = "/home/paimon/Downloads/GitTester";
        RepositoryChecker.isGitRepository(path);
    }

}
