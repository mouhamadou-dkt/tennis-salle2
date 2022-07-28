package entities;

public class Partie {

	private String nom;
	boolean isModeDecisif;
	boolean isPartieWin;


	public Partie(String nom) {
		this.nom = nom;
		this.isModeDecisif = false;
		this.isPartieWin = false;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isModeDecisif() {
		return isModeDecisif;
	}

	public void setModeDecisif(boolean isModeDecisif) {
		this.isModeDecisif = isModeDecisif;
	}

	public boolean isPartieWin() {
		return isPartieWin;
	}

	public void setPartieWin(boolean partieWin) {
		isPartieWin = partieWin;
	}
}
