package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> notes = new LinkedHashSet<Laptop>();

        Laptop curbook = new Laptop("ASUS Laptop E210KA-GJ080W", 4,
                128, "Windows 11 Home Single Language",
                "gray", 22999f, "FRELJ239847",
                LocalDate.parse("2019-08-21"));
        notes.add(curbook);

        curbook = new Laptop("Acer Extensa 15 EX215-31-C3FF", 6,
                512, "without OS", "black", 24299f, "ARE345O38475",
                LocalDate.parse("2021-01-15"));
        notes.add(curbook);

        curbook = new Laptop("MSI GF66 Katana 11SC-1251XRU", 8,
                256, "Windows 12 Home Single Language",
                "black", 64999f, "MS098L234509",
                LocalDate.parse("2022-07-02"));
        notes.add(curbook);

        curbook = new Laptop("Lenovo IdeaPad 3 15ALC6", 8,
                1000, "Windows 11 Home Single Language",
                "gray", 52999f, "LNV34578HJ34",
                LocalDate.parse("2022-04-14"));
        notes.add(curbook);

        curbook = new Laptop("ASUS TUF Dash F15 FX516PR-HN033T", 16,
                512, "Windows 10 Home Single Language",
                "gray", 125999f, "FARJ249847",
                LocalDate.parse("2022-10-20"));
        notes.add(curbook);

        System.out.println("\n--------------- Full list of laptops ---------------");
        for (Laptop item : notes) {
            System.out.println(item);
        }

        filter(notes);
    }

    public static void filter(Set<Laptop> srcSet) {

        Map<String, String> paramName = new HashMap<>();
        paramName.put("1", "Model");
        paramName.put("2", "Min RAM");
        paramName.put("3", "Min HDD");
        paramName.put("4", "Type of OS");
        paramName.put("5", "Color");
        paramName.put("6", "Cost");

        Scanner scanner = new Scanner(System.in);
        String[] criteria;

        while (true) {
            System.out.println("\n*************** Searching of laptops ***************");
            System.out.println("Choose criterias of searching (for example: 1 2):");
            for (Map.Entry<String, String> param : paramName.entrySet()) {
                System.out.printf("[%s] - %s\n", param.getKey(), param.getValue());
            }
            System.out.println("[Q] - Exit");
            System.out.println("Enter criterias of searching:");

            String input = scanner.nextLine();
            if (input.toUpperCase().equals("Q")) {
                System.out.println("Exit.");
                break;
            }
            criteria = input.trim().toUpperCase().split(" ");

            Map<String, String> params = new HashMap<>(criteria.length);
            for (int i = 0; i < criteria.length; i++) {
                String criteriaNum = criteria[i];
                System.out.printf("Define filter [%s] - %s: ", criteriaNum, paramName.get(criteriaNum));
                input = scanner.nextLine();
                params.put(criteriaNum, input);
            }

            Set<Laptop> resSet = new LinkedHashSet<Laptop>();

            for (Laptop item : srcSet) {
                boolean itFits = true;
                for (Map.Entry<String, String> curparam : params.entrySet()){
                    switch (curparam.getKey()) {
                        case "1":
                            if (! item.getModel().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                        case "2":
                            if (item.getVolumeRAM() < Integer.parseInt(curparam.getValue()))
                                itFits = false;
                            break;
                        case "3":
                            if (item.getVolumeHDD() < Integer.parseInt(curparam.getValue()))
                                itFits = false;
                            break;
                        case "4":
                            if (!item.getTypeOS().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                        case "5":
                            if (!item.getColor().toUpperCase().contains(curparam.getValue().toUpperCase()))
                                itFits = false;
                            break;
                        case "6":
                            if (item.getPrice() < (float) Double.parseDouble(curparam.getValue()))
                                itFits = false;
                            break;
                    }
                }
                if (itFits)
                    resSet.add(item);
            }

            System.out.println("\n<<<<<<<<<<<<<<< Result >>>>>>>>>>>>>>>");
            for (Laptop item : resSet)
                System.out.println(item);
        }
    }
}