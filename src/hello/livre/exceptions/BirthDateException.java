/**
 * 
 */
package hello.livre.exceptions;

/**
 * @author Dell
 *
 */
public class BirthDateException extends Exception {
	
	public String getmessage() {
		return " la date de naissance ne peut �tre sup�rieure � la date du:";
	}
}
