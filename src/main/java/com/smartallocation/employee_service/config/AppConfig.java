package com.smartallocation.employee_service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

    {
        log.info("I am a block from config file");
        log.info("testing merge conflicts");
        log.warn("testing merge conflicts from STS");
        log.error("Testing Integration");
        log.info("added from IntelliJ to the Integration");

    }
}
