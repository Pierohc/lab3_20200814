package com.example.lab3.Controllers;


import com.example.lab3.Entitys.Sede;
import com.example.lab3.Entitys.Veterinario;
import com.example.lab3.Repositories.SedeRepository;
import com.example.lab3.Repositories.VeterinarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value="/main",method= RequestMethod.GET)
public class SedeController {

    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }


    @GetMapping(value="")
    public String main(Model model){

        List<Sede> lista = sedeRepository.findAll();

        for(Sede p : lista){
            System.out.println(p.getNombre());
        }

        model.addAttribute("lista", lista);
        return "index";
    }



}
