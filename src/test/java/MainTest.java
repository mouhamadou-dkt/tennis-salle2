
import org.junit.jupiter.api.Test;

import entities.Joueur;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

	@Test
	public void creerPartie_ReturnPartieCree() {
		// Given 
		
		// When
		String result =  Main.creationPartie("Partie créée");
		// Then 
		assertEquals("Partie créée", result);
	}
	
	@Test
	public void choixJoueurs_ReturnNomsJoueurs() {
		//Given
		String joueur1 = "player1";
		String joueur2 = "player2";
		//When
		String result = Main.choixJoueurs(joueur1, joueur2);
		//Then
		assertEquals("player1 - player2", result);
	}
	
	@Test
	public void afficheScorePointDebut() {
		int scorePointJoueur1 = 0;
		int scorePointJoueur2 = 0;
		//When
		String result = Main.afficheScorePoint(scorePointJoueur1, scorePointJoueur2);
		//Then
		assertEquals("0 - 0", result);
	}
	
	@Test
	public void afficheScoreJeuDebut() {
		int scoreJeuJoueur1 = 0;
		int scoreJeuJoueur2 = 0;
		//When
		String result = Main.afficheScoreJeu(scoreJeuJoueur1, scoreJeuJoueur2);
		//Then
		assertEquals("0 - 0", result);
	}
	
	@Test
	public void afficheScoreSetDebut() {
		//Given
		int scoreSetJoueur1 = 0;
		int scoreSetJoueur2 = 0;
		//When
		String result = Main.afficheScoreSet(scoreSetJoueur1, scoreSetJoueur2);
		//Then
		assertEquals("0 - 0", result);
	}
	
	// L'utilisateur peut notifier qu'un Joueur a gagné un point.
	@Test
	public void attribuerPointJoueur_Return15() {
		Joueur joueur = new Joueur("joueur1"); 
		//
		String result = Main.attribuerPoint(joueur);
		//Then
		assertEquals("15", result);
	}
	
	//Quand un joueur gagne un point, il passe de 0 à 15. Puis de 15 à 30. Puis de 30 à 40.
	@Test
	public void attribuerPointJoueur_Return30() {
		//Given
		Joueur joueur = new Joueur("joueur1"); 
		joueur.setScorePoint("15");
		//When
		String result = Main.attribuerPoint(joueur);
		//Then
		assertEquals("30", result);
	}
	
	@Test
	public void attribuerPointJoueur_Return40() {
		//Given
		Joueur joueur = new Joueur("joueur1"); 
		joueur.setScorePoint("30");
		//When
		String result = Main.attribuerPoint(joueur);
		//Then
		assertEquals("40", result);
	}
	
	//Si les deux joueurs sont a egalité a 40 points, si aucun joueur a un avantage, le joueur qui gagne le point gagne un avantage.
	@Test
	public void attribuerPointJoueur_ReturnAvantage() {
		//Given
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		joueur1.setScorePoint("40");
		joueur2.setScorePoint("40");
		
		//When
		String result = Main.attribuerPoint(joueur1, joueur2);
		
		//Then
		assertEquals("A", result);
		
	}
	
	//Si les deux joueurs sont a egalité a 40 points, si le perdant a un avantage, alors il le perd. 
	@Test
	public void attribuerPointJoueurPerdant_Return40AprèsAvantage() {
		//Given
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		joueur1.setScorePoint("40");
		joueur2.setScorePoint("A");
		
		//When
		System.out.println(joueur2.getScorePoint());
		String result = Main.attribuerPoint(joueur1, joueur2);
		System.out.println(joueur2.getScorePoint());
		
		String result2 =  joueur2.getScorePoint();
		
		//Then
		assertEquals("40", result);
		assertEquals("40", result2);
		
	}
	
	//Si les deux joueurs sont a egalité a 40 points, si le gagnant a un avantage, alors il gagne le jeu.
}
