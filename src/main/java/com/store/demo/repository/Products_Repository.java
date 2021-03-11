package com.store.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.store.demo.dto.FacturaDTO;
import com.store.demo.dto.Products_StoreDTO;

@Repository
public class Products_Repository {
	int suma;
	
	public List<Products_StoreDTO> buscarTodos() {
	    List<Products_StoreDTO> lista= new ArrayList<Products_StoreDTO>();
	    lista.add(new Products_StoreDTO (80000,"Audifonos"));
	    lista.add(new Products_StoreDTO (30000,"Cargador"));
	    lista.add(new Products_StoreDTO (25000,"USB"));
	    lista.add(new Products_StoreDTO (40000,"Parlantes"));
	    
	    return lista;	    
	  }
	public List<Products_StoreDTO> buscarTodos2() {
	    List<Products_StoreDTO> lista= new ArrayList<Products_StoreDTO>();
	    lista.add(new Products_StoreDTO (80000,"Audifonos"));
	    lista.add(new Products_StoreDTO (30000,"Cargador"));
	    lista.add(new Products_StoreDTO (25000,"USB"));
	    lista.add(new Products_StoreDTO (40000,"Parlantes"));
	    
	    return lista;	    
	  }
	
	
	
	public List<FacturaDTO> MostarPrecio(@RequestParam (value="price1")int price1,@RequestParam (value="price2")int price2 ) {
		//suma = price1 + price2;
		  List<FacturaDTO> factura = new ArrayList<FacturaDTO>();
		if( (price1 + price2) == 70000) {
			factura.add(new FacturaDTO (19,5000));
		}else 
			if((price1 + price2) == 10000){
			factura.add(new FacturaDTO (19,0));
		}
		
		 return factura; 	    
	  }

}
