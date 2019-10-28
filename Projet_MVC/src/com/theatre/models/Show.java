package com.theatre.models;

import java.util.Date;

public class Show {
	
	private String nomShow;
	private Date dateShow;
	
	
	public Show(String nomShow, Date dateShow) {
		super();
		this.nomShow = nomShow;
		this.dateShow = dateShow;
	}
	public String getNomShow() {
		return nomShow;
	}
	public void setNomShow(String nomShow) {
		this.nomShow = nomShow;
	}
	public Date getDateShow() {
		return dateShow;
	}
	public void setDateShow(Date dateShow) {
		this.dateShow = dateShow;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nom show : " + this.nomShow + " Date : " + this.dateShow;
	}
	
	

}
