package com.springboot.springbootCourse.UserDAOService;

import com.springboot.springbootCourse.entity.UserEntity;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

private static final Logger log =
        (Logger) LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    @Autowired
   private UserDAOService userDAOService;
    @Override
    public void run(String... args) throws Exception {
        UserEntity userEntity = new UserEntity("Jack","Admin");
       long insert = userDAOService.insert(userEntity);
       log.info("New User Created:  " +userEntity);
    }
}
