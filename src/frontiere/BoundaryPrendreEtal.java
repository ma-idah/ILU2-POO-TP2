package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (controlPrendreEtal.verifierIdentite(nomVendeur) == false){
			System.out.println("Je suis désolée " + nomVendeur + "mais il faut etre un habitant de notre village pour commercer ici.");
		}
		
		else {
			System.out.println("Bonjour " + nomVendeur + " je vais regarder si je peux trouver un etal." );
			if (controlPrendreEtal.resteEtals() != true) {
				System.out.println("Je suis désolée " + nomVendeur + "je n'ai plus d'etal qui ne soit pas occupé.");
				
			}
			else {
				installerVendeur(nomVendeur);
				
	
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		System.out.println("C'est parfait, il me reste un etal pour vous ! ");
		System.out.println("Il me faudrait quelques renseignements: ");
		//StringBuilder question = new StringBuilder();
		String question1 = "Quel produit souhaitez vous vendre? \n";
		String question2 = "combien souhaitez vous en vendre? \n";
		String produit = null;
		int numeroEtal;
		int nbProduit ;
		produit = Clavier.entrerChaine(question1);
		nbProduit = Clavier.entrerEntier(question2.toString());
		numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal != -1) {
			System.out.println("Le vendeur " + nomVendeur + " s'est installé a l'etal n° " + numeroEtal);
		}
		
		
	}
}
