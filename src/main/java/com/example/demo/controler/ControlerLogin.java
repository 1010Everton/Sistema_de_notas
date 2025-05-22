package com.example.demo.controler;

import com.example.demo.service_login;
import com.example.demo.usuarios.Lista_professores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/Loginprof")
public class ControlerLogin {
    @Autowired
    private service_login login;

    public List<Lista_professores> listaprofessores(@RequestParam String nome,@RequestParam String numero_matricula) {
        try {
            return login.buscarClientesPorNome(nome,numero_matricula);
        }
        catch (Exception e){
            System.out.print(e);

        }
        return null;
    }

}
