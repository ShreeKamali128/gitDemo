import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Interview_qutns {

	public static int factorial(int x) {
		if (x == 1)
			return 1;
		else
			return (x * factorial(x - 1));
	}

	public static void main(String[] args) {
		// factorial
//		int x=5;
//		int res=factorial(x);
//		System.out.println(res);

		//Hash Map
//		HashMap<String,String> hm= new HashMap<String,String>();
//		hm.put("a", "chrome");
//		hm.put("b", "edge");
//		
//		for(Map.Entry m:hm.entrySet())
//		{
//			System.out.println(m.getKey() +"  -  " + m.getValue());
//		}

		
		//ArrayList unique elements
//		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("3", "2", "1", "4","7","5"));
//		al1.add("5");
//		
//		ArrayList<String> al2 = new ArrayList<String>();
//		al2.addAll(al1);
//		System.out.println(al2);
//		
//		Set<String> set = al2.stream().distinct().collect(Collectors.toSet());
//		System.out.println(set);
		
	}


}



