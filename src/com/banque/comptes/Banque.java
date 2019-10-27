package com.banque.comptes;

public class Banque {

	private String nom;
	
	private Compte[] comptesBanque = new Compte[100];
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}

	public Compte[] getComptesBanque() {
		return comptesBanque;
	}



	public void setComptesBanque(Compte[] comptesBanque) {
		this.comptesBanque = comptesBanque;
	}



	@Override
	public String toString() {

		String affichage = "Banque : " + this.nom + "\n";
		for (Compte c : comptesBanque) {
			affichage = affichage + c.toString() +"\n";
		}
		return affichage;

	}
}
