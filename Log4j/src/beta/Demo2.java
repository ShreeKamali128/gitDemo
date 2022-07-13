package beta;

import org.apache.logging.log4j.*;
public class Demo2 {

	private static Logger log= LogManager.getLogger(Demo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("button is clicked");
		log.info("button click success");
		log.error("button not clicked");
		log.fatal("button not visible");
		
//		log.debug("button is clicked");
//		log.info("button click success");
//		log.error("button not clicked");
//		log.fatal("button not visible");
//		
//
//		System.out.println("GitX gonna push");
//		System.out.println("GitX push lastly");

	}

}
