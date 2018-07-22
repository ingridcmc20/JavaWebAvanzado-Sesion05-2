package com.tecsup.javawebavanzado.sesion05.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ejercicio1")
public class Mapeo1Controller {
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, String> get() {

		HashMap<String, String> persona = new HashMap<String, String>();
		persona.put("nombre", "Juan");
		persona.put("paterno", "Rodriguez");

		return persona;
	}

}
