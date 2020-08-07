package com.volkova.view;

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
        System.out.println("Enter your Password to Update account: ");
        String password = scanner.next();
        User user = new User();

        if (password.equals(user.getPassword())) {
            System.out.println("Now you can Update account.");
            System.out.println("____________________________");

            System.out.print("Enter your new login: ");
            String newLogin = scanner.next();

            System.out.print("Enter your new password: ");
            String newPassword = scanner.next();

            System.out.print("Enter your new name: ");
            String newName = scanner.next();

            System.out.print("Enter your new surname: ");
            String newSurname = scanner.next();

            System.out.println("Enter your new age (only numbers!!!): ");
            var age = scanner.nextInt();

            System.out.print("Enter your new Marital Status: ");
            String newMaritalStatus = scanner.next();


            userService.updateUser(newLogin, newPassword, newName, newSurname, age, newMaritalStatus);
        } else {
            System.out.println("Invalid Password! Try again!");
        }
    }

    void deleteUser() {
        System.out.println("Enter your Login to Delete account: ");
        String login = scanner.next();
        User user = new User();

        if (login.equals(user.getLogin())) {
            userService.deleteUser(user);
        }
        System.out.println("Your account deleted!");

    }

    public void showUsers() {
        userService.showAll();
        System.out.println(" ");
    }
}
