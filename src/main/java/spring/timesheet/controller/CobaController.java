package spring.timesheet.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coba")
@Component
public class CobaController {

    // @Value("${faqih.name}")
    // private String name;

    // @Value("${faqih.age}")
    // private String age;

    // @Value("${address}")
    // private String adress;

    @GetMapping("/hello")
    public String getHello() {
        String name = "Faqih";
        // return "Hello " + name + " dan umurnya " + age + " from CobaController";
        // return "Hello " + name + "umur " + age + " dan addressnya " + adress + " from
        // CobaController";
        return name;
    }

    // @PatchMapping("/hello/patch/{id}")
    // public String patchHello(@PathVariable String id, @RequestBody String entity)
    // {
    // return entity;
    // }
    //
    // @PutMapping("/hello/put/{id}")
    // public String putHello(@PathVariable String id, @RequestBody String entity) {
    //
    // return entity;
    // }
}
