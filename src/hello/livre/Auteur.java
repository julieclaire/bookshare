/**
 * 
 */
package hello.livre;

import java.util.Date;

/**
 * @author Dell
 *
 */
public class Auteur {
	private String nom;
	
	private String prenom;
	
	private Date naissance;
	
	private Auteur (String nom,String prenom,Date naissance) {
			this.nom=nom;
			this.prenom=prenom;
			this.naissance=naissance;
	} // ici exemple d'un auteur privé!
	
	public static Auteur getAuthor(String nom, String prenom, Date naissance) {// rendre la méthode static!c'est assimilable à une fonction
			Date today=new Date ();					// Pattern : class factory, static
			if (naissance.after(today)) {
				return null;
			}
			Auteur author=new Auteur (nom, prenom, naissance);
			return author;
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

public Date getNaissance() {
	return naissance;
}

public void setNaissance(Date naissance) {
	this.naissance = naissance;
}
public String nom () {
return this.nom;
}
public String prenom () {
	return this.prenom;
}

public Date naissance () {
	return this.naissance;
}}

