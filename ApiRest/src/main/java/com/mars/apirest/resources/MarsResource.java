package com.mars.apirest.resources;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.apirest.repository.ExecutaComando;

@RestController
@RequestMapping(value="/mars")
public class MarsResource {
	
	@PostMapping("/{comando}")
	public String enviaComando(@PathVariable(value="comando") String comando) throws Exception{
		
		String response;
		try {
			response = new ExecutaComando().ExecutaComando(comando);
		} catch (Exception e) {
			return String.format("{\"status\":400, \"message\": %s }", e.getMessage());
		}
		
		return response;
		
	}
}
