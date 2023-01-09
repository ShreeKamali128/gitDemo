

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Add_Sequential_Integers_In_String {

	public static void main(String[] args) {

		int sum1 = find1("123e45,j, _122 ");		
		System.out.println(sum1);
		int sum2 = find2("123e45,j, _122");
		System.out.println(sum2);
		
	}

	public static int find1(String s) {
        int sum = 0;
        int temp = 0;
        int sign = 1;
       
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (Character.isDigit(c))
            {
                if (i > 0 &&  s.charAt(i-1) == '-')
                {
                    sign = -1;
                }
                
                temp = temp * 10 + c - '0';
            } 
            else 
            {
            	//here the string comes in this condition only when it sees any char like space or underscore or anything rather than integer so there must be something at the end of the string other than integer
                // non digit encountered so add to sum
                sum = sum + (sign * temp);
               // System.out.println("sum = " + sum);
                temp = 0;
                sign = 1;
            } 
        }

        return sum;
    }

	public static int find2(String s) {

		  int sum = 0;
		    Matcher m = Pattern.compile("(-?\\d+)").matcher(s);
		    while (m.find()) {
		        sum += Integer.parseInt(m.group(1));
		    }
		    return sum;
	}

}
