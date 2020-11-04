package br.com.exame.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.com.exame.dto.ExameDto;
import br.com.exame.service.ExameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/exame")
public class ExameController {

	@Autowired
	private ExameService service;

	@PostMapping("/save")
	public ResponseEntity<?> salvar(@RequestBody ExameDto exameDto) {
		try {
			service.save(exameDto);
			return new ResponseEntity<>("Salvo com sucesso!", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao salvar!", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/list")
	public ResponseEntity<?> listAll() {
		try {
			List<ExameDto> exameList = service.list();
			return new ResponseEntity<>(exameList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Error" + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteById(@RequestBody ExameDto exameDto) {
		try {
			service.delete(exameDto);
			return new ResponseEntity<>("Excluido com sucesso", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao excluir", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody ExameDto exameDto) {
		try {
			service.update(exameDto);
			return new ResponseEntity<>("Sucesso ao atualizar", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao atualizar", HttpStatus.BAD_REQUEST);
		}
	}
}
