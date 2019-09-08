package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File[] files = new File("C:/Data/logs").listFiles();
        showFiles(files);
    }

    private static void showFiles(File[] files) {
        String text = "the text";
        List<File> logfiles = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                showFiles(file.listFiles()); // Calls same method again.
            } else {
                String name = file.getName();
                String extension[] = name.split("\\.");
                if (extension[1].equals("log")) {
                    if (name.equals("three.log")) {
                        System.out.println("debug");
                    }
                    BufferedReader br;
                    try {
                        br = new BufferedReader(new FileReader(file));
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    String st;
                    try {
                        while ((st = br.readLine()) != null) {
                            if (st.contains(text)) {
                                logfiles.add(file);
                                System.out.println("File with text is " + file);
                                break;
                            }
                        }
                    } catch (IOException e) {
                        new RuntimeException(e);
                    }
                }
                System.out.println("File: " + file.getName());
            }
        }
        System.out.println(logfiles);
    }
}
