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
	private int dur�e;
	private int coutlocation;
	/**
	 * 
	 */
	public Emprunteur() {
		super ();
// TODO Auto-generated constructor stub
		this.setNbLivres(3);
		this.setDur�e(15);
	}
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom,prenom,numAdherent);
		this.setNbLivres(5);
		this.setDur�e(15);
		
		
		
	}
	public int getNbLivres() {
		return nbLivres;
	}
	public void setNbLivres(int nbLivres) {
		this.nbLivres = nbLivres;
	}
	public int getDur�e() {
		return dur�e;
	}
	public void setDur�e(int dur�e) {
		this.dur�e = dur�e;
	}

	
//Calcul co�t location
	public double coutlocation (){
		this.coutlocation= nbLivres*dur�e*Cotisation.coutlocation
	}
	
}
