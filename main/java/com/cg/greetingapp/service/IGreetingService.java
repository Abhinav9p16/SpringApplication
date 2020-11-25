package com.cg.greetingapp.service;

import com.cg.greetingapp.model.Greeting;
import com.cg.greetingapp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Optional<Greeting> getGreetingById(long id);

    List<Greeting> getAllGreetings();

    Greeting updateGreeting(long id, String message);

    void deleteGreeting(long id);
}
