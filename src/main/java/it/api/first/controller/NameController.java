package it.api.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NameController {

    private String myName = "Ionut";

    @GetMapping(value = "/name")
    public String getMyName(){
        return "My name is : "+myName;
    }

    @PostMapping(value = "/name")
    public String postMyName(){
        return "My reverse name is : "+new StringBuilder().append(myName).reverse().toString();
    }

}
