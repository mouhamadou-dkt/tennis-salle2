
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
		int result = Main.attribuerPoint(joueur);
		//Then
		assertEquals(15, result);
	}
	
	
}
