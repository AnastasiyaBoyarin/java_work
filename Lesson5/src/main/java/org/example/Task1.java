package org.example;

import java.util.*;
import java.util.Map.Entry;


public class Task1 {
    private Map<String, ArrayList<String>> phonesBook = new HashMap<String, ArrayList<String>>();

    public void createPhoneBook() {
        phonesBook.put("Ivanov Ivan", new ArrayList<String>());
        phonesBook.put("Petrov Petr", new ArrayList<String>());
        phonesBook.put("Sidorov Sidr", new ArrayList<String>());
        phonesBook.put("Lapatin Lapt", new ArrayList<String>());

        int counter = 0;
        for (Map.Entry<String, ArrayList<String>> item : phonesBook.entrySet()) {
            ArrayList<String> phoneNumbers = new ArrayList<String>();
            if (counter % 2 == 0) {
                phoneNumbers.add("8-965-454-00-" + counter);
                phoneNumbers.add("8-965-454-01-" + counter);
                item.setValue(phoneNumbers);
            } else {
                phoneNumbers.add("8-965-454-03-" + counter);
                item.setValue(phoneNumbers);
            }
            counter++;
            System.out.println("Phone numbers of" + " " + item.getKey() + " " + item.getValue());
        }
    }

    public void sortByCountOfNumbers() {
        Comparator<Entry<String, ArrayList<String>>> valueComparator =
                new Comparator<Entry<String, ArrayList<String>>>() {
            @Override
            public int compare(Entry<String, ArrayList<String>> o1, Entry<String, ArrayList<String>> o2) {
                Integer size1 = o1.getValue().size();
                Integer size2 = o2.getValue().size();
                return size1 - size2;
            }
        };

        List<Entry<String, ArrayList<String>>> sortedPhonesBookByValue = new
                ArrayList<Entry<String, ArrayList<String>>>(phonesBook.entrySet());

        Collections.sort(sortedPhonesBookByValue, valueComparator);

        System.out.println("HashMap after sorting entries by values ");
        for (Entry<String, ArrayList<String>> item : sortedPhonesBookByValue){
            System.out.println("Phone numbers of" + " " + item.getKey() + " " + item.getValue());
        }
    }
}
