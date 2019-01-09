/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Loueur extends Utilisateur {
	private int nbLivres = 30;
	private double prixcotisation;
	/**
	 * 
	 */
	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	
	}
	// Calcul méthode cotisation
	
	public double prixcotisation () {
		if(nbLivres >30) {
			this.prixcotisation=(Cotisation.prixcotisation -(Cotisation.prixcotisation*Cotisation.remise))*(1+Cotisation.TVA);
					}
		else {
			this.prixcotisation=Cotisation.prixcotisation;
		}
		return this.prixcotisation;
		
	}

	public void nbLivres(int i) {
		// TODO Auto-generated method stub
		
	}
	public Utilisateur clone() {
		Emprunteur emprunteur= new Emprunteur ();
		emprunteur.nom=this.nom;
		emprunteur.prenom=this.prenom;
		emprunteur.numAdherent=this.numAdherent;
		return emprunteur;
	}
}
