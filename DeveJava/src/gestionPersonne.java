import java.io.Console;
import java.util.Scanner;


public class gestionPersonne {

	Personne []tabpersonne;
	
	public static void main(String[] args) {

		gestionPersonne gp= new gestionPersonne();
		gp.tabpersonne=gp.instanciatePersonne();
		Personne pe=gp.readPersonneConsole();
		gp.addPersonne(pe);
		gp.displayTabPersonne(gp.tabpersonne);
	}
	
private	Personne[] instanciatePersonne(){
		Personne  [] tab = new Personne[3];
		tab[0]= new Personne("Sylvie","Fraud");
		tab[1]= new Personne("Julien","Chaplin");
		tab[2]= new Personne("Jules","Zepline");
		return tab;
	}
	
public void addPersonne(Personne p){
		int nouvsize=tabpersonne.length+1;
		Personne[]newtabpersonne=new Personne[nouvsize];
		
		for(int i=0 ;i<this.tabpersonne.length;i++){
			newtabpersonne[i]= this.tabpersonne[i];
		}
		newtabpersonne[tabpersonne.length]=p;
		this.tabpersonne=newtabpersonne;
		}
	
private void displayTabPersonne(Personne[] tab){
	for(int i=0 ;i<tab.length;i++){
		Personne p=tab[i];
	System.out.println("ID : "+p.getIdentifiant()+"\tPRENOM : "+p.getPrenom()+"\tNOM: "+p.getNom());
	}}

private Personne readPersonneConsole(){
System.out.println("Merci d'indiquer le prénom et le nom d'une personne :");
String per = null;

	Scanner scan= new Scanner(System.in);
	per=scan.nextLine();
	scan.close();
	String [] p=per.split(" ");
	return new Personne(p[0],p[1]);
}

}
