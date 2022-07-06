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

import br.com.empregaelas.domain.entity.Candidato;
import br.com.empregaelas.domain.service.CandidatoService;


@RestController
@RequestMapping("/candidato")

public class CandidatoController {

	@Autowired
	CandidatoService candidatoService;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	//Buscar por todos
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Candidato>findAll(){
		return candidatoService.findAll();
	}

	//Buscar por ID	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Candidato findById(@PathVariable("id")Integer id) {
		return candidatoService.findById(id);
	}
	
	//Criar candidato
	@PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Candidato create(@Valid @RequestBody Candidato candidato) {
		return candidatoService.create(candidato);
	}
	

	//Atualizar candidato
	@PutMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Candidato update(@RequestBody Candidato candidato) {
		return candidatoService.update(candidato);	
	}
	
	//Excluir candidato
	@DeleteMapping(value="/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Integer id) {
		candidatoService.excluir(id);
	}
	
}
