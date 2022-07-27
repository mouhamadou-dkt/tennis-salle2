package entities;

public class Joueur {

	private String nom;
	private int scorePoint;
	private int scoreJeu;
	private int scoreSet;

	public Joueur() {
		this.scorePoint = 0;
		this.scoreJeu = 0;
		this.scoreSet = 0;
	}
	
	public Joueur(String nom) {
		this.nom = nom;
		this.scorePoint = 0;
		this.scoreJeu = 0;
		this.scoreSet = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}

	public int getScoreJeu() {
		return scoreJeu;
	}

	public void setScoreJeu(int scoreJeu) {
		this.scoreJeu = scoreJeu;
	}

	public int getScoreSet() {
		return scoreSet;
	}

	public void setScoreSet(int scoreSet) {
		this.scoreSet = scoreSet;
	}
	
}