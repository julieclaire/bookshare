/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.BirthDateException;

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
	
	
	
	public static Auteur getAuthor(String nom, String prenom, Date naissance) throws BirthDateException {// rendre la méthode static!c'est assimilable à une fonction
			Date today=new Date ();					// Pattern : class factory, static
			if (naissance.after(today)) {
				throw new BirthDateException ();
			
			}
			Auteur author=new Auteur (nom, prenom, naissance);
			return author;
	}
	
	
	public static Auteur getAuthor() throws ParseException, BirthDateException {
		
			Scanner scanner=new Scanner(System.in);
	
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	
			System.out.println("Nom de l'auteur:");
			String nom= scanner.nextLine();
			scanner.nextLine();
	
			System.out.println("Prenom de l'auteur:");
			String prenom=scanner.nextLine();
			scanner.nextLine();
	
			System.out.println("Date de naissance:");
			String naissance=scanner.nextLine();
			Date dateNaissance= format.parse(naissance);
			scanner.nextLine();
	
	
	
	// on ne peut instancier le nouvel auteur à partir des informations, convert string en format date!
	
	return getAuthor(nom, prenom, dateNaissance);
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

