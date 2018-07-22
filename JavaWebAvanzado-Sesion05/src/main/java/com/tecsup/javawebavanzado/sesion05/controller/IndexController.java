package com.tecsup.javawebavanzado.sesion05.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	protected ModelAndView inicio() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMMM 'de' yyyy");
		String fecha = sdf.format(new Date());

		return new ModelAndView("ejercicio0", "fecha", fecha);
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	protected ModelAndView login(HttpServletRequest request) throws Exception {

		logger.info("Usuario: " + request.getParameter("idUsuario"));
		logger.info("Clave: " + request.getParameter("clave"));

		return new ModelAndView("ejercicio0", "mensaje", "Bienvenido al Sistema");
	}
}
