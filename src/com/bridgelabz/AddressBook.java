package com.bridgelabz;

import java.util.Scanner;


public class AddressBook {
    private ContactPerson[] contacts;
    private int numContacts;

    public AddressBook() {
        this.contacts = new ContactPerson[100];
        this.numContacts = 0;
    }

    public void addContact(String name, String phoneNumber, String email) {
        ContactPerson contact = new ContactPerson(name, phoneNumber, email);
        this.contacts[this.numContacts] = contact;
        this.numContacts++;
    }

    public void editContact(String name, String newPhoneNumber, String newEmail) {
        for (int i = 0; i < this.numContacts; i++) {
            if (this.contacts[i].getName().equals(name)) {
                if (newPhoneNumber != null) {
                    this.contacts[i].setPhoneNumber(newPhoneNumber);
                }
                if (newEmail != null) {
                    this.contacts[i].setEmail(newEmail);
                }
                break;
            }
        }
    }

    public void printContacts() {
        for (int i = 0; i < this.numContacts; i++) {
            System.out.println("Name: " + this.contacts[i].getName());
            System.out.println("Phone number: " + this.contacts[i].getPhoneNumber());
            System.out.println("Email: " + this.contacts[i].getEmail());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        // Add contacts
        addressBook.addContact("John Doe", "555-1234", "johndoe@example.com");
        addressBook.addContact("Jane Smith", "555-5678", "janesmith@example.com");

        // Print contacts before editing
        System.out.println("Contacts before editing:");
        addressBook.printContacts();

        // Get user input for editing a contact
        System.out.print("Enter name of contact to edit: ");
        String name = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter new email address: ");
        String emailAddress = scanner.nextLine();

        // Edit the contact
        addressBook.editContact(name, phoneNumber, emailAddress);

        // Print contacts after editing
        System.out.println("Contacts after editing:");
        addressBook.printContacts();
    }

    class ContactPerson {
        private String name;
        private String phoneNumber;
        private String email;

        public ContactPerson(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getName() {
            return this.name;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}