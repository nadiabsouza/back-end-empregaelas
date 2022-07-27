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

import br.com.empregaelas.domain.vo.v1.EmpresaVO;
import br.com.empregaelas.service.EmpresaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Empresa Endpoint")
@RestController
@RequestMapping("/api/empresa/v1")
public class EmpresaController {

	@Autowired
	EmpresaService service;
	

	
	@RequestMapping(method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	@Operation(summary = "Listar todos as empresas")
	@ResponseStatus(value = HttpStatus.OK)
	public List<EmpresaVO> findAll() {
		List<EmpresaVO> empresasVO = service.findAll();
		empresasVO.stream()
				.forEach(p -> p.add(linkTo(methodOn(EmpresaController.class).findById(p.getKey())).withSelfRel()));

		return empresasVO;
	}

	
	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml" })
	@Operation(summary = "Procurar empresa por ID")
	@ResponseStatus(value = HttpStatus.OK)
	public EmpresaVO findById(@PathVariable("id") Long id) {
		EmpresaVO empresaVO = service.findById(id);
		empresaVO.add(linkTo(methodOn(EmpresaController.class).findById(id)).withSelfRel());
		return empresaVO;
	}



	@PostMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	@Operation(summary = "Cadastrar empresa")
	@ResponseStatus(value = HttpStatus.CREATED)
	public EmpresaVO create(@Valid @RequestBody EmpresaVO empresa) {
		EmpresaVO empresaVO = service.create(empresa);
		empresaVO.add(linkTo(methodOn(EmpresaController.class).findById(empresaVO.getKey())).withSelfRel());
		return empresaVO;
	}

	
	@PutMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	@Operation(summary = "Atualizar empresa")
	@ResponseStatus(value = HttpStatus.OK)
	public EmpresaVO update(@Valid @RequestBody EmpresaVO empresa) {
		EmpresaVO empresaVO = service.update(empresa);
		empresaVO.add(linkTo(methodOn(EmpresaController.class).findById(empresaVO.getKey())).withSelfRel());
		return empresaVO;

	}

   
	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deletar empresa")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

}

