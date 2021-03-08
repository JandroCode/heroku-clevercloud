package com.example.herokuclevercloud.controllers;

import com.example.herokuclevercloud.models.dao.IClienteDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private IClienteDAO clienteDao;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("clientes", clienteDao.findAll());
        return "home";
    }

    
    
}
