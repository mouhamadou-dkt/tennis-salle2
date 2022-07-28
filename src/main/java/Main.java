import entities.Joueur;
import entities.Partie;

public class Main {
    public static void main(String[] args) {
    	//Création partie
    	creationPartie("Partie créée");
    	
    	//Affichage des joueurs
    	Joueur joueur1 = new Joueur("joueur1");
    	Joueur joueur2 = new Joueur("joueur2");
    	choixJoueurs(joueur1.getNom(), joueur2.getNom());
    	
    	// Affichage des scores de début
    	
    }

	public static String creationPartie(String nom) {
		Partie partie = new Partie(nom);
		return partie.getNom();
	}

	public static String choixJoueurs(String joueur1, String joueur2) {
		return joueur1 + " - " + joueur2;
	}

	public static String afficheScorePoint(String scorePointJoueur1, String scorePointJoueur2) {
		
		return scorePointJoueur1 + " - " + scorePointJoueur2;
	}

	public static String afficheScoreJeu(int scoreJeuJoueur1, int scoreJeuJoueur2) {
		
		return scoreJeuJoueur1 + " - " + scoreJeuJoueur2;

	}

	public static String afficheScoreSet(int scoreSetJoueur1, int scoreSetJoueur2) {
		return scoreSetJoueur1 + " - " + scoreSetJoueur2;
	}
	
	public static String afficheScoreJeuDecisif(int scorePointDecisifJoueur1, int scorePointDecisifJoueur2) {
		return scorePointDecisifJoueur1 + " - " + scorePointDecisifJoueur2;
	}

	public static void attribuerPoint(Joueur joueurGagnant, Joueur joueurPerdant, Partie partie) {
		String scorePointJoueurGagnant = joueurGagnant.getScorePoint();
		String scorePointJoueurPerdant = joueurPerdant.getScorePoint();
		
		// Mode jeu classique
		if (!partie.isModeDecisif()) {
			switch (scorePointJoueurGagnant) {
			case "0":
				joueurGagnant.setScorePoint("15");
				break;
			
			case "15":
				joueurGagnant.setScorePoint("30");
				break;
			
			case "30":
				joueurGagnant.setScorePoint("40");
				break;
				
			case "40":
				if (scorePointJoueurPerdant == "40") {
					joueurGagnant.setScorePoint("A");
				}
				else if (scorePointJoueurPerdant == "A") {				
						joueurPerdant.setScorePoint("40");
				}
				else {
					// Attribution jeu au joueur gagnant
					int jeu = joueurGagnant.getScoreJeu(); // 5
					jeu++;
					joueurGagnant.setScoreJeu(jeu); // 6
					
					// Attribution set au joueur gagnant et reset des scores jeu
					if ((joueurGagnant.getScoreJeu() == 6 && joueurPerdant.getScoreJeu() <= 4) 
							|| (joueurGagnant.getScoreJeu() == 7 && joueurPerdant.getScoreJeu() == 5)) {
						// Attribution set
						int set = joueurGagnant.getScoreSet();
						set ++;
						joueurGagnant.setScoreSet(set);
						
						// Reset des scores jeu
						joueurGagnant.setScoreJeu(0);
						joueurPerdant.setScoreJeu(0);
					}
					else if (joueurGagnant.getScoreJeu() == 6 && joueurPerdant.getScoreJeu() == 6) {
						partie.setModeDecisif(true);
					}
						
					// Reset des scores point
					joueurGagnant.setScorePoint("0");
					joueurPerdant.setScorePoint("0");
				}
				break;
				
			case "A":
				int jeu = joueurGagnant.getScoreJeu();
				jeu++;
				joueurGagnant.setScoreJeu(jeu);
			}
		}
		
		//Mode jeu décisif
		else {
			int pointDecisif = joueurGagnant.getScorePointDecisif();
			if (pointDecisif < 7) {
				pointDecisif ++;
				joueurGagnant.setScorePointDecisif(pointDecisif);				
			}

		}
	}
	
}
