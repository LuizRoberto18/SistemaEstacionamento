package br.com.testspringboot.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView index = new ModelAndView("index.html");
        return index;
    }

    @RequestMapping("/cadastro")
    public ModelAndView cadastroUsuario() {
        ModelAndView cadastro = new ModelAndView("cadastro-usuario.html");
        return cadastro;
    }

    @RequestMapping("/lista-veiculos")
    public ModelAndView lisaVeiculos() {
        ModelAndView cadastro = new ModelAndView("lista-veiculos.html");
        return cadastro;
    }
}
