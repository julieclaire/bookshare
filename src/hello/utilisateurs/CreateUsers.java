/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
	}
	
	
	
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



