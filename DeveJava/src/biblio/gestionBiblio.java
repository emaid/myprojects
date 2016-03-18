package biblio;

import java.lang.reflect.Array;

public class gestionBiblio {
	 public static void main(String[] args) {
		 
		 Livre l1= new Livre("Madame Bovary","Flaubert");
		 Livre l2 = new Livre("L'écume des jours","Boris Vian");  
		 Livre l3=  new Livre("Madame Bovary","Flaubert");
		 boolean v= l1.equals(l2);
		 System.out.println( l1.toString()+" égale "+l2.toString()+" "+v);
		 boolean v2= l1.equals(l3);
		 System.out.println(l1.toString()+" égale "+l3.toString()+" "+v2);
	
		Etagere etage= new Etagere();
		etage.ajouterLivre(l1);
		etage.ajouterLivre(l2);
		System.out.println("Disponibilité : "+etage.disponibilite("Madame Bovary", "Flaubert"));
	}
}
