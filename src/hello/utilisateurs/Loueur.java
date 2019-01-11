/**
 * 
 */
package hello.utilisateurs;
import java.util.ArrayList;
import java.util.HashMap;

import hello.utilisateurs.interfaces.LoueurInterface;

import hello.livre.Livre;


/**
 * @author Dell
 *
 */

	// Interface fonctionnelle, dans le sens où GetSize devient une fonction
	interface GetSize {
	public int getSize(HashMap<Livre, Integer>livres, boolean getStock);
	
	
	
	
}
public class Loueur extends Utilisateur implements LoueurInterface{
	private HashMap<Livre,Integer>books;
	String message = "";
	
	private boolean asStock;
	
	
	//on définit l'attribut books.Création d'une collection.
	
	public Loueur () {
		this.books= new HashMap <Livre, Integer>(); 	//classe ArrayList, donc ne pas oublier d'instancier
	}
	
	public String booksNumber() {
	
		String message="Nombre de livres:";
		message+=this.books.size();
		
		return message;
	
	}
	
	
	public int getCollectionSize(boolean asStock) {
	this.asStock=asStock;
	
	//fonction lambda dans une methode, acceptant 2 parametres: books et getStock. size est une variable avec une valeur particuliere=une fonction
	GetSize size=(collection,getStock)->{
		if(!getStock) {
			return collection.size();
		}else {
			int stock=0;
			for(Livre livre: collection.keySet()) {
				stock+=collection.get(livre);
			}
		return stock;
		}
	}; // ";" car c'est une fonction et non une methode
	return size.getSize(this.books, this.asStock);
	}
	
	
	
	public String listBooks() {
		message="Livres de la collection de"+ this.nom+"\n";
		/** Boucle sur la collection des livres*/
		
		this.books.forEach((k,v) -> message += k.getTitre() + v);
		
		return message;
		}

	
	/**
	 * Autre méthode
	 * 
	 * public String listBooks() {
        String message = "Livres de la collection de " + this.nom + "\n";

        Set <Entry<Livre, Integer>> entries = this.books.entrySet();
        Iterator <Entry<Livre, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Livre, Integer> entry = iterator.next();
            Livre livre = entry.getKey();
            Integer occurrences = entry.getValue();
            message += livre.titre() + " (" + occurrences + ")\n";
        }
        return message;
    }

	 */
	/**
	 * Methode pour le listbooks (avec message 2 définit en Attribut classe String message2;
message2 = "Livres de la collection de " + this.nom + "\n";
         this.books2.forEach((k,v) -> message2 += "livres    " +k.titre() + "  quantite     " +v +"\n");
	 */
	
	
	/** Methode JL
	 
	public String listBooks() {
        String message = "Livres de la collection de " + this.nom + "\n";

        Set <Entry<Livre, Integer>> entries = this.books.entrySet();
        Iterator <Entry<Livre, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Livre, Integer> entry = iterator.next();
            Livre livre = entry.getKey();
            Integer occurrences = entry.getValue();
            message += livre.titre() + " (" + occurrences + ")\n";
        }
        return message;
    }
*/
	
	
	public String listBooks1() {
        String message = "Livres de la collection de " + this.prenom + " " + this.nom + "\n";

        // Boucle sur la collection des livres
        for (Livre livre : this.books.keySet()) {
            message += livre.getTitre() + ", qte : " + this.books.get(livre) + "\n";
        }
        return message;
    }


	
	
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
	 //recup de la taille du tableau (books.length) ecrire une methode pour parcourir le tableau pour connaître dispo, or mauvaise methode
		if(this.books.containsKey(livre)){
			Integer oldValue=this.books.get(livre);
			oldValue=oldValue+1;
			this.books.replace(livre,oldValue);
		}else {
				this.books.put(livre,1);
			} 
	
		return this;
		}

	@Override
	public Utilisateur loan (Livre livre) {
		if(this.books.containsKey(livre)){
		Integer Instock= this.books.get(livre);
			if(Instock>0) {
			this.books.replace(livre,--Instock);
		}
	
	}	return this;
	}

	
	
	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	}
