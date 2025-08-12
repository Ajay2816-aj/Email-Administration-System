package com.corporate.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Email> accounts = new ArrayList<>();

        System.out.println("=== Email Administration System ===");

        while (true) {
            System.out.print("\nEnter first name (or type 'exit' to stop): ");
            String firstName = scanner.nextLine();
            if (firstName.equalsIgnoreCase("exit")) break;

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            Email emailAccount = new Email(firstName, lastName);
            accounts.add(emailAccount);

            System.out.println("\n✅ Account created successfully!");
            emailAccount.showInfo(); // Show details immediately
            System.out.println("-----------------------");
        }

        System.out.println("\n=== Summary: All Accounts Created ===");
        for (Email account : accounts) {
            account.showInfo();
            System.out.println("-----------------------");
        }
    }
}
