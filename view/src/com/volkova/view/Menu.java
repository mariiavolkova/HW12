package com.volkova.view;

import java.util.Scanner;

public class Menu {
    Actions actionsMenu = new Actions();
    private Scanner scanner = new Scanner(System.in);
    private String[] items = new String[]{
            "1. Create User",
            "2. Delete User",
            "3. Update User",
            "4. Show all Users",
            "5. Exit App"};

    private void showOptions() {
        for (String item : items) {
            System.out.println("--------------------");
            System.out.println(item);
        }
    }

    private void exit() {
        System.exit(0);
    }

    public void showMenu() {
        int forSwitch;
        while (true) {
            showOptions();
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            String choice = scanner.next();
            forSwitch = switch (choice) {
                case "1" -> {
                    actionsMenu.createUser();
                    yield 1;
                }
                case "2" -> {
                    actionsMenu.deleteUser();
                    yield 2;
                }
                case "3" -> {
                    actionsMenu.updateUser();
                    yield 3;
                }
                case "4" -> {
                    actionsMenu.showUsers();
                    yield 4;
                }
                case "5" -> {
                    exit();
                    yield 5;
                }
                default -> 1;
            };
        }
    }
}