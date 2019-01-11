/**
 * 
 */
package hello.tools;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**s
 * @author Dell
 *
 */
public class AuteurImport {
	private File auteurFile;
	
	private static final String FIELD_SEP="i" ;
	
	private ArrayList <String[]>auteurs;
	
	// @TODOAJouter un moyen de définir si ou non il y a une ligne d'en-tête
	
	public AuteurImport () {
	
		//Instancier le ArrayList
		this.auteurs= new ArrayList<String []>();
		
		// Instancier la classe file donc...créer l'objet auteurfile
		this.auteurFile=new File("C:\\workspace\\eclipse\\hello\\src\\hello\\Auteur_csv");
		if(this.auteurFile.exists ()) {
		if (auteurFile.canRead()) {
			this.process();
	}else {
		
		System.out.println("le fichier n'est pas lisible");
	}
	}else {
		
		System.out.println ("le fichier demandé n'existe pas ");
		}
	}
	
	public ArrayList<String[]>getAuteurs(){
		return this.auteurs;
	}
	
	private void process(){
		
		//TODO Compter le nombre de colonnes dans une ligne lue
		try {
		Scanner fileScanner= new Scanner(auteurFile);
		
		int rowCount=0;
	
		while(fileScanner.hasNext()) {
			String row= fileScanner.nextLine();
			if (rowCount>0) {
				
			}
				// on doit parser row...
				String [] cols= row.split(AuteurImport.FIELD_SEP);
				
				// On doit ranger le tableau dans le ArrayList
				this.auteurs.add(cols);
			}
			rowCount++;
			
			} catch(IOException ioe) {
				
			}
		
			}
		}
		
			
		



