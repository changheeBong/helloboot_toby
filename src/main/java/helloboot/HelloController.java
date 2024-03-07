package helloboot;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class HelloController  {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        if(name == null || name.trim().length() == 0)throw new IllegalArgumentException();
        return helloService.sayHello(name);
    }

}
