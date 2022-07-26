package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EnderecoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private long idEndereco;
	private String logradouro;
	private String numero;
	private String complemento;
	private Date bairro;
	private String cidade;
	private String uf;
	private String cep;
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getIdEndereco() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getLogradouro() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getNumero() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getComplemento() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getBairro() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCidade() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object GetUf() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCep() {
		// TODO Auto-generated method stub
		return null;
	
	}

}
