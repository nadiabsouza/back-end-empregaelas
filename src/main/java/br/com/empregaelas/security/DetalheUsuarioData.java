package br.com.empregaelas.security;

import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.empregaelas.model.UsuarioModel;

public class DetalheUsuarioData implements UserDetails{

	//Aqui, objetiva-se determinar a autoriza��o e poss�veis casos de erro.
	
	private static final long serialVersionUID = 1L;
	
	private final Optional<UsuarioModel> usuario;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return usuario.orElse(new UsuarioModel()).getSenha();
	}

	@Override
	public String getUsername() {
		return usuario.orElse((new UsuarioModel()).getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

