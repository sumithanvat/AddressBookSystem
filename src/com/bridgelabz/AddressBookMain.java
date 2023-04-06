package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        AddressBook addressBook = new AddressBook();
        // Add some sample contacts
        addressBook.addPerson(new Person("", "", ""));
        addressBook.addPerson(new Person("", "", ""));
        addressBook.addPerson(new Person("", "", ""));
        // Delete a contact
        addressBook.deletePerson("");
        // Display remaining contacts
        addressBook.displayContacts();
    }
}



