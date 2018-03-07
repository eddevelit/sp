package com.team3.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.team3.sp.model.Cliente;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index()
	{
	return "index";	
	}
	
	@PostMapping(value = "clienteForm")
	public String clienteForm (Cliente cliente) {
		//agregar valores del form
		System.out.println("ClienteController: \n" + cliente.getCorreo());
		return "registro";
	}
}
