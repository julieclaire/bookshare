/**
 * 
 */
package hello.utilisateurs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthDateException;
import hello.tools.AuteurImport;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws BirthDateException 
	 */
	public static void main(String[] args) throws ParseException, BirthDateException {
		// TODO Auto-generated method stub
		Utilisateur loueur=CreateUsers.createLoueur ();
		Utilisateur emprunteur=CreateUsers.createEmprunteur ();
		Utilisateur emprunteurLoueur= createEmprunteurLoueur ();
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom ()+" est un loueur");
			}
		if(emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom ()+" est un loueur");
			}else {
			System.out.println(emprunteur.nom() +" n'est pas un loueur");
			}
		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(loueur.nom ()+" est loueur et emprunteur");
		}
		
		
	// Creer un livre
		
		
		Livre livre=new Livre();
		livre.setTitre("lesMiserables")
			 .setResume("blahblah")
			 .setNbPages(520);
		((Loueur)loueur)
			.addBook(livre);
		((Loueur)loueur)
			.addBook(livre);
		System.out.println(((Loueur)loueur).listBooks());
		
		
		//Creation d'un auteur
		//Use case 1: a la main
		
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=format.parse ("1802-01-12");
		Auteur Hugo= Auteur.getAuthor ("Hugo", "Victor", date);
		
		
		// Use case 2: par la ligne de commande
		/*
		try {
			Auteur asimov = Auteur.getAuthor();
			System.out.println (asimov.getNom());
		} catch (ParseException parseException) {
			System.out.println("la date de naissance est incorrecte");
			System.out.println (parseException.getMessage());
		} catch (BirthDateException naissance) {
		System.out.println (naissance.getmessage());
		
		}
		*/
		
		//Auteur asimov= Auteur.getAuthor();
		
		//Creer les auteurs à partir d'un fichier délimité
		AuteurImport auteurs=new AuteurImport();
		
		//Récupérer la liste des auteurs
		
		//Boucler sur la liste des auteurs
		
		/**for (String[] unAuteur: auteurs.getAuteurs()) {
			try {
				SimpleDateFormat leFormat=new SimpleDateFormat("yyyy-MM-dd");
				Date laDate=format.parse(unAuteur[2]);
				ListeAuteurs.add(Auteur.getAuthor(unAuteur[0],unAuteur[1], laDate));
			
			}catch (Exception e) {
			

	}*/
	
	
	private static Utilisateur createLoueur() {
		return new Loueur ()
				.nom("Lo")
				.prenom("Julie")
				.numAdherent("1234");
					
	}
	private static Utilisateur createEmprunteur () {
		return new Emprunteur ()
				.nom("Lu")
				.prenom("Jeanne")
				.numAdherent ("2468");
	
		
	}
	private static Utilisateur createEmprunteurLoueur () {
		return new EmprunteurLoueur ()
				.nom("Toto")
				.prenom("Henry")
				.numAdherent("1357");
		
		
	}
	
	
	
	
}



