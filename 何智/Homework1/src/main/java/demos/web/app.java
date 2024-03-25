package demos.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
