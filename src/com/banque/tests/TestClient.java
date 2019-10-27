package com.banque.tests;

import java.util.ArrayList;
import java.util.List;

import com.banque.comptes.Client;
import com.banque.comptes.Compte;
import com.banque.comptes.CompteCourant;

public class TestClient {

	public static void main(String[] args) {
		
		//Création d'une liste vide
		List<Compte> listeCompteC1 = new ArrayList<Compte>();
		
		//Création de deux comptes
		Compte cp1 = new CompteCourant();
		cp1.setNumero("0004500001");
		cp1.setMontant(3000.00);
		Compte cp2 = new CompteCourant();
		cp2.setNumero("0004500002");
		cp2.setMontant(5000.00);
		
		//Ajout des compte dans la liste
		listeCompteC1.add(cp1);
		listeCompteC1.add(cp2);
		
		//Création d'un client AMGHAR AMine avec la liste allimentée précedement
		Client c1 = new Client("AMGHAR", "Amine", listeCompteC1);
		
		
		
		List<Compte> listeCompteC2 = new ArrayList<Compte>();
		
		Compte cp3 = new CompteCourant();
		cp3.setNumero("0004500003");
		cp3.setMontant(3000.00);
		Compte cp4 = new CompteCourant();
		cp4.setNumero("0004500004");
		cp4.setMontant(5000.00);
		
		//Ajout des compte dans la liste
//		listeCompteC2.add(cp3);
//		listeCompteC2.add(cp4);
		Client c2 = new Client("Jadir", "Moussa", listeCompteC2);

		//Affichage
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//Double patrimoinTemp = c2.calculerPatrimoin();
//		if(patrimoinTemp!=null) {
//			System.out.println("Patrimoin : " + patrimoinTemp);
//		}else {
//			System.out.println("Pas de patrimoin pour ce client - Pas de compte");
//		}
		
	}

}
