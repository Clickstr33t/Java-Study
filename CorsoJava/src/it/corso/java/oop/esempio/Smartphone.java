package it.corso.java.oop.esempio;

public class Smartphone {
	private String serialNumber;
	public String imei;
	private String marca;
	private String modello;
	private Display schermo;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getImei() {
		String tmp = imei.concat("---");
		return tmp;
	}
	public void setImei(String imeitmp) {
		if(imeitmp.length() < 20) {
			imeitmp.concat("sos94");
		}
		
		this.imei = imeitmp;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Display getSchermo() {
		return schermo;
	}
	public void setSchermo(Display schermo) {
		this.schermo = schermo;
	}
	
	
}
