package com.gmail.snitchuk99.util.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalCommandExecutor {

    public static List<String> execCommand(String command, String path) throws IOException{
        List<String> commandRes = new ArrayList<String>();
        String s;
        Process process = Runtime.getRuntime().exec(command, null, new File(path));
        BufferedReader br = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
        while ((s = br.readLine()) != null) {
            commandRes.add(s);
        }
        process.destroy();
        return commandRes;
    }

}
