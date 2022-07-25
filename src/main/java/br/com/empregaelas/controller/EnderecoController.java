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

import br.com.empregaelas.domain.entity.Endereco;
import br.com.empregaelas.domain.vo.v1.EnderecoVO;
import br.com.empregaelas.service.EnderecoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/endereco/v1")
public class EnderecoController{
	
	@Autowired
	EnderecoService service;
	
	//Buscar todos
	@RequestMapping(method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public List<EnderecoVO> findAll(){
		return service.findAll();
	}
	
	//Buscar por ID
	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public EnderecoVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	//Criar endereço
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.CREATED)
	public EnderecoVO create (@Valid @RequestBody Endereco endereco) {
		return service.create(endereco);
	}
	//Atualizar endereco
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	public EnderecoVO update(@Valid @RequestBody Endereco endereco) {
		return service.update(endereco);
	}
	
	//deletar endereco
	@DeleteMapping(value="/{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable("id")Long id) {
		service.delete(id);
	}
		
}