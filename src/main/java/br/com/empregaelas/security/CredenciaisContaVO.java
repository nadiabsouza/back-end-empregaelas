package br.com.empregaelas.security;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class CredenciaisContaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String senha;

	public CredenciaisContaVO() {

	}

	public CredenciaisContaVO(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(senha, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CredenciaisContaVO other = (CredenciaisContaVO) obj;
		return Objects.equals(senha, other.senha) && Objects.equals(email, other.email);
	}

}
