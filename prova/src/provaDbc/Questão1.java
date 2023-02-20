package provaDbc;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Questão1 {

	public static boolean isAnagram(String str1, String str2) {
		boolean check_String = true;

		if (str1.length() == str2.length()) {

			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = check_String;
		}else {
			return check_String = false; 
			
			}
		return check_String;
	
	

	}

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	
	 System.out.print("Digite a primera string: ");
		String str1 = scan.nextLine();
		System.out.print("Digite a segunda string: ");
		String str2 = scan.nextLine();

		System.out.println("Check_String = " + isAnagram(str1, str2));

	}

}
