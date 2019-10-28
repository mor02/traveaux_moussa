package com.theatre.vues;

import java.util.List;

import com.theatre.controllers.ShowControlleur;
import com.theatre.models.Show;

public class VueShowByCriteres {

	public static void main(String[] args) {
		
		//delaration de controlleur
		ShowControlleur showControlleur = new ShowControlleur();
		//tu appelles le controlleur
		List<Show> shows = showControlleur.getShowsByCriters("show1");
		
		for(Show showTemp:shows) {
			
			System.out.println(showTemp.toString());
		}

		
	}

}
