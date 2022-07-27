package br.com.empregaelas.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import br.com.empregaelas.domain.vo.v1.VagaVO;
import br.com.empregaelas.service.VagaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Vaga Endpoint")
@RestController
@RequestMapping("/api/vaga/v1")
public class VagaController {

	@Autowired
	VagaService service;

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	@Operation(summary = "Listar todos as vagas")
	@ResponseStatus(value = HttpStatus.OK)
	public List<VagaVO> findAll() {
		List<VagaVO> vagasVO = service.findAll();
		vagasVO.stream().forEach(p -> p.add(linkTo(methodOn(VagaController.class).findById(p.getKey())).withSelfRel()));
		return vagasVO;

	}

	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml" })
	@Operation(summary = "Procurar vaga por ID")
	@ResponseStatus(value = HttpStatus.OK)
	public VagaVO findById(@PathVariable("id") Long id) {
		VagaVO vagaVO = service.findById(id);
		vagaVO.add(linkTo(methodOn(VagaController.class).findById(id)).withSelfRel());
		return vagaVO;
	}

	@PostMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	@Operation(summary = "Cadastrar vaga")
	@ResponseStatus(value = HttpStatus.CREATED)
	public VagaVO create(@Valid @RequestBody VagaVO vaga) {
		VagaVO vagaVO = service.create(vaga);
		vagaVO.add(linkTo(methodOn(VagaController.class).findById(vagaVO.getKey())).withSelfRel());
		return vagaVO;
	}

	@PutMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	@Operation(summary = "Atualizar vaga")
	@ResponseStatus(value = HttpStatus.OK)
	public VagaVO update(@Valid @RequestBody VagaVO vaga) {
		VagaVO vagaVO = service.update(vaga);
		vagaVO.add(linkTo(methodOn(VagaController.class).findById(vagaVO.getKey())).withSelfRel());
		return vagaVO;

	}

	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deletar vaga")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

}
