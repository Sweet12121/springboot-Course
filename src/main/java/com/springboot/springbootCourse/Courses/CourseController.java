package com.springboot.springbootCourse.Courses;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Courses> retriveAllCourses(){

        return Arrays.asList(
                new Courses(1,"Learn Java" ,"Learning"),
                new Courses(2,"Learn AWS","Learning.com")
        );
    }

}
