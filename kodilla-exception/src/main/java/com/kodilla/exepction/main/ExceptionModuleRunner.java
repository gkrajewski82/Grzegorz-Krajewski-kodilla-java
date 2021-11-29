package com.kodilla.exepction.main;

import com.kodilla.exepction.io.FileReader;
import com.kodilla.exepction.io.FileReaderException;
import com.kodilla.exepction.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
