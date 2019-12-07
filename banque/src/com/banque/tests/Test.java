package com.banque.tests;

import java.util.ArrayList;
import java.util.List;

import com.banque.comptes.Compte;
import com.banque.comptes.CompteCourant;

public class Test {

	public static void main(String[] args) {
		Compte cp1 = new CompteCourant();
		cp1.setNumero("0004500003");
		cp1.setMontant(3000.00);
		
		
		Compte cp2 = new CompteCourant();
		cp2.setNumero("0004500004");
		cp2.setMontant(5000.00);
		
		
		Compte cp3 = new CompteCourant();
		cp3.setNumero("0004500005");
		cp3.setMontant(6000.00);
		
		//déclaration d'une liste
		List<Compte> listeComptes=new ArrayList<Compte>();
		
		//Rajouter des elements dans une liste
		if(listeComptes !=null) {
			listeComptes.add(cp1); //null.add()  ---> nullPointerException
			listeComptes.add(cp2);
			listeComptes.add(2, cp3);
			System.out.println("La taille actuelle de la liste : " + listeComptes.size());
		}
		
		//récupération d'un element d'une liste grace à l'index
		System.out.println("DEBUT - Affihage par index");
		System.out.println(listeComptes.get(0).toString());
		System.out.println(listeComptes.get(1).toString());
		System.out.println(listeComptes.get(2).toString());
		//System.out.println(listeComptes.get(3).toString());
		System.out.println("FIN - Affihage par index");
		
		//suppression des elements d'une liste
		System.out.println("DEBUT - des opérations remove");
				List<Compte> listeCompteMaroc=new ArrayList<Compte>();
				listeCompteMaroc.add(cp2);
				listeCompteMaroc.add(cp3);
				//listeComptes.remove(0);
				//listeComptes.remove(cp2);
				listeComptes.removeAll(listeCompteMaroc);
		System.out.println("FIN - des opérations remove");
		
		//Parcourir une liste*
		System.out.println("DEBUT - Affihage par boucle");
		for(Compte cTemp:listeComptes) {
			System.out.println(cTemp.toString());
		}
		System.out.println("FIN - Affihage par boucle");
		
		

		
//		List<Integer> listeInteger;
//		
//		listeInteger.
		
		
		//La déclaration et l'instanciation d'un tableau
//		Compte[] allComptes = new Compte[3];// on initialise 10 cases nulls
//		Compte[] allComptesParis = {cp1,cp2,cp3};// tableaux de 2 cases.
//		
//		//L'affectation 
//		allComptes[0]= cp1;
//		allComptes[1]= cp2;
//		allComptes[2]= cp3;
//	
//		
//		Banque b1 = new Banque();
//		b1.setNom("BNP Paribas");
//		b1.setComptesBanque(allComptes);
//		System.out.println(b1.toString());
		
		
		
		
		
//		for(int i=0 ; i<=2 ; i++) {
//			System.out.println("i : " + i);
//			System.out.println(allComptes[i].toString());;
//		}
//		
//		for(Compte ctpTemp : allComptes) {
//			if(ctpTemp!=null) {
//				System.out.println(ctpTemp.toString());
//			}
//			
//		}
		
//		for(Compte cTmp : allComptesParis) {
//			System.out.println(cTmp.toString());
//		}
		
		
		
	}

}
