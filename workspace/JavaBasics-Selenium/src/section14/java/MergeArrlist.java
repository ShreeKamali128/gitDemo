package section14.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class MergeArrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//merge two array lists using streams
		List<String> names1=Arrays.asList("Siddh", "Kohli");
		names1.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Janu");
		names.add("Ranjni");
		
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));   //if its not commented, its raising error like stream terminated
		
		//to check if a name is there in new stream
		boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Ram"));
		System.out.println(flag);
		Assert.assertTrue(flag); //if true the assert passes and test case passes else test case fails
		
	}

}
