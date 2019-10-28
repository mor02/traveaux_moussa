package com.theatre.vues;

import java.util.List;

import com.theatre.controllers.ShowControlleur;
import com.theatre.models.Show;
import com.theatre.models.Theatre;

public class VueShow {

	public static void main(String[] args) {
		
		//delaration de controlleur
		ShowControlleur showControlleur = new ShowControlleur();
		//tu appelles le controlleur
		List<Show> shows = showControlleur.getShows();
		
		for(Show showTemp:shows) {
			
			System.out.println(showTemp.toString());
		}

		//Affihage des theatres
		
		List<Theatre> maListeThatre = showControlleur.getTheatres();
		for(Theatre t:maListeThatre) {
			System.out.println(t.toString());
		}
	}

}
