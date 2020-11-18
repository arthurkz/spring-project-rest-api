package com.springproject.springprojectapi.controller;

import com.springproject.springprojectapi.model.Client;
import com.springproject.springprojectapi.repository.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired // adiciona uma intancia automaticamente
    private ClientRespository clientRespository;

    @GetMapping
    public List<Client> listClients(){
        return clientRespository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client postClient(@RequestBody Client client){
        return clientRespository.save(client);
    }

}
