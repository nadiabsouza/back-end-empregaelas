package br.com.empregaelas.security;

import java.io.Serializable;
import java.util.Objects;

public class CredenciaisContaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cpfOuCnpj;
	private String senha;

	public CredenciaisContaVO() {

	}

	public CredenciaisContaVO(String cpfOuCnpj, String senha) {
		this.cpfOuCnpj = cpfOuCnpj;
		this.senha = senha;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(senha, cpfOuCnpj);
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
		return Objects.equals(senha, other.senha) && Objects.equals(cpfOuCnpj, other.cpfOuCnpj);
	}

}

// entender melhor essa classe
