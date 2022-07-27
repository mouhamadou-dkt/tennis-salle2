import entities.Partie;

public class Main {
    public static void main(String[] args) {

    }

	public static String creationPartie(String nom) {
		Partie partie = new Partie(nom);
		return partie.getNom();
	}
}
