package com.example.sweater;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    /* @GetMapping("/")
     public String main(Map <String, Object> model) {
         model.put("some", "hello, lets code");
         return "main";
     }*/
    @GetMapping("/")
    @ResponseBody
    public Cat main() {
        Cat cat = new Cat("basik", 3);
        return cat;
    }
}

class Cat {
    String name;
    int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }
}