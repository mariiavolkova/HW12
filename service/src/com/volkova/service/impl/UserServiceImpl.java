package com.volkova.service.impl;

import com.volkova.model.User;
import com.volkova.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();
    private Integer id = 1;
    private int nullAge = 0;
    private int maxAge = 150;


    @Override
    public void createUser(String login, String password, String name, String surname, int age, String maritalStatus) {
        if (age <= nullAge || age > maxAge) {
            System.out.println("Incorrect Age!");
        } else {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setName(name);
            user.setSurname(surname);
            user.setAge(age);
            user.setMaritalStatus(maritalStatus);
            users.add(user);
        }
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }

    @Override
    public void updateUser(String newLogin, String newPassword, String newName, String newSurname, int newAge, String newMaritalStatus) {
        {
            User user = new User();
            user.setLogin(newLogin);
            user.setPassword(newPassword);
            user.setName(newName);
            user.setSurname(newSurname);
            user.setAge(newAge);
            user.setMaritalStatus(newMaritalStatus);
            users.add(user);
        }
    }

    @Override
    public void showAll() {
        users.forEach(user -> System.out.println(users));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserServiceImpl that = (UserServiceImpl) o;
        return nullAge == that.nullAge &&
                maxAge == that.maxAge &&
                Objects.equals(users, that.users) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, id, nullAge, maxAge);
    }
}
