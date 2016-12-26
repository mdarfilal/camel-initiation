package camel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		logger.debug("msg debug");
		logger.info("msg info");
		logger.warn("msg warn");
		logger.error("msg error");
	}
}