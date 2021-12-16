package com.example.stub.controllers;

import com.example.stub.entities.Entity;
import com.example.stub.entities.EntityUnits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
public class MyController {

    public Entity getUserJsonData(int id, String name, String grade) {
        Entity user = new Entity();
        user.setId(id);
        user.setName(name);
        user.setGrade(grade);
        return user;
    }
    Entity user1 = getUserJsonData(1, "mil", "gr");
    Entity user2 = getUserJsonData(2, "mil2", "gr2");
    Entity user3 = getUserJsonData(3, "mil3", "gr3");

    @GetMapping("/{id}")
    public EntityUnits getUserById(@PathVariable int id) {
       if (id == 1) {
            return new EntityUnits(user1.getId(),user1.getName(), user1.getGrade(), "school_name", "city");
        }
       if (id == 2) {
            return new EntityUnits(user2.getId(),user2.getName(), user2.getGrade(), "school_name", "city");
        }
       if (id == 3) {
            return new EntityUnits(user3.getId(),user3.getName(), user3.getGrade(), "school_name", "city");
        }
       else return null;

    }



    @GetMapping("/get/all")
    public List<Entity> getUsers() {

       return Arrays.asList(user1,user2,user3);

    }

}
