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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.empregaelas.domain.entity.Experiencia;
import br.com.empregaelas.domain.vo.v1.ExperienciaVO;
import br.com.empregaelas.service.ExperienciaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/experiencia/v1")
public class ExperienciaController{
	
	@Autowired
	ExperienciaService service;
	
	//Buscar todos
	@RequestMapping(method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public List<ExperienciaVO> findAll(){
		return service.findAll();
	}
	
	//Buscar por ID
	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public ExperienciaVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	//Criar endereço
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.CREATED)
	public ExperienciaVO create (@Valid @RequestBody Experiencia experiencia) {
		return service.create(experiencia);
	}
	//Atualizar experiencia
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public ExperienciaVO update(@Valid @RequestBody Experiencia experiencia) {
		return service.update(experiencia); 	
	}
	
	//deletar experiencia
	@DeleteMapping(value="/{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable("id")Long id) {
		service.delete(id);
	}
		
}