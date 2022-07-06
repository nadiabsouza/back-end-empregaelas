package controllers;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.empregaelas.domain.entity.Empresa;
import br.com.empregaelas.domain.service.EmpresaService;


@RestController
@RequestMapping("/empresa")

public class EmpresaController {

	@Autowired
	EmpresaService empresaService;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	//Buscar por todos
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Empresa>findAll(){
		return empresaService.findAll();
	}

	//Buscar por ID	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Empresa findById(@PathVariable("id")Integer id) {
		return empresaService.findById(id);
	}
	
	//Criar empresa
	@PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa create(@Valid @RequestBody Empresa empresa) {
		return empresaService.create(empresa);
	}
	

	//Atualizar empresa
	@PutMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa update(@RequestBody Empresa empresa) {
		return empresaService.update(empresa);	
	}
	
	//Excluir empresa
	@DeleteMapping(value="/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Integer id) {
		empresaService.excluir(id);
	}
	
}
