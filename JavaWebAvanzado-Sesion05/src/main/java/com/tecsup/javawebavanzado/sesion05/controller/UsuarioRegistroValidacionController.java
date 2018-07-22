package com.tecsup.javawebavanzado.sesion05.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.shopping.modelo.Usuario;

@Controller
@RequestMapping("/registroValidacion")
public class UsuarioRegistroValidacionController {
	private static final Logger logger = LoggerFactory.getLogger(UsuarioRegistroValidacionController.class);

	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView modelAndView = 
				new ModelAndView("registroValidacion/formulario", "usuario", new Usuario());

		return modelAndView;
	}

	@PostMapping("/crear")
	public String crear(
			@Validated @ModelAttribute("usuario") Usuario usuario, 
			BindingResult bindingResult, 
			ModelMap model) {
		
		if (bindingResult.hasErrors()) {
	         return "registroValidacion/formulario";
	      }

		model.addAttribute("cuenta", usuario.getCuenta());
		model.addAttribute("clave", usuario.getClave());
		model.addAttribute("edad", usuario.getEdad());

		return "registroValidacion/resultado";
	}

}
