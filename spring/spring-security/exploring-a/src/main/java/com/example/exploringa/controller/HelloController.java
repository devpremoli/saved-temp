package com.example.exploringa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping()
    public String home() {
        return "Home Page";
    }

    @GetMapping("/public/hello")
    public String publicHello() {
        return "This is a public endpoint!";
    }

    @GetMapping("/hello")
    public String securedHello() {
        return "Hello, authenticated user!";
    }
    /*
    -------------------------------------- Circular Dependency ----------------------------------------------------------------

    -------------------------------------- Console Message Copied -------------------------------------------------------------
    Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
    2024-12-17T18:04:54.689-06:00 ERROR 40941 --- [security-demo] [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

    ***************************
    APPLICATION FAILED TO START
    ***************************

    Description:

    The dependencies of some of the beans in the application context form a cycle:

    ┌──->──┐
    |  config defined in file [/Users/devpremoli/Desktop/security-demo/target/classes/com/example/exploringa/controller/security/config.class]
    └──<-──┘


    Action:

    Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.


    Process finished with exit code 1
    -------------------------------------- Console Message Copied -------------------------------------------------------------

    Explanation: You are trying to inject the InMemoryUserDetailsManager bean, which is being created inside the same class as a @Bean. This leads to a circular
    dependency because:
    1. Spring tries to instantiate the config class.
    2. To resolve its dependency (InMemoryUserDetailsManager), it needs to call inMemoryUserDetailsManager() (the bean method).
    3. Since the config class is not yet fully constructed, Spring cannot proceed.

    Solution: To fix the circular dependency, avoid injecting a bean that is declared in the same configuration class. Instead, directly
    call the @Bean method within the configuration.
    -------------------------------------- Circular Dependency ----------------------------------------------------------------
    */
//    private final InMemoryUserDetailsManager inMemoryUserDetailsManager;
//    @Autowired
//    public config(InMemoryUserDetailsManager inMemoryUserDetailsManager) {
//        this.inMemoryUserDetailsManager = inMemoryUserDetailsManager;
//    }
}
