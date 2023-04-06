package com.bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> addressBook = new ArrayList<>();
        String name, address, phone;

        // Loop to add multiple persons
        while (true) {
            System.out.println("Enter name (or 'quit' to exit):");
            name = scanner.nextLine();
            if (name.equals("quit")) {
                break;
            }

            System.out.println("Enter address:");
            address = scanner.nextLine();

            System.out.println("Enter phone number:");
            phone = scanner.nextLine();

            // Create a new Person object and add it to the address book
            Person person = new Person(name, address, phone);
            addressBook.add(person);

            System.out.println("Person added to address book.");
        }

        // Print all persons in the address book
        for (Person person : addressBook) {
            System.out.println(person);
        }
    }
}