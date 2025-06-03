package ru.netology.springBootRest.repository;

import lombok.Data;
import org.springframework.stereotype.Repository;
import ru.netology.springBootRest.Authorities;

import java.util.*;

@Repository
public class UserRepository {
    private Map<String, Person> userList = new HashMap<>();

    {
        Person user1 = new Person("Vasya", "111", List.of(Authorities.values()));
        Person user2 = new Person("Petya", "222", List.of(Authorities.READ, Authorities.WRITE));
        userList.put(user1.getUser(), user1);
        userList.put(user2.getUser(), user2);
    }

    public List<Authorities> getUserAuthorities(String login, String password) {

        Person currentUser = userList.get(login);
        if (currentUser != null && currentUser.getPassword().equals(password)) {
            return currentUser.getAuthoritiesList();
        } else {
            return null;
        }
    }
}
