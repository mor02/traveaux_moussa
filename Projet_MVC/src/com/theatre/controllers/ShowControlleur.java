package com.theatre.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.theatre.models.Show;
import com.theatre.models.Theatre;

public class ShowControlleur {

	List<Theatre> listeTheatres = new ArrayList<Theatre>();
	List<Show> shows = new ArrayList<Show>();
	//CRUD
	public List<Show> getShows(){
		
		//BDD
		shows.add(new Show("show1", new Date()));
		shows.add(new Show("show2", new Date()));
		return shows;
		
	}
	
	public Show getShow() {

		// BDD
		Show show = new Show("show1", new Date());
		return show;

	}

	public List<Show> getShowsByCriters(String description) {

		// BDD
		//TODO appel avec le filtre description
		shows.add(new Show("show1", new Date()));
		shows.add(new Show("show2", new Date()));
		return shows;

	}

	public List<Theatre> getTheatres(){
		
		
		//Appelles à la bdd pour les theatres
		Theatre t1 = new Theatre("theatre1", 1000, "Paris", "055555555");
		Theatre t2 = new Theatre("theatre2", 1000, "Nantes", "055555555");
		Theatre t3 = new Theatre("theatre3", 1000, "Nice", "055555555");
		Theatre t4 = new Theatre("theatre4", 1000, "Rennes", "055555555");
		
		listeTheatres.add(t1);
		listeTheatres.add(t2);
		listeTheatres.add(t3);
		listeTheatres.add(t4);
		
		return listeTheatres;
		
	}
}
