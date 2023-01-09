import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		
		StringBuffer sbuf= new StringBuffer(str);
		sbuf.reverse();
		
	
		String temp=sbuf.toString();
		
		if(str.equalsIgnoreCase(temp))
		{
			System.out.println("equal strings");
		}
		else
		{
			System.out.println("not equal string");
		}
		char arr[]= {'K','a','a','s','h','i','v','i','n','f','o','t','e','c','h'};
		String s1= new String(arr);
		System.out.println("two strings are: "+ str.concat(s1) + "  " + str+s1);
		System.out.println("lengths are "+ str.length() + " and " + s1.length());
		
		System.out.println("Strign starting with m is " + str.startsWith("m"));
		
		String newStr= str.substring(0, 5);
		System.out.println("substring is "+ newStr);
	}
	catch(Exception e)
	{
		System.out.println("caught with exception...");
	}
	}

}
