package biblio;

import java.util.Iterator;
import java.util.Vector;

public class Etagere {
Vector etag= new Vector();
	
public Etagere(Vector etag) {
		this.etag = etag;
	}

public Etagere() {
	this.etag = new Vector();
}


public Vector getEtag() {
		return etag;
	}
	public void setEtag(Vector etag) {
		this.etag = etag;
	}
	
	
	
public void ajouterLivre(String[] livre){etag.add(livre);}; 

public void retirerLivre(String auteur,String titre){
	String []li=recupereLivre(auteur,titre);
	if(li!=null){getEtag().remove(li);};
};


public boolean disponibilite(String auteur,String titre){
	if(recupereLivre(auteur,titre)!=null){return true;};
	return false;}


private String[] recupereLivre(String auteur,String titre){
Vector etagere=getEtag();
etagere.iterator();
for (Iterator it = etagere.iterator(); it.hasNext();) {
	 String[] li = (String[]) it.next();
	if (li[0].equals(titre) && li[1].equals(auteur)){return li;}
}
return null;

}


//Est ce récupérer le nom et l'auteur ou est ce l'enlever de l'etagère?
//Est ce le récupérer parce qu'il a été prété?
public String[] recupereLivre(int position){
	return (String[])getEtag().elementAt(position);
	
}

//Nombre de livre par étagère
public int nbDeLivre(){return getEtag().size();}


public String toString(){return getEtag().toString();}

public void ajouterLivre(Livre livre) {
	etag.add(livre);
	
}

}



