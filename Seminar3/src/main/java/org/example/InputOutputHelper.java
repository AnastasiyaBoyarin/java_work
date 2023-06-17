package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutputHelper {
    private ValidationHelper validationHelper;
    private ArrayList<Person> personArrayList = new ArrayList<Person>();

    public InputOutputHelper() {
        this.validationHelper = new ValidationHelper();
    }
    public void inputInformationAboutPerson() {
        Scanner scanner = new Scanner(System.in);
        helpfulInformation();
        Person person = null;
        String personInfo = null;

        int exitCode = 1;
        int errorCode;

        while (exitCode != -1) {
            System.out.println("Enter information about person and split data by using space.");
            System.out.println("Or enter -1 in order to exit.");


            if (scanner.hasNext()) {
                personInfo = scanner.nextLine();

                if (personInfo.equals("-1")) {
                    exitCode = -1;
                } else {
                    try {
                        String[] personData = personInfo.split(" ");
                        errorCode = validationHelper.checkCountOfInputArgs(personData);
                        validationHelper.processErrorCode(errorCode);
                        if (errorCode == 1) {
                            String personName = personData[0];
                            String personMiddleName = personData[1];
                            String personSurname = personData[2];
                            String personBirthDay = personData[3];
                            String personPhoneNumber = personData[4];
                            String personSex = personData[5];
                            validationHelper.checkName(personName);
                            validationHelper.checkMiddleName(personMiddleName);
                            validationHelper.checkSurname(personSurname);
                            validationHelper.checkBirthDay(personBirthDay);
                            validationHelper.checkPhoneNumber(personPhoneNumber);
                            validationHelper.checkSex(personSex);
                            person = new Person(personName, personMiddleName, personSurname,
                                    personBirthDay, Integer.parseInt(personPhoneNumber), personSex.charAt(0));

                            personArrayList.add(person);
                        }
                    } catch (DateTimeParseException exception) {
                        System.out.println(exception.getStackTrace() + "\n" + exception.getMessage());
                    } catch (NumberFormatException exception) {
                        System.out.println(exception.getStackTrace() + "\n" + exception.getMessage());
                    } catch (RuntimeException exception) {
                        System.out.println(exception.getStackTrace() + "\n" + exception.getMessage());
                    }
                }
            }
        }
        scanner.close();
    }

    public void outputInformationAboutPerson() throws IOException {
        BufferedWriter writer = null;
        try {
            String personSurname = "";
            for (Person person : personArrayList) {
                personSurname = person.getSurname();

                writer = new BufferedWriter(new FileWriter(personSurname + ".txt", true));
                writer.write(person.toString());
            }

        } catch (IOException e) {
            throw e;
        } finally {
            writer.close();
        }
    }

    private void helpfulInformation() {
        displaySeparator();
        System.out.println("======Info about person======");
        System.out.println("Data format:");
        System.out.println("1. Full name - name, middle name, surname;");
        System.out.println("2. Birthday - mm/dd/yyyy;");
        System.out.println("3. Phone number - xxxxxxxxx;");
        System.out.println("4. Sex - m or f;");
        System.out.println("5. Exit - enter -1;");
        displaySeparator();
    }

    private void displaySeparator() {
        System.out.println("=============================");
    }
}
