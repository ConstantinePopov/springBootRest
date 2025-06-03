package ru.netology.springBootRest.repository;

import ru.netology.springBootRest.Authorities;

import java.util.List;

public class Person {
    private String user;
    private String password;
    private List<Authorities> authoritiesList;

    public Person(String login, String password, List<Authorities> authoritiesList) {
        this.user = login;
        this.password = password;
        this.authoritiesList = authoritiesList;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthoritiesList() {
        return authoritiesList;
    }
}
