package com.corporate.email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String email;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(8);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
                department + "." + companySuffix;
    }

    private String setDepartment() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter choice: ");
        int depChoice = in.nextInt();
        in.nextLine(); // consume leftover newline
        if (depChoice == 1) return "sales";
        else if (depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else return "general";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void showInfo() {
        System.out.println("DISPLAY NAME: " + firstName + " " + lastName);
        System.out.println("COMPANY EMAIL: " + email);
        System.out.println("MAILBOX CAPACITY: " + mailboxCapacity + "mb");
        System.out.println("PASSWORD: " + password);
    }
}
