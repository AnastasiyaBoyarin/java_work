package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Input information about person
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        inputOutputHelper.inputInformationAboutPerson();

        // Output information about person into separate files based on surname of person
        try {
            inputOutputHelper.outputInformationAboutPerson();
        } catch (IOException e) {
            System.out.println(e.getStackTrace() + e.getMessage());
        }

    }
}