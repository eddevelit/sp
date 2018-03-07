package com.team3.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.team3.sp.model.Cliente;
import com.team3.sp.model.Cuenta;
import com.team3.sp.services.ClienteProcedure;

@Controller
public class IndexController {
	@Autowired
	@Qualifier("storedprocedure")
	private ClienteProcedure clienteprocedure;
	
	@GetMapping("/")
	public String index(Model model)
	{
		//Creamos objeto de cliente
		model.addAttribute("cliente", new Cliente());
	return "index";	
	}
	
	@PostMapping("/addCliente")
	@ResponseBody
	public Cuenta alta(@RequestBody Cliente input) {
		return clienteprocedure.execute(input);
	}
	/*
	public ModelAndView addCliente(@ModelAttribute("cliente") Cliente cliente,@ModelAttribute("cuenta") Cuenta cuenta)
	{
		ModelAndView mav = new ModelAndView("registro");
		mav.addObject("cliente", cliente);
		mav.addObject("cuenta", cuenta);
		return mav;
		
	}
	*/
	
	
}
