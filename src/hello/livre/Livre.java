/**
 * 
 */
package hello.livre;

/**
 * @author Dell
 *
 */
public class Livre {
	private String titre;
	private String resume;
	private int nbPages;
	
	// Definition d'une constate de classe
	//Le mot clé final interdit la modification de la valeur

	private final int MINIMUM=4;

public Livre (String titre, String resume, int nbPages) {
	this.titre=titre;
	this.resume=resume;
	if(nbPages>=MINIMUM) {
		this.nbPages=nbPages;
	}else {
		this.nbPages=MINIMUM;
	}
	this.nbPages=nbPages;
}

public Livre() {
	// TODO Auto-generated constructor stub
}


public String getTitre() {
	return titre;
}

public Livre setTitre(String titre) {
	this.titre = titre;
	return this;
}

public String getResume() {
	return resume;
}

public Livre setResume(String resume) {
	this.resume = resume;
	return this;
}

public int getNbPages() {
	return nbPages;
}

public Livre setNbPages(int nbPages) {
	this.nbPages = nbPages;
	return this;
}

}


