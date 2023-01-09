package section14.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamcollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using collect convert back again to list and do further operations

		List<String> ls=Stream.of("Ram", "Janani", "Ranjni", "Rakul", "Ritika").filter(s -> s.endsWith("i")).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//given arr(3,2,1,5,7,9,7,5,9). to do unique and sort elements print
		//1)convert arr to list 2) use streams
		//if to find nth index element? then using collector convert it to list and use get() meth to find elemnt
		
		List<Integer> values=Arrays.asList(3,2,1,5,7,9,7,5,9);
		values.stream().distinct().forEach(s->System.out.println(s));
		//sorted
		System.out.println("\n");
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("\n");
		List<Integer>val=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(val.get(3));
	}

}
