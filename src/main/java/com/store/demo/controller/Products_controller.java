package com.store.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.dto.FacturaDTO;
import com.store.demo.dto.Products_StoreDTO;
import com.store.demo.repository.Products_Repository;

@RestController
public class Products_controller {
	
	@Autowired
	Products_Repository products;
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	 public  List<Products_StoreDTO> mostrar(@RequestParam (value="identification")int identification,@RequestParam (value="direction")String direction){
       return products.buscarTodos() ;
   }
	 
	 public  List<FacturaDTO> price(@RequestParam (value="price1")int price1,@RequestParam (value="price2")int price2,@RequestParam (value="price3")int price3,@RequestParam (value="price4")int price4 ){
		  List<FacturaDTO> factura = new ArrayList<FacturaDTO>();
			if( (price1 + price2 + price3 + price4) > 70000 && (price1 + price2 + price3 + price4) <= 100000 ) {
				factura.add(new FacturaDTO (19,5000));
			} 
				if((price1 + price2) > 100000){
				factura.add(new FacturaDTO (19,0));
			}
			
			 return factura; 	    
		  }
}

