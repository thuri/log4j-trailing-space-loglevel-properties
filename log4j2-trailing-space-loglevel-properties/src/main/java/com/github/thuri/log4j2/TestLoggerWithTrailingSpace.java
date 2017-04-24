package com.github.thuri.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLoggerWithTrailingSpace {

  public static void main(String[] args) {
    
    Logger logger = LogManager.getLogger();
    
    logger.debug("Logging on DEBUG");
    logger.info("Logging on INFO");
    
  }
  
}
