package com.team3.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import com.team3.sp.model.Cliente;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model)
	{
		//Creamos objeto de cliente
		model.addAttribute("cliente", new Cliente());
	return "index";	
	}
	
	@PostMapping("/addCliente")
	public ModelAndView addCliente(@ModelAttribute("cliente") Cliente cliente)
	{
		ModelAndView mav = new ModelAndView("registro");
		mav.addObject("cliente", cliente);
		return mav;
		
	}
}
