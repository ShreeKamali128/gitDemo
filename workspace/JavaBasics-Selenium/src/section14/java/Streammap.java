package section14.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streammap {

	public static void main(String[] args) {
		//names  that ends with i in uppercase
		Stream.of("Ram", "Janani", "Ranjni", "Rakul", "Ritika").filter(s -> s.endsWith("i")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
		//names in 'R' uppercase with sort terminal operation3
		List<String> names=Arrays.asList("Ram", "Janani", "Ranjni", "Rakul", "Ritika");
		names.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
