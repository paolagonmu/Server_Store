package com.store.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.dto.ClientDto;
import com.store.demo.repository.Client_Repository;



@RestController
public class Client_controller {
	
	
	@Autowired
	Client_Repository client;
	
	@RequestMapping(value="/client", method=RequestMethod.GET)
	 public  List<ClientDto> mostrar(){
        return client.buscarTodos() ;
    }
	
}
	


