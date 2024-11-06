package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		//TODO a completer
		
		
		if (!controlLibererEtal.isVendeur(nomVendeur)) {
			System.out.println("Mais vous n'tes pas inscrit sur notre marché aujourd'hui");
			
		}
		else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			
			if (donneesEtal != null) {
				if (donneesEtal[0].equals(String.valueOf(true))) {
					System.out.println("Vous avez vendu " + donneesEtal[2] + " sur "  + donneesEtal[3] + " " +  donneesEtal[4]);
					
					System.out.println("Au revoir " + nomVendeur + ", passez une bonne journée" ) ;
					
				}
			} 
			
		}
		
	}

}
