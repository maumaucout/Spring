package com.hello.world.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin("*")

public class HelloworldController {
	@GetMapping
	public String getHello() {
		return ("Olá mundo, bem vindo ao primeiro treinamento Spring....... Obs: Solicitação do texto para esta tarefa em desenvolvimento...");
	}

}
