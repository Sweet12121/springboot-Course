package com.springboot.springbootCourse.UserDAOService;

import com.springboot.springbootCourse.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositor extends JpaRepository<UserEntity, Long> {


}
