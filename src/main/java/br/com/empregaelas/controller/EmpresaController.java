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

import br.com.empregaelas.domain.entity.Empresa;
import br.com.empregaelas.service.EmpresaService;




	@RestController
	@RequestMapping("/empresa")
	public class EmpresaController {
		
		@Autowired
		EmpresaService service;
		
		//buscar todos
		@RequestMapping(method= RequestMethod.GET,
				produces=MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(value=HttpStatus.OK)
		public List<Empresa>findAll(){
			return service.findAll();
		}
		
		//buscar por Id
		@GetMapping(value = "/{id}", 
				produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(value=HttpStatus.OK)
		public Empresa findById(@PathVariable("id") Long id) {
			return service.findById(id);
		}
		
		
		//criar empresa
		@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(value=HttpStatus.CREATED)
		public Empresa create (@Valid @RequestBody Empresa empresa) {
			return service.create(empresa);
		}
		
		//atualizar empresa
		@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, 
				produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(value=HttpStatus.OK)
		public Empresa update(@Valid @RequestBody Empresa empresa) {
			return service.update(empresa);
		}
		
		//deletar empresa
		@DeleteMapping(value="/{id}")
		@ResponseStatus(value=HttpStatus.OK)
		public void delete(@PathVariable("id")Long id) {
			service.delete(id);
		}	
	}