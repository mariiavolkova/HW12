package com.volkova.service;

import com.volkova.model.User;

public interface UserService {

    void createUser(String login, String password, String name, String surname, int age, String maritalStatus);

    void deleteUser(User user);

    void updateUser(String newLogin, String newPassword, String newName, String newSurname, int newAge, String newMaritalStatus);

    void showAll();
}
