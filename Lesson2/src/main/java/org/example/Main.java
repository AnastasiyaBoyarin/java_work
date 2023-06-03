package org.example;

public class Main {
    public static void main(String[] args) {
        // Task 1.
        Task1 task1 = new Task1();

        String sqlRequest = "select * from students";
        String[] paramName = { "name", "country", "city" };
        String[] paramValue = { "Ivanov", "Russia", "Moscow" };
        String response = task1.createRequestString(paramName, paramValue);
        System.out.println(sqlRequest + response);

        String jsonString = "{\"name\": \"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String result2 = sqlRequest + task1.jsonToSql(jsonString);
        System.out.println(result2);

        // Task 2.
        Task2 task2 = new Task2();
        task2.readDataFromJsonFile();
    }
}