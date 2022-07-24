package br.com.empregaelas.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.empregaelas.model.UsuarioModel;


//Autenticar e gerar token

public class JWTAutenticarFilter extends UsernamePasswordAuthenticationFilter{
	
	private static final String TOKEN_SENHA = null;
	private static final long TOKEN_EXPIRACAO = 0;

	@Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {
        try {
            UsuarioModel usuario = new ObjectMapper()
                    .readValue(request.getInputStream(), UsuarioModel.class);

            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    usuario.getLogin(),
                    usuario.getSenha(),
                    
                   //Obs.: falta acrescentar abaixo as permiss�es do usu�rio.
                    new ArrayList<>()
            ));

        } catch (IOException e) {
            throw new RuntimeException("Falha ao autenticar usu�rio", e);
        }

    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        DetalheUsuarioData usuarioData = (DetalheUsuarioData) authResult.getPrincipal();

        String token = Jwt.create().
                withSubject(usuarioData.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + TOKEN_EXPIRACAO))
                .sign(Algorithm.HMAC512(TOKEN_SENHA));

        response.getWriter().write(token);
        response.getWriter().flush();
    }
}

	
	
}
