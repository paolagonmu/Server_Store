package com.store.demo.dto;

public class ClientDto {

	int identification_client;
	String name_client, direction_client;
	
	
	
	public ClientDto(int identification_client, String name_client, String direction_client) {
		super();
		this.identification_client = identification_client;
		this.name_client = name_client;
		this.direction_client = direction_client;
	}
	
	public int getIdentification_client() {
		return identification_client;
	}
	public void setIdentification_client(int identification_client) {
		this.identification_client = identification_client;
	}
	public String getName_client() {
		return name_client;
	}
	public void setName_client(String name_client) {
		this.name_client = name_client;
	}
	public String getDirection_client() {
		return direction_client;
	}
	public void setDirection_client(String direction_client) {
		this.direction_client = direction_client;
	}
	
	
}
