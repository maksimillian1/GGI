package com.gmail.snitchuk99.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalCommandExecutor {

    private static Process process;


    public static void execCommand(String command, String path) throws IOException{
        String s;
        process = Runtime.getRuntime().exec(command, null, new File(path));
        BufferedReader br = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
        while ((s = br.readLine()) != null) {
            System.out.println("line: " + s);
        }
        process.destroy();
    }
}
