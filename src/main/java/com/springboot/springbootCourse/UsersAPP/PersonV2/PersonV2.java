package com.springboot.springbootCourse.UsersAPP.PersonV2;

import com.springboot.springbootCourse.UsersAPP.PersonV1.Name.Name;

public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + name +
                '}';
    }
}
