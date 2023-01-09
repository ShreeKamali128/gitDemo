

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Add_Integers_In_String {

	public static void main(String[] args) {

		int sum1 = find1("123e45,j, _122");
		System.out.println(sum1);
		int sum2 = find2("123e45,j, _122");
		System.out.println(sum2);
		int sum3 = find3("123e45,j, _122");
		System.out.println(sum3);
	}

	public static int find1(String s) {
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < s.length(); i++) {
			char c;
			c = s.charAt(i);
			if (Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
				//sum1 += Integer.parseInt(Character.toString(c));
			}
		}
		//System.out.println("sum1 is: " + sum1);
		return sum;
	}

	public static int find2(String s) {

		int sum = 0;
		//Pattern p = Pattern.compile("\\d"); 			 // match single digit
		//Matcher m = p.matcher(s);
		Matcher m = Pattern.compile("\\d").matcher(s);
		while (m.find())							     // for all digits
		{								 
			sum += Integer.parseInt(m.group()); 		 // covert each String (digit) into numeric value and add to count
		}
		return sum;
	}
	
	public static int find3(String s)
	{
		  int sum = 0;
		    for (int i = 0; i < s.length(); i++)
		        sum += (s.charAt(i) >= '0' && s.charAt(i) <= '9') ? (s.charAt(i) - '0') : 0;  	// for every index of the string, check of the character is numeric by checking if the character value is between 0 and 9. If it is, convert it into its integer value by subtracting the ASCII value of 0 (0 = 48 and 9 = 57, and if we subtract 48 to 48, you get 0, and 57 - 48 = 9)
		    return sum;
	}

}
