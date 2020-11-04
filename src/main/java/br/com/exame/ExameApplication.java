package br.com.exame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.exame.controller.ExameController;

@SpringBootApplication
@ComponentScan("com.exame")
@ComponentScan(basePackageClasses = ExameController.class)
public class ExameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExameApplication.class, args);

	}
}
