package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    private ArrayList<Person> contacts;
    public AddressBook() {
        contacts = new ArrayList<>();
    }
    public void deletePerson(String name) {
        for (Person p : contacts) {
            if (p.getName().equalsIgnoreCase(name)) {
                contacts.remove(p);
                System.out.println("Deleted " + name + " from address book.");
                return;
            }
        }
        System.out.println(name + " not found in address book.");
    }
    public void addPerson(Person alice) {
    }
    public void displayContacts() {
    }
    // Other methods for adding, editing, and displaying contacts
}