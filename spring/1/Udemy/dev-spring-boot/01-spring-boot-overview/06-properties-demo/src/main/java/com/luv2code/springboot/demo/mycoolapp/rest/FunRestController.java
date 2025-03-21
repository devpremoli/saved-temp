package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties: coach.name and coach.team
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "coachName: " + coachName + ", teamName: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run a hard 5k";
    }
    // expose a new endpoint for "workout"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "returning today is your lucky day.";
    }


}
