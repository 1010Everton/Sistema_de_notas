package com.example.demo.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Login")
public class LoginControler {

    @GetMapping
    public String paginaDeLogin(){
        return "Login";
    }

}
