package com.volkova.service;

public interface UserService {

    boolean createUser(String login, String password, String name, String surname, int age, String maritalStatus);

    void deleteUser(String login);

    void updateUser(String login, String password, String name, String surname, int age, String maritalStatus);

    void showAll();
}