package com.volkova.view;

import java.util.Objects;
import java.util.Scanner;

import com.volkova.model.User;
import com.volkova.service.UserService;
import com.volkova.service.impl.UserServiceImpl;

public class Actions {

    Scanner scanner = new Scanner(System.in);
    UserService userService = new UserServiceImpl();

    void createUser() {
        System.out.print("Enter your login: ");
        String login = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.println("Enter your age (only numbers!!!): ");
        var age = scanner.nextInt();

        System.out.print("Enter your Marital Status: ");
        String maritalStatus = scanner.next();

        System.out.println("Done! You create a Profile!");
        userService.createUser(login, password, name, surname, age, maritalStatus);
    }

    void updateUser() {
        System.out.println("Enter your Login to Update account: ");
        String login = scanner.next();
        User users = new User();

        if (Objects.equals(login, users.getLogin())) {
            System.out.println("Now you can Update account.");
            System.out.println("____________________________");

            System.out.print("Enter your new login: ");
            String login = scanner.next();

            System.out.print("Enter your new password: ");
            String password = scanner.next();

            System.out.print("Enter your new name: ");
            String name = scanner.next();

            System.out.print("Enter your new surname: ");
            String surname = scanner.next();

            System.out.println("Enter your new age (only numbers!!!): ");
            var age = scanner.nextInt();

            System.out.print("Enter your new Marital Status: ");
            String maritalStatus = scanner.next();

            userService.updateUser(login, password, name, surname, age, maritalStatus);

        } else {
            System.out.println("Invalid Login! Try again!");
        }
    }

    void deleteUser() {
        System.out.println("Enter your Login to Delete account: ");
        String login = scanner.next();

        userService.deleteUser(login);
        System.out.println("Your account deleted!");

    }

    public void showUsers() {
        userService.showAll();
        System.out.println(" ");
    }
}