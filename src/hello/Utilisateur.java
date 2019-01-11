/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;

	/**
	 * Constructeur d'une classe Java porte le nom de la classe
	 */
	public Utilisateur() {
		System.out.println("Je suis le constructeur Utilisateur");

	}

	/**
	 * Ici signature différente du constructeur précédent
	 */
	public Utilisateur(String nom, String prenom, String numAdherent) {
		this.nom = nom;
		this.prenom = prenom;
		this.numAdherent = numAdherent;
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

	public String getNumAdherent() {
		return numAdherent;
	}

	public void setNumAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
	}

	public String nom() {
		return this.nom;
	}

	public String prenom() {
		return this.prenom;
	}

	public String numAdherent() {
		return this.numAdherent;
	}

//methode polymorphe, obtention de comportements différents

	public Utilisateur nom(String nom) {
		this.nom = nom;
		return this;
	}

	public Utilisateur prenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
		return this;
	}

abstract public Utilisateur clone(); 

}
