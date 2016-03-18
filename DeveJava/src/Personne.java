
public class Personne {
String nom;
String prenom;
int identifiant;


public Personne(String prenom, String nom) {
this.prenom=prenom;
this.nom=nom;
this.identifiant=hashCode();
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(int identifiant) {
	this.identifiant = identifiant;
}


}
