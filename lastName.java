import java.util.regex.*;
import java.util.Scanner;
public class lastName {
		public static boolean isValidLastName(String lastName)
	{
		String pattern = "[A-Z][a-z]{2,}";
		Pattern p = Pattern.compile(pattern);
		
		if (lastName == null) {
			return false;
		}
		
		Matcher m = p.matcher(lastName);
		
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//Last Name
		System.out.println("Enter last Name");
		String userLastName = sc.next();
		System.out.println(isValidLastName(userLastName));
}
}
