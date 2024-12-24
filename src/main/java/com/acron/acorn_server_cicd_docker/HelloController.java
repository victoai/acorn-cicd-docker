package com.acron.acorn_server_cicd_docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hi")

    public  String hi(){
        return  "hi docker cidfdfdcd !!!! dfdfddfdf";
    }
}
