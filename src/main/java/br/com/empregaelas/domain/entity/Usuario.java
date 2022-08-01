package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.empregaelas.enums.USER_PERMISSIONS;
import lombok.Data;


@Entity
public class Usuario implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id_usuario;	
	private USER_PERMISSIONS tipoPermissao;
	private Endereco endereco;
	private String telefone;
	private String senha;
	private Data data_cadastro;


	public int getId_usuario() {
		return id_usuario;
	}



	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}



	public USER_PERMISSIONS getTipoPermissao() {
		return tipoPermissao;
	}



	public void setTipoPermissao(USER_PERMISSIONS tipoPermissao) {
		this.tipoPermissao = tipoPermissao;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public Data getData_cadastro() {
		return data_cadastro;
	}



	public void setData_cadastro(Data data_cadastro) {
		this.data_cadastro = data_cadastro;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
		
}

