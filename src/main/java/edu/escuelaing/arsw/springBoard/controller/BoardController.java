package edu.escuelaing.arsw.springBoard.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class controls the spring project.
 * @author Daniel Santiago Ducuara Ardila
 *
 */
@RestController
public class BoardController {
	
	 @GetMapping("/status")
	 public String status() {
	 return "{\"status\":\"Greetings from Spring Boot "
	 + java.time.LocalDate.now() + ", "
	 + java.time.LocalTime.now()
	 + ". " + "The server is Runnig!\"}";
	 }
	
}