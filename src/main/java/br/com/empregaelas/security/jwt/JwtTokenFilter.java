package br.com.empregaelas.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.GenericFilterBean;

import br.com.empregaelas.service.UserService;

//vamos extender de um filtro generico e pegar o metodo de implementação
public class JwtTokenFilter extends GenericFilterBean {

	// injetamos a classe provider
	@Autowired
	private JwtProvider jwtProvider;
	
	@Autowired
	private UserService userService;

	public JwtTokenFilter(JwtProvider jwtProvider, UserService userService) {
		this.userService = userService;
		this.jwtProvider = jwtProvider;
	}

	// o filtro serve para filtrar se há um token devolvido pelo cabeçalho
	// trabalhado no nosso resolverToken

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String token = jwtProvider.resolveToken((HttpServletRequest) request);

		if (token != null && jwtProvider.validateToken(token)) {
			UserDetails userDetails = userService.loadUserByEmail(jwtProvider.getEmail(token));
			UsernamePasswordAuthenticationToken auth = 
					new UsernamePasswordAuthenticationToken(
							userDetails, 
							"",
							userDetails.getAuthorities());
//			Authentication auth = jwtProvider.getAuthentication(upat);
			if (auth != null) {
				auth.setDetails(new WebAuthenticationDetailsSource().buildDetails((HttpServletRequest) request));
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		}
		chain.doFilter(request, response);

	}

}
