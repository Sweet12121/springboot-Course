package com.springboot.springbootCourse.UsersAPP;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {


    private static int userCount = 0;
    public static List<User> users = new ArrayList<>();

    static {
        users.add(new User(++userCount, "Adam", LocalDate.now().minusWeeks(30)));
        users.add(new User(++userCount, "Mike", LocalDate.now().minusWeeks(31)));
        users.add(new User(++userCount, "VCal", LocalDate.now().minusWeeks(35)));

    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {

        Predicate<? super User> predicate = users -> users.getId().equals(id);
         return  users.stream().filter(predicate).findAny().get();

    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
         return user;

    }

    public void deleteById(int id) {
        Predicate<? super User> predicate=user -> user.getId().equals(id);

       users.removeIf(predicate);

    }
}