import entities.Joueur;
import entities.Partie;

public class Main {
    public static void main(String[] args) {
    	//Cr�ation partie
    	CompteurDeScoreTennis.creationPartie("Partie cr��e");
    	
    	//Affichage des joueurs
    	Joueur joueur1 = new Joueur("joueur1");
    	Joueur joueur2 = new Joueur("joueur2");
    	CompteurDeScoreTennis.choixJoueurs(joueur1.getNom(), joueur2.getNom());
    	
    	// Affichage des scores de d�but
    	
    }


}
