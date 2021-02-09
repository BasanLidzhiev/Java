package com.company.java2.lesson3;

import java.awt.geom.Line2D;
import java.util.*;

public class PhoneBook {
    private List<String> lastNames;
    private List<String> phoneNumbers;
    private Map<String, LinkedList<String>> phoneBook;

    public PhoneBook(List<String> lastNames, List<String> phoneNumbers, Map<String, LinkedList<String>> phoneBook) {
        this.lastNames = lastNames;
        this.phoneNumbers = phoneNumbers;
        this.phoneBook = phoneBook;
    }

    public List<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            phoneBook.put(lastName, new LinkedList<>());
            phoneBook.get(lastName).add(phoneNumber);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(new LinkedList<>(), new ArrayList<>(), new HashMap<>());
        phoneBook.add("Obama", "89060889999");
        phoneBook.add("Obama", "89060889998");
        phoneBook.add("Trump", "89060889009");
        phoneBook.add("Bush", "89060881199");
        phoneBook.add("Clinton", "89060882299");
        phoneBook.add("Bush", "89330881199");
        for (String number : phoneBook.get("Obama")) {
            System.out.println("Obama's numbers " + number);
        }
    }
}
