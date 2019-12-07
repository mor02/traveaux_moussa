package com.theatre.models;

public class Theatre {

	private String descrip;
	private int nbPlace;
	private String adresse;
	private String numTel;
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public Theatre(String descrip, int nbPlace, String adresse, String numTel) {
		super();
		this.descrip = descrip;
		this.nbPlace = nbPlace;
		this.adresse = adresse;
		this.numTel = numTel;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Description : " + this.descrip +" Nombre de place : " + this.nbPlace + " Adresse : " + this.adresse;
	}
	
	
}
