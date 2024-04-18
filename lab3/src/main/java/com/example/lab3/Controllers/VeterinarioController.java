package com.example.lab3.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/veterinario", method = RequestMethod.GET)
public class VeterinarioController {

    @GetMapping(value="")
    public String veterinarios(){

        return "veterinarios";
    }




}
