package com.volkova.service.impl;

import com.volkova.model.User;
import com.volkova.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private Map<Integer, User> users = new HashMap<>();
    private Integer id = 1;
    private int nullAge = 0;
    private int maxAge = 150;

    @Override
    public boolean createUser(String login, String password, String name, String surname, int age, String maritalStatus) {
        if (age <= nullAge || age > maxAge) {
            return false;
        } else {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setName(name);
            user.setSurname(surname);
            user.setAge(age);
            user.setMaritalStatus(maritalStatus);
        }
        return true;
    }

    @Override
    public void deleteUser(String login) {

    }

    @Override
    public void updateUser(String login, String password, String name, String surname, int age, String maritalStatus) {

    }

    @Override
    public void showAll() {
        users.forEach((key, value) -> System.out.println(key + "  " + value));
    }
}