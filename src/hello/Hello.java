/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthDateException;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws BirthDateException 
	 */
	public static void main(String[] args) throws ParseException, BirthDateException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Java");
		
		Utilisateur moi = new Loueur();
		moi.setNom("lo");
		moi.setPrenom("julie");
		moi.setNumAdherent("012345");
		
		System.out.println("Utilisateur:" + moi.getNom());
		
		//second utilisateur
		
		Utilisateur lui= new Loueur ("Lu","Jeanne","0246");

		System.out.println("My name is:" + lui.getNom());
		
		//autre
		
		Utilisateur alien = new Loueur();
		alien
		.nom("ET")
		.prenom("mljlkfj")
		.numAdherent("1234");
		
		((Loueur)alien).nbLivres(15); //RECAST alien comme étant un loueur d'où Loueur entre PARENTHESES
		
		System.out.println("Retour maison:"+alien.nom());
		
		// CLoner un loueur pour en faire un emprunteur
		Utilisateur emprnuteurAlien=alien.clone();
		Auteur emprunteurAlien = null;
		System.out.println("Emprunteur"+emprunteurAlien.getNom()+":");
		
		// Création d'un bouquin
		
		Livre lesMiserables=new Livre ();
		lesMiserables.setTitre ("lesMiserables")// CHAINAGE DE METHODES donc on doit se reporter à Livre et pas à un void et ne pas oublier le retunr this!
			.setResume("blahblah")
			.setNbPages(1200);
		
		Livre fondation=new Livre ("fondation","bibabop", 350);
		
		System.out.println("fondation:"+fondation.getNbPages());
		
		//Author?
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date=format.parse ("1802-01-12");
		Auteur Hugo= Auteur.getAuthor ("Hugo", "Victor", date);// on a rendu la methode STATIC, donc ca marche!
		if (Hugo==null) {
			System.out.println("impposible d'instancier hugo");
		}else
		System.out.println ("Author="+ Hugo.getNom());
	}

}
