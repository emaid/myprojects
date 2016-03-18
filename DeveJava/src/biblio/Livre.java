package biblio;

import java.util.Arrays;

public class Livre {
	// Titre;Auteur
	protected String[] livre = new String[2];

	public String[] getLivre() {
		return livre;
	}

	public Livre(String[] livre) {

		this.livre = livre;
	}

	public Livre(String titre, String auteur) {
		this.livre[0] = titre;
		this.livre[1] = auteur;
	}

	public void setLivre(String[] livre) {
		this.livre = livre;
	}

	boolean equals(String[] li) {

		if (Arrays.equals(this.livre, li)) {
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuffer b = new StringBuffer();
		String[] l = this.getLivre();
		for (int i = 0; i < l.length; i++) {
			b.append(l[i] + " ");
		}

		return new String("Livre : " + b);
	}

}
