package com.example.sweater;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
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
    public JSONObject main() {
       JSONObject json = new JSONObject();
       json.put("name", "Iuliia");
       json.put("lastName", "Azarina");
        return json;
    }
}