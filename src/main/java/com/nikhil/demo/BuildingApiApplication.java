package com.nikhil.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
@RestController
public class BuildingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildingApiApplication.class, args);
    }

}
