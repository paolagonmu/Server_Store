package com.store.demo.dto;

public class FacturaDTO {
	
	int  iva, domicilio;
	

	public FacturaDTO(int iva, int domicilio) {
		super();
		this.iva = iva;
		this.domicilio = domicilio;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(int domicilio) {
		this.domicilio = domicilio;
	}
	

}
