package org.example;

import java.util.Scanner;

public class Admin implements User {
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "Admin123";
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void inputAdminDetails(Scanner scanner) {
        System.out.print("Enter Admin Username: ");
        setUsername(scanner.nextLine());
        System.out.print("Enter Admin Password: ");
        setPassword(scanner.nextLine());
    }

    public boolean isAdminCredentialsCorrect() {
        return getUsername().equals(USERNAME) && getPassword().equals(PASSWORD);
    }
}
