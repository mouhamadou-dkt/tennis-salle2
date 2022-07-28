
import org.junit.jupiter.api.Test;

import entities.Joueur;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

	@Test
	public void creerPartie_ReturnPartieCree() {
		// Given 
		
		// When
		String result =  Main.creationPartie("Partie cr��e");
		// Then 
		assertEquals("Partie cr��e", result);
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
		String scorePointJoueur1 = "0";
		String scorePointJoueur2 = "0";
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
	
	// L'utilisateur peut notifier qu'un Joueur a gagn� un point.
	@Test
	public void attribuerPointJoueur_Return15() {
		Joueur joueur1 = new Joueur("joueur1"); 
		Joueur joueur2 = new Joueur("joueur2");
		//When
		Main.attribuerPoint(joueur1);
		String result = Main.afficheScorePoint(joueur1.getScorePoint(), joueur2.getScorePoint());
		
		//Then
		assertEquals("15 - 0", result);
	}
	
	//Quand un joueur gagne un point, il passe de 0 �15. Puis de 15 � 30. Puis de 30 � 40.
	@Test
	public void attribuerPointJoueur_Return30() {
		//Given
		Joueur joueur1 = new Joueur("joueur1"); 
		joueur1.setScorePoint("15");
		Joueur joueur2 = new Joueur("joueur2");
		//When
		Main.attribuerPoint(joueur1);
		String result = Main.afficheScorePoint(joueur1.getScorePoint(), joueur2.getScorePoint());//Then
		assertEquals("30 - 0", result);
	}
	
	@Test
	public void attribuerPointJoueur_Return40() {
		//Given
		Joueur joueur1 = new Joueur("joueur1"); 
		joueur1.setScorePoint("30");
		Joueur joueur2 = new Joueur("joueur2");
		//When
		Main.attribuerPoint(joueur1);
		String result = Main.afficheScorePoint(joueur1.getScorePoint(), joueur2.getScorePoint());
		//Then
		assertEquals("40 - 0", result);
	}
	
	//Si les deux joueurs sont a egalit� a 40 points, si aucun joueur a un avantage, le joueur qui gagne le point gagne un avantage.
	@Test
	public void attribuerPointJoueur_ReturnAvantage() {
		//Given
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		joueur1.setScorePoint("40");
		joueur2.setScorePoint("40");
		
		//When
		Main.attribuerPoint(joueur1, joueur2);
		String result = Main.afficheScorePoint(joueur1.getScorePoint(), joueur2.getScorePoint());
		
		//Then
		assertEquals("A - 40", result);
		
	}
	
	//Si les deux joueurs sont a egalit� a 40 points, si le perdant a un avantage, alors il le perd. 
	@Test
	public void attribuerPointJoueurPerdant_Return40ApresAvantage() {
		//Given
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		joueur1.setScorePoint("40");
		joueur2.setScorePoint("A");
		
		//When
		//System.out.println(joueur2.getScorePoint()); 
		Main.attribuerPoint(joueur1, joueur2);
		String result = Main.afficheScorePoint(joueur1.getScorePoint(), joueur2.getScorePoint());
		
		//Then
		assertEquals("40 - 40", result);
		
	}
	
	//Si les deux joueurs sont a egalit� a 40 points, si le gagnant a un avantage, alors il gagne le jeu.
	@Test
	public void attribuerJeuJoueurGagnant_ReturnJeuApresAvantage() {
		//Given
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		joueur1.setScorePoint("A");
		joueur2.setScorePoint("40");
		
		//When
		//String result = Main.attribuerJeu(joueur1, joueur2);
		Main.attribuerPoint(joueur1, joueur2);
		String result = Main.afficheScoreJeu(joueur1.getScoreJeu(), joueur2.getScoreJeu());
		
		
		//Then
		assertEquals("1 - 0", result);
	}
	
	// Quand un jeu est gagn�, alors les deux joueurs retournent � 0 point.
	@Test
	public void resetPointApr�sJeu() {
		//Given
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		joueur1.setScorePoint("40");
		joueur2.setScorePoint("15");
		
		//When
		//String result = Main.attribuerJeu(joueur1, joueur2);
		Main.attribuerPoint(joueur1, joueur2);
		String result = Main.afficheScorePoint(joueur1.getScorePoint(), joueur2.getScorePoint());
		
		//Then
		assertEquals("0 - 0", result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
