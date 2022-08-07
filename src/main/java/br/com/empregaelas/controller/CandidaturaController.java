package br.com.empregaelas.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.empregaelas.domain.vo.v1.CandidaturaVO;
import br.com.empregaelas.service.CandidaturaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Candidatura Endpoint")
@RestController
@RequestMapping("/api/candidatura/v1")
public class CandidaturaController {

	@Autowired
	CandidaturaService service;

	// buscar todos
	@CrossOrigin("localhost:8080")
	@RequestMapping(method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	@Operation(summary = "Listar todas as candidaturas")
	@ResponseStatus(value = HttpStatus.OK)
	public List<CandidaturaVO> findAll() {
		List<CandidaturaVO> candidaturasVO = service.findAll();
				
				findAll();
		candidaturasVO.stream()
				.forEach(p -> p.add(linkTo(methodOn(CandidaturaController.class).findById(p.getKey())).withSelfRel()));
		return candidaturasVO;

	}

	// buscar por Id
	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml" })
	@Operation(summary = "Procurar candidatura por ID")
	@ResponseStatus(value = HttpStatus.OK)
	public CandidaturaVO findById(@PathVariable("id") Long id) {
		CandidaturaVO candidaturaVO = service.findById(id);
		candidaturaVO.add(linkTo(methodOn(CandidaturaController.class).findById(id)).withSelfRel());
		return candidaturaVO;
	}

	// criar candidatura

//	@PostMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
//			"application/xml" })
//	@Operation(summary = "Cadastrar candidatura")
//	@ResponseStatus(value = HttpStatus.CREATED)
//	public CandidaturaVO create(@Valid @RequestBody CandidaturaVO candidatura) {
//		CandidaturaVO candidaturaVO = service.create(candidatura);
//		candidaturaVO.add(linkTo(methodOn(CandidaturaController.class).findById(candidaturaVO.getKey())).withSelfRel());
//		return candidaturaVO;
//	}

	// atualizar candidatura
	@PutMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	@Operation(summary = "Atualizar candidatura")
	@ResponseStatus(value = HttpStatus.OK)
	public CandidaturaVO update(@Valid @RequestBody CandidaturaVO candidatura) {
		CandidaturaVO candidaturaVO = service.update(candidatura);
		candidaturaVO.add(linkTo(methodOn(CandidaturaController.class).findById(candidaturaVO.getKey())).withSelfRel());
		return candidaturaVO;

	}

	// deletar candidatura
	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deletar candidatura")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

}

