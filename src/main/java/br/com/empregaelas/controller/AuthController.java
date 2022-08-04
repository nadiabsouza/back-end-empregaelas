package br.com.empregaelas.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.empregaelas.domain.vo.v1.CandidatoVO;
import br.com.empregaelas.security.CredenciaisContaVO;
import br.com.empregaelas.service.CandidatoService;
import br.com.empregaelas.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Authentication Endpoint")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserService userService;
	
	@Autowired
	CandidatoService service;

	@PostMapping(value = "/login", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity signin(@RequestBody CredenciaisContaVO cred) {
		return userService.login(cred.getCpfOuCnpj(), cred.getSenha());
	}

	// criar candidato
	@PostMapping(value = "/canditado", consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	@Operation(summary = "Cadastrar candidato")
	@ResponseStatus(value = HttpStatus.CREATED)
	public CandidatoVO create(@Valid @RequestBody CandidatoVO candidato) {
		System.out.println("candidato = " + candidato);
		CandidatoVO candidatoVO = service.create(candidato);
		candidatoVO.add(linkTo(methodOn(CandidatoController.class).findById(candidatoVO.getKey())).withSelfRel());
		return candidatoVO;
	}
}

