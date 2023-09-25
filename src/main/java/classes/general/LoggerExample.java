package classes.general;

import org.slf4j.*;

public class LoggerExample {

	public static void main(String[] args) {
		// System.out.println("Hello world");
		Logger logger = LoggerFactory.getLogger(LoggerExample.class);
		logger.info("Hello World");
	}
}

/*
 * download dependency for logger to work
 * <artifactId>slf4j-simple</artifactId>
 */