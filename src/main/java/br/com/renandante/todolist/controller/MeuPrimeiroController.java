package br.com.renandante.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota
public class MeuPrimeiroController {
    
    /*
    * GET - Buscar uma informação
    * POST - Adicionar um dado/informação
    * PUT - Alterar um dado/info
    * DELETE - Remover um dado/info
    * PATCH - Alterar somente uma parte do dado/info
    */

    @GetMapping("/PrimeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
