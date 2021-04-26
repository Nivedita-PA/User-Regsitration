
import java.util.regex.*;
import java.util.Scanner;
public class firstName {
	
	
	public static boolean isValidFirstName(String firstName)
	
	{
		String pattern = "[A-Z][a-z]{2,}";
		Pattern p = Pattern.compile(pattern);
		
		if (firstName == null) {
			return false;
		}
		
		Matcher m = p.matcher(firstName);
		
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//First Name
		System.out.println("Enter first name of user");
		String userName = sc.next();
		System.out.println(isValidFirstName(userName));
}
}
