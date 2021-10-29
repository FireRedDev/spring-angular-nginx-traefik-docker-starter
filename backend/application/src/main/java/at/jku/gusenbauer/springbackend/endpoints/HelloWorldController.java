/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.jku.gusenbauer.springbackend.endpoints;

import at.jku.gusenbauer.springbackend.entities.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import at.jku.gusenbauer.springbackend.repositories.SystemRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author chris
 */
@RestController()
public class HelloWorldController {
    
      
    
  private SystemRepository systemRepository;
    

  public HelloWorldController(SystemRepository systemRepository) {
    this.systemRepository=systemRepository;
    System.out.println("CHECK DATABASE: #Users="+this.systemRepository.count());
  }

    @GetMapping("/helloworld")
	public String greeting() {
		return "Hello World";
	}   
        
}
