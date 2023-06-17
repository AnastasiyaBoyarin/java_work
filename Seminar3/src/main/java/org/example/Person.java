package org.example;

public class Person {

    public Person(String name, String middleName, String surname, String birthday, Integer phoneNumber, char sex) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }


    private String name;
    private String surname;
    private String middleName;
    private String birthday;
    private Integer phoneNumber;
    private char sex;

    @Override
    public String toString() {
        return "<" + surname + ">" + "<" + name + ">" + "<" + middleName + ">" +
                "<" + birthday + ">" + "<" + phoneNumber + ">" + "<" + sex + ">";
    }

    public String getSurname() {
        return surname;
    }
}
