package com.uverwolf.firstproyect;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {

	@RequestMapping("/{texto}")
	public String valor(@PathVariable("texto") String texto) {
		if(texto.equals("dojo")) {
			return "El dojo es increible!";
		}else if(texto.equals("burbank-dojo")){
			return "El Dojo Burbank está localizado al sur de California";
		}else if(texto.equals("san-jose")) {
			return "El dojo SJ es el cuartel principal";
		}else {
			return "Parametro invalido";
		}
	}
}
