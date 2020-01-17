package poc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="aBc@ab1";
		Pattern digit= Pattern.compile("[0-9]");
		Pattern lowerCase=Pattern.compile("[a-z]");
		Pattern upperCase=Pattern.compile("[A-Z]");
		Pattern specialChar=Pattern.compile("[!@#$%^&*()-+]");
		
		Pattern abc=Pattern.compile("[abcxyzabc]");
		Matcher m=abc.matcher("ab");
		
		
		Matcher hasDigit=specialChar.matcher(password);
		
		if(m.find()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
