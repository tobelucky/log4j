package com.yh.log;

import org.apache.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = Logger.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		logger.info("这是随便写点信息即可");
	}

}
