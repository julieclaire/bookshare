/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur {
	
	private int nbLivres;
	private int durée;
	private int coutlocation;
	/**
	 * 
	 */
	public Emprunteur() {
		super ();
// TODO Auto-generated constructor stub
		this.setNbLivres(3);
		this.setDurée(15);
	}
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom,prenom,numAdherent);
		this.setNbLivres(5);
		this.setDurée(15);
		
		
		
	}
	public int getNbLivres() {
		return nbLivres;
	}
	public void setNbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
	}
	public int getDurée() {
		return durée;
	}
	public void setDurée(int durée) {
		this.durée = durée;
	}

	
//Calcul coût location
	public double coutlocation (){
		this.coutlocation= nbLivres*durée*Cotisation.coutlocation
	}
	
}
