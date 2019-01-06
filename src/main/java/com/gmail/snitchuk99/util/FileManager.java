package com.gmail.snitchuk99.util;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileManager {

//    private static final String GIT = ".git";

    public static boolean isFolder(String path){
        if(new File(path).isDirectory()){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }

    public static boolean hasFolder(String path, String folderName){
        File file = new File(path);
        String[] names = file.list();
        List<String> listNames = Arrays.asList(names);
        if(listNames.contains(folderName)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
