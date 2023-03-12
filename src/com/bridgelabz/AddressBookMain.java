package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (!quit) {
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Display contacts");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter address: ");
                    String address = scanner.next();
                    System.out.print("Enter city: ");
                    String city = scanner.next();
                    System.out.print("Enter state: ");
                    String state = scanner.next();
                    System.out.print("Enter zip: ");
                    String zip = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.displayContacts();
                    System.out.print("Enter index of contact to remove: ");
                    int index = scanner.nextInt();
                    addressBook.removeContact(index);
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}

class AddressBook {
    private Contact[] contacts;
    private int numContacts;

    public AddressBook() {
        contacts = new Contact[100];
        numContacts = 0;
    }

    public void addContact(Contact contact) {
        if (numContacts < contacts.length) {
            contacts[numContacts] = contact;
            numContacts++;
        } else {
            System.out.println("Address book is full. Cannot add more contacts.");
        }
    }

    public void removeContact(int index) {
        if (index >= 0 && index < numContacts) {
            for (int i = index; i < numContacts - 1; i++) {
                contacts[i] = contacts[i + 1];
            }
            contacts[numContacts - 1] = null;
            numContacts--;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayContacts() {
        if (numContacts == 0) {
            System.out.println("No contacts.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < numContacts; i++) {
                System.out.println(i + ". " + contacts[i]);
            }
        }
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }
}