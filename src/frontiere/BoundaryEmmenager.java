package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					
					emmenagerGaulois(nomVisiteur);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		//TODO a completer
		StringBuilder q2= new StringBuilder();
		q2.append("Quelle est votre force ?");
		int force = -1;
		force= Clavier.entrerEntier(q2.toString());
		
		StringBuilder q3= new StringBuilder();
		q3.append("Quelle estla force de potion la plus faible que vous produisez ?");
		int forceMin = -1;
		forceMin= Clavier.entrerEntier(q3.toString());
		
		StringBuilder q4= new StringBuilder();
		q4.append("Quelle estla force de potion la plus faible que vous produisez ?");
		int forceMax = -1;
		forceMax= Clavier.entrerEntier(q4.toString());
		
		controlEmmenager.ajouterDruide(nomVisiteur, force, forceMin, forceMax);
	}
	
	private void emmenagerGaulois(String nomVisiteur) {
		StringBuilder q1= new StringBuilder();
		q1.append("Quelle est votre force ?");
		int force = -1;
		force= Clavier.entrerEntier(q1.toString());
		controlEmmenager.ajouterGaulois(nomVisiteur, force);
		System.out.println("Bonjour, je suis le gaulois " + nomVisiteur + "et j'ai une force de :" + force);
		
	}
}
