package com.example.jenkins_demo_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoProjectApplicationTests {

    public static Logger log = LoggerFactory.getLogger(JenkinsDemoProjectApplicationTests.class);

    @Test
    void contextLoads() {
        log.info("Application test executed...");
        int x = 2;
        int y = 3;
        Assertions.assertEquals(6, x*y);
    }

    @Test
    void another() {
        log.info("Application another test executed...");
        int x = 2;
        int y = 4;
        Assertions.assertEquals(8, x*y);
    }

    @Test
    void second() {
        log.info("Application another second test executed...");
        int x = 4;
        int y = 4;
        Assertions.assertEquals(16, x*y);
    }

}
