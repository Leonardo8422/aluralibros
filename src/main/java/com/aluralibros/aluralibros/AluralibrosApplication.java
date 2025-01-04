package com.aluralibros.aluralibros;

import com.aluralibros.aluralibros.principal.Principal;
import com.aluralibros.aluralibros.repositorio.AutorRepositorio;
import com.aluralibros.aluralibros.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.aluralibros")
public class AluralibrosApplication implements CommandLineRunner {
	@Autowired
	private LibroRepositorio libroRepositorio;
	@Autowired
	private AutorRepositorio autorRepositorio;

	public static void main(String[] args) {

		SpringApplication.run(AluralibrosApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepositorio, autorRepositorio);
		principal.mostarEnApp();

	}

}
