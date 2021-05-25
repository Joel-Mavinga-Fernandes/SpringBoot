package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/hello")
	public String sayhello() {
		return "hello world";
					
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "Persistencia, mentalidade de crescimento";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprimorar as tecnicas do springboot "  +  " Absorver o maximo de conhecimentos possiveis";
	}
	
}
