package com.springboot.springbootCourse.UsersAPP;


import com.springboot.springbootCourse.UsersAPP.PersonV1.Name.Name;
import com.springboot.springbootCourse.UsersAPP.PersonV1.PersonV1;
import com.springboot.springbootCourse.UsersAPP.PersonV2.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("v1/person")

      public PersonV1 getFirstVersionofPerson(){
        return new PersonV1("Siva Bala");
    }
    @GetMapping("v2/person")

    public PersonV2 getSecondVersionofPerson(){
        return new PersonV2(new Name("Bob","Cheeky"));
    }
    //pathparm
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionofPersonRequestParameter(){
        return new PersonV1("Siva Balakananaa");
    }
}
