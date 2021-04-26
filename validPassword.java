import java.util.regex.*;
import java.util.Scanner;
public class validPassword {
         public static boolean passwordValidation(String password)
	{
		
		
		String pattern = "^([A-Z]{1,}[0-9]{1,}(_.-+@#$%*){1,}){8}$";
		Pattern p = Pattern.compile(pattern);
		
		if (password == null) {
			return false;
		}
		
		Matcher m = p.matcher(password);
		
		return m.matches();
	}

   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
     	//Password
		System.out.println("Enter the password for user");
		String UserPassword = sc.next();
		System.out.println(passwordValidation(UserPassword));
}
}
