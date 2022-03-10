package com.algaworks.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.logistica.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Fabricio");
		cliente1.setTelefone("61 99999-9999");
		cliente1.setEmail("fabricio@email.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Aline");
		cliente2.setTelefone("61 11111-9999");
		cliente2.setEmail("alineo@email.com");
		
		
		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
