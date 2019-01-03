package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//the above annotation marks this class as rest controller
//this is a part of spring mvc
public class HelloController {

    @RequestMapping("/hi")
//    this annotation tells the spring framework that whenever there is a request to /hi, the below method will be executed
//    by default, the @RequestMapping annotation maps to all HTTP methods
    public String sayHi() {
        return "Hi";
    }
}
