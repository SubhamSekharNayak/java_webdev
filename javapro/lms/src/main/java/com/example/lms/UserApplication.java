package com.example.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api2")
public class UserApplication {
    // http://localhost:8081/api2/user/8655
    // domain/classMapping/methodMapping/userid
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id){
        return "User ID: "+ id;
    }
    // http://localhost:8081/api2/product/1004
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id){
        return "Product ID: "+ id;
    }

    // http://localhost:8081/api2/search?id=100
    // id=100 (called query string) 
    @GetMapping("/search")
    public String search(@RequestParam("id") int id){
        return "Search ID: "+ id;
    }
    
}
