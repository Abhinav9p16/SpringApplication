package com.cg.greetingapp.controller;

import com.cg.greetingapp.model.Greeting;
import com.cg.greetingapp.model.User;
import com.cg.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @RequestMapping(value = {"","/","/home"})
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "") String firstName,
                             @RequestParam(value = "lastName", defaultValue = "") String lastName){
        User user=new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/get/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable long id){
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/get")
    public List<Greeting> getGreetings(){
        return greetingService.getAllGreetings();
    }

    @PutMapping("/put/{id}")
    public Greeting updateGreeting(@PathVariable long id,@RequestParam(value = "message") String message){
        return greetingService.updateGreeting(id,message);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGreeting(@PathVariable long id){
        greetingService.deleteGreeting(id);
    }
}