package com.banque.comptes;

import java.util.List;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Client{

	private String nom;
	private String prenom;
	private List<Compte> listeCompteClient;
	
	public Client(String nom, String prenom, List<Compte> listeCompteClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeCompteClient = listeCompteClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Compte> getListeCompteClient() {
		return listeCompteClient;
	}

	public void setListeCompteClient(List<Compte> listeCompteClient) {
		this.listeCompteClient = listeCompteClient;
	}
	
	@Override
	public String toString() {
		String affichage= "Client : " + this.nom + " " + this.prenom + "\n";
		affichage = affichage + "Les comptes : \n";
		for(Compte cTemp : this.listeCompteClient) {
				affichage = affichage + cTemp.toString() + "\n";
		}
		affichage = affichage + "Patrimoin Client : " + (this.calculerPatrimoin()!=null?String.valueOf(this.calculerPatrimoin()):"Pas de patrimon");
//		affichage = affichage + "Patrimoin Client : ";
//		Double patrimoinTemp = this.calculerPatrimoin();
//		if(patrimoinTemp!=null) {
//			affichage = affichage + String.valueOf(patrimoinTemp);
//		}else {
//			affichage = affichage + "Pas de patrimoin";
//		}
		return affichage;
	}
	
	public Double calculerPatrimoin() {
		Double patrimoinClient=0.0;
		if(this.listeCompteClient ==null || this.listeCompteClient.isEmpty()) {
			patrimoinClient = null;
		}
		for(Compte cTemp:this.listeCompteClient) {
			patrimoinClient +=  cTemp.getMontant();
		}
		return patrimoinClient;
	}
	
}
