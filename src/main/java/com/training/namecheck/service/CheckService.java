package com.training.namecheck.service;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class CheckService {
    private static final String CHECKED_NAME = "John";

    public boolean checkName() {
        try {
            File file = new File(getClass().getClassLoader().getResource("names.txt").getFile());
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String name;
            while ((name = reader.readLine()) != null) {
                if (isPresent(name)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isPresent(String name) {
        return name.equals(CHECKED_NAME);
    }
}