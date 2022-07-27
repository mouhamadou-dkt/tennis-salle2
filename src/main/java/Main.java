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

	public static String afficheScorePoint(int scorePointJoueur1, int scorePointJoueur2) {
		
		return scorePointJoueur1 + " - " + scorePointJoueur2;
	}

	public static String afficheScoreJeu(int scoreJeuJoueur1, int scoreJeuJoueur2) {
		
		return scoreJeuJoueur1 + " - " + scoreJeuJoueur2;

	}

	public static String afficheScoreSet(int scoreSetJoueur1, int scoreSetJoueur2) {
		return scoreSetJoueur1 + " - " + scoreSetJoueur2;
	}

	public static int attribuerPoint(Joueur joueur) {
		joueur.setScorePoint(15);
		return joueur.getScorePoint();
	}
	
}
