package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmpresaVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String responsavel;
	private Date segmento;
	private int numeroFuncionarios;
	
	public Object getCnpj() {
		// TODO Auto-generated method stub 
		return null;
	}
	public Object getRazaoSocial() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getNomeFantasia() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getResponsavel() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getSegmento() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getNumeroFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	
	}

}


