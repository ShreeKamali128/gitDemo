package alpha;

import org.apache.logging.log4j.*;
public class Demo1 {

	private static Logger log= LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("button is clicked");
		log.info("button click success");
		log.error("button not clicked");
		log.fatal("button not visible");
		////////////////////////////////////////////////
//		
//		log.debug("button is clicked");
//		log.info("button click success");
//		log.error("button not clicked");
//		log.fatal("button not visible");
		

//		/////////////////////////////////
//		
//		System.out.println("GitX gonna push");
//
//		System.out.println("gitX push lastly...");
	}
  
}
