package com.tecsup.javawebavanzado.sesion05.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.shopping.modelo.Usuario;

@Controller
@RequestMapping("/registro")
public class UsuarioRegistroController {
	private static final Logger logger = LoggerFactory.getLogger(UsuarioRegistroController.class);

	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView modelAndView = new ModelAndView("registro/formulario", "usuario", new Usuario());

		return modelAndView;
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute("usuario") Usuario usuario, ModelMap model) {

		model.addAttribute("cuenta", usuario.getCuenta());
		model.addAttribute("clave", usuario.getClave());
		model.addAttribute("direccion", usuario.getDireccion());

		return "registro/resultado";
	}
}
