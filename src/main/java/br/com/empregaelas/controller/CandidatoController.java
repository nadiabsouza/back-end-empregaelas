package br.com.empregaelas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.empregaelas.domain.entity.Candidato;
import br.com.empregaelas.domain.vo.v1.CandidatoVO;
import br.com.empregaelas.service.CandidatoService;

@RestController
@RequestMapping("/candidato/v1")
public class CandidatoController {
	
	@Autowired
	CandidatoService service;
	
	@RequestMapping(method= RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public List<CandidatoVO>findAll(){
		return service.buscarTodos();
	}
	
	@GetMapping(value = "/{id}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public CandidatoVO findById(@PathVariable("id") Long id) {
		return service.buscarPorId(id);
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.CREATED)
	public CandidatoVO create (@Valid @RequestBody CandidatoVO candidato) {
		return service.inserir(candidato);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public CandidatoVO update(@Valid @RequestBody CandidatoVO candidato) {
		return service.atualizar(candidato);
	}
	
	@DeleteMapping(value="/{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable("id")Long id) {
		service.delete(id);
	}
	
	
}
