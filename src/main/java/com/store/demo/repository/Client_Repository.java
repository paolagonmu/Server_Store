package com.store.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.store.demo.dto.ClientDto;

@Repository
public class Client_Repository {
	
	 public List<ClientDto> buscarTodos() {
		    List<ClientDto> lista= new ArrayList<ClientDto>();
		    lista.add(new ClientDto (12345,"sergio","11 # 14-08"));
		    lista.add(new ClientDto (12345,"Andres","11 # 16-09"));
		    
		    return lista;
		    
		  }

}
