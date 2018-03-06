package com.team3.sp;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team3.sp.model.Cliente;

@SpringBootApplication
public class SpApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpApplication.class, args);
		escribirJSON();//Crear archivo JASON
	}
	////////Prueba JSON--- Objeto a JSON
	public static void escribirJSON() throws IOException {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Juan Perez");
		cliente.setDireccion("Av. Tehuantepec");
		cliente.setCorreo("juanito.banana@yahoo.com");
		cliente.setTelefono("55463728");
		cliente.setSaldo(10000.00);
		System.out.println(cliente);
		
		/*Crea archivo JSON
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cliente);
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("D:\\cliente.json"), cliente);
		System.out.println("SALIDA JSON: \n" + json);*///Crea archivo JSON
		//Leyendo un JSON
		ObjectMapper mapper = new ObjectMapper();
		Cliente client = mapper.readValue(new File("D:\\cliente.json"), Cliente.class);
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(client);
		System.out.println("OBJETO CLIENTE: \n" + json);
	}
	////////////////////
}
