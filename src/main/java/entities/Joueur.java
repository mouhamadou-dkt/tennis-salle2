package entities;

public class Joueur {

	private String nom;
	private String scorePoint;
	private int scorePointDecisif;
	private int scoreJeu;
	private int scoreSet;

	public Joueur() {
		this.scorePoint = "0";
		this.scorePointDecisif = 0;
		this.scoreJeu = 0;
		this.scoreSet = 0;
	}
	
	public Joueur(String nom) {
		this.nom = nom;
		this.scorePoint = "0";
		this.scorePointDecisif = 0;
		this.scoreJeu = 0;
		this.scoreSet = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(String scorePoint) {
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

	public int getScorePointDecisif() {
		return scorePointDecisif;
	}

	public void setScorePointDecisif(int scorePointDecisif) {
		this.scorePointDecisif = scorePointDecisif;
	}
	
}
