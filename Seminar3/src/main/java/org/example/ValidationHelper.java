package org.example;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class ValidationHelper {

    public int checkCountOfInputArgs(String[] args) {
        if (args.length == 6) {
            // success
            return 1;
        } else if (args.length > 6){
            // error 1
            return -1;
        } else {
            // error 2
            return -2;
        }
    }

    public void checkName(String name) {
        if (!(name instanceof String)) {
            throw new RuntimeException("Argument name is not String");
        } else {
            System.out.println("Argument name is string. It's correct.");
        }
    }

    public void checkMiddleName(String middlename) {
        if (!(middlename instanceof String)) {
            throw new RuntimeException("Argument middle name is not String");
        } else {
            System.out.println("Argument middle name is string. It's correct.");
        }
    }

    public void checkSurname(String surname) {
        if (!(surname instanceof String)) {
            throw new RuntimeException("Argument surname is not String");
        } else {
            System.out.println("Argument surname is string. It's correct.");
        }
    }

    public void checkBirthDay(String birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
        try {
            System.out.println("Argument birthDay has correct format.");
            LocalDateTime.parse(birthDay, DateTimeFormatter.BASIC_ISO_DATE);
        } catch (DateTimeParseException e) {
            throw e;
        }
    }

    public void checkPhoneNumber(String phoneNumber) {
        try {
            Integer.parseInt(phoneNumber);
            System.out.println("Argument phone number has correct format.");
        } catch (NumberFormatException  e) {
            throw e;
        }
    }

    public void checkSex(String sex) {
        char symbolSex = sex.charAt(0);
        if (Character.isLetter(symbolSex) && sex.length() == 1) {
            System.out.println("Argument sex has correct format.");

            if (symbolSex == 'f' || symbolSex == 'm') {
                System.out.println("You entered correct data: " + symbolSex);
            } else {
                throw new RuntimeException("Argument sex is not equal f or m.");
            }
        } else {
            throw new RuntimeException("Argument sex is not char.");
        }
    }

    public void processErrorCode(int errorCode) {
        switch (errorCode) {
            case 1:
                System.out.println("You entered 6 arguments. It's correct!");
                break;
            case -1:
                System.out.println("You entered more then 6 arguments!");
                break;
            case -2:
                System.out.println("You entered less then 6 arguments");
                break;
        }
    }
}
