package com.banque.comptes;

import com.banques.interfaces.ICompteCCEE;
import com.banques.interfaces.ICompteCourant;

public class CompteCourant extends Compte implements ICompteCourant,ICompteCCEE{

	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}
	
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/**
	 * 
	 * @param montant
	 * @return
	 */
//	public boolean retirer(double montant) {
//		//On vérifie que l'opération peut s'effectuer sur le montant actuel
//		if(this.getMontant() +this.decouvert >= montant ) {
//			this.setMontant(this.getMontant()-montant);
//			//Positionner le découvert
//			if(this.getMontant()<montant) {
//				this.setMontant(0.0);
//				this.decouvert = this.decouvert- (this.getMontant() - montant);
//			}
//			return true;
//		}else {
//			return false;
//		}
//		
//		
//	}
	/**
	 * 
	 * @param montant
	 * @param compte
	 * @return
	 */
//	public boolean verser(double montant, Compte compte) {
//		compte.verser(montant);
//		return true;
//
//	}

	@Override
	//Cas : solde 1000e + decouvert : 500 , on retire 1200
	public boolean retirer(double montant) {
		//Le solde suffisant
		if(this.getMontant()>montant) {
			double newMontant = this.getMontant() - montant;
			this.setMontant(newMontant);
			return true;
		//Le solde + decouvert suffisant
		}else if(this.getMontant()+this.decouvert>montant) {
			this.setMontant(this.getMontant()-montant);
			this.setDecouvert(this.decouvert-this.getMontant());
			return true;
		//Pas suffisament de fonds
		}else {
			return false;
		}

	}

	@Override
	public boolean virer(double montant, Compte compte) {
		// TODO Auto-generated method stub
		return false;
	}



	
}
