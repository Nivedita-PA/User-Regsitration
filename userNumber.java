import java.util.regex.*;
import java.util.Scanner;
public class userNumber {
            	public static boolean mobileNoValidation(String number)
	{
		
		
		String pattern = "^[9][1]\\s[6-9][0-9]{9}$";
		Pattern p = Pattern.compile(pattern);
		
		if (number == null) {
			return false;
		}
		
		Matcher m = p.matcher(number);
		
		return m.matches();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
   //Mobile Number
		System.out.println("Enter the number for user");
		String UserNo = sc.next();
		System.out.println(mobileNoValidation(UserNo));
		
}
}
