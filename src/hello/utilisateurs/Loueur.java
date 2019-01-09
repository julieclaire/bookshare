/**
 * 
 */
package hello.utilisateurs;
import java.util.ArrayList;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur implements LoueurInterface{
	private ArrayList<Livre>books; //on définit l'attribut books.Création d'une collection.
	
	

	public Loueur () {
		this.books= new ArrayList<Livre>(); 	//classe ArrayList, donc ne pas oublier d'instancier
	}
	
	
	public String booksNumber() {
		String message="Nombre de livres:";
		message+=this.books.size();
		
		return message;
	
	}
	
	public String listBooks() {
		String message="Livres de la collection de"+ this.nom+ "\n";
		return message;
	}
	
		//Boucle sur la collection des livres
	
	for(Livre livre: this.books) {
		message+=livre.titre()+"\n";//parcourt tous les elts de books et les renvoie vers livre
	}
			return message; 
	
}


	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
	 //recup de la taille du tableau (books.length) ecrire une methode pour parcourir le tableau pour connaître dispo, or mauvaise methode
		if(!this.books.contains(livre)){ 
		this.books.add(livre);
		
		}

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	}
