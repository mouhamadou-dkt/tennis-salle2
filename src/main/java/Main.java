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

	public static void attribuerPoint(Joueur joueurGagnant, Joueur joueurPerdant) {
		String scorePointJoueurGagnant = joueurGagnant.getScorePoint();
		String scorePointJoueurPerdant = joueurPerdant.getScorePoint();
				
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
				int jeu = joueurGagnant.getScoreJeu();
				jeu++;
				joueurGagnant.setScoreJeu(jeu);
				
				// Attribution set au joueur gagnant
				if (joueurGagnant.getScoreJeu() == 6 && joueurPerdant.getScoreJeu() <= 4) {
					int set = joueurGagnant.getScoreSet();
					set ++;
					joueurGagnant.setScoreSet(set);
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
	
}
