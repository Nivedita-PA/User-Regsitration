import java.util.regex.*;
import java.util.Scanner;
public class validEmail {
	public static boolean emailValidation(String email) {
		
		
		String regex = "^[a-z A-Z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})$";
		Pattern em = Pattern.compile(regex);
		
		if (email == null) {
			return false;
		}
		
		Matcher j = em.matcher(email);
		return j.matches();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  //Email ID
		System.out.println("Enter the email for user");
		String UserID = sc.next();
		System.out.println(UserID + " " + emailValidation(UserID));
}
}
