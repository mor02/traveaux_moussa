package com.banques.interfaces;

import com.banque.comptes.Compte;

public interface ICompteCourant {

	public boolean virer(double montant,Compte compte);
}
