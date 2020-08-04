package com.uverwolf.firstproyect;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String Mensaje() {
	return "Hola coding dojo";
}
	@RequestMapping("/python")
	public String MensajePython() {
	return "¡Python/Django fue increíble!";
}
	@RequestMapping("/java")
	public String MensajeJava() {
	return "¡Java/Spring es mejor!";
}
}
