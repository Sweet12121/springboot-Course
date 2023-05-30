package com.springboot.springbootCourse.UserDAOService;

import com.springboot.springbootCourse.entity.UserEntity;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class UserRepositoryCommandLineRunner implements CommandLineRunner {

private static final Logger log =
        (Logger) LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
   private UserRepositor userRepositor;
    @Override
    public void run(String... args) throws Exception {
        UserEntity userEntity = new UserEntity("Jill","Admin");
       userRepositor.save(userEntity);
       log.info("New User Created:  " +userEntity);
    }
}
