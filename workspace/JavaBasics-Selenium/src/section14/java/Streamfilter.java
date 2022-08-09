package section14.java;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Janu");
		names.add("Ranjni");
		names.add("Rakul");
		names.add("Ritika");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String naam = names.get(i);
			if (naam.startsWith("R")) {
				count++;
			}

		}
		System.out.println("count of r names is: " + count);
		*/
		/*
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Janu");
		names.add("Ranjni");
		names.add("Rakul");
		names.add("Ritika");
		//1st step:  names.stream()---> created  initial stream with names arraylist
		//2nd step: filter()on initial stream------>intermediate action; parallely scanning names starting with 'R' so that transforming it to another (final)stream
		//3rd step: count()---->terminal operation on final stream(filtered stream) to get the result, not on names.
		
		//stream created after arraylist being created
		 //here filter(s) has a name on each time
		  //count is a terminal op1
		Long count=names.stream().filter(s->s.startsWith("R")).count();
		System.out.println(count);
		
		//ther is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if filter intermediate returns true
		//lightweight stream compatible collections can be created and used(we can create streams)
		//how to use filter in Stream api
	
		//alitter of stream creation- directly with names
		Long d= Stream.of("Ram","Janu","Ranjni","Rakul","Ritika").filter(s->
		{
			s.startsWith("R");
			return false;
		}
		).count();
		System.out.println("2nd type stream count of anmes: "+ d);  //return nothing since filter returned false
		*/
		
		//print all names in arraylist:-->use foreach
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Janu");
		names.add("Ram");
		names.add("Ram");
		names.add("Ritika");
		
		
		//foreach traverse on all names filtered in the intermediate op and store in s and perform the action print
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));  //limit terminal op2
		//List ls=names.stream().filter(s-> s.equals("Ram").forEach(s->System.out.println(s));  //limit terminal op2
		//names.stream().filter();
	}

}
