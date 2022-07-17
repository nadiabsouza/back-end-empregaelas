package br.com.empregaelas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empregaelas.security.CredenciaisContaVO;
import br.com.empregaelas.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Authentication Endpoint")
@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserService userService;

	@PostMapping(value = "/login", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity signin(@RequestBody CredenciaisContaVO cred) {
//		authenticationManager
//				.authenticate(new UsernamePasswordAuthenticationToken(cred.getCpfOuCnpj(), cred.getSenha()));
		return userService.login(cred.getCpfOuCnpj(), cred.getSenha());
	}
}
