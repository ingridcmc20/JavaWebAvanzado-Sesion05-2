package com.tecsup.javawebavanzado.sesion05.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.shopping.modelo.Usuario;

@Controller
@RequestMapping("/encuesta")
public class UsuarioEncuestaController {
	private static final Logger logger = LoggerFactory.getLogger(UsuarioEncuestaController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView iniciar() {

		Usuario usuario = new Usuario();
		usuario.setFavoritoFrameworks((new String[] { "Spring MVC", "Struts 2" }));
		usuario.setGenero("M");
		ModelAndView modelAndView = new ModelAndView("encuesta/formulario", "command", usuario);

		return modelAndView;
	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String crear(@ModelAttribute("SpringWeb") Usuario usuario, ModelMap model) {

		model.addAttribute("id", usuario.getId());
		model.addAttribute("cuenta", usuario.getCuenta());
		model.addAttribute("clave", usuario.getClave());
		model.addAttribute("direccion", usuario.getDireccion());
		model.addAttribute("suscripcionRevista", usuario.isSuscripcionRevista());
		model.addAttribute("favoritoFrameworks", usuario.getFavoritoFrameworks());
		model.addAttribute("genero", usuario.getGenero());
		model.addAttribute("favoritoNumero", usuario.getFavoritoNumero());
		model.addAttribute("pais", usuario.getPais());
		model.addAttribute("habilidades", usuario.getHabilidades());

		return "encuesta/resultado";
	}

	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList() {

		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Struts 1");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("Apache Wicket");

		return webFrameworkList;
	}

	@ModelAttribute("numerosList")
	public List<String> getNumerosList() {

		List<String> numbersList = new ArrayList<String>();
		numbersList.add("1");
		numbersList.add("2");
		numbersList.add("3");
		numbersList.add("4");

		return numbersList;
	}

	@ModelAttribute("paisesList")
	public Map<String, String> getPaisesList() {

		Map<String, String> countryList = new HashMap<String, String>();
		countryList.put("PE", "Per&uacute;");
		countryList.put("CL", "Chile");
		countryList.put("CO", "Colommbia");
		countryList.put("BR", "Brazil");

		return countryList;
	}

	@ModelAttribute("habilidadesList")
	public Map<String, String> getHabilidadesList() {

		Map<String, String> skillList = new HashMap<String, String>();
		skillList.put("Hibernate", "Hibernate");
		skillList.put("Spring", "Spring");
		skillList.put("Apache Wicket", "Apache Wicket");
		skillList.put("Struts", "Struts");

		return skillList;
	}

}
