package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/ingresar")
	public @ResponseBody ModelAndView ingresar(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String fecha, @RequestParam String lugar, @RequestParam String colegio,@RequestParam String telefonoF, @RequestParam String telefonoC ) {	
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",nombre);
		mav.addObject("lastName",apellido);
		mav.addObject("BDay",fecha);
		mav.addObject("place", lugar);
		mav.addObject("school",colegio);
		mav.addObject("phone", telefonoF);
		mav.addObject("cellphone",telefonoC);
		mav.setViewName("Tarea3/src/main/resources/templates/index");
		return mav;
	}
	
}
