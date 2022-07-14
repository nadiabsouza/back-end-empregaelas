package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class CandidatoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private long id;
	private String cpf;
	private String nome;
	private String nomeSocial;
	private Date dataNasc;
	private String estadoCivil;
	private String linkedin;
	private String gitHub;
	private String portfolio;
	private String raca;
	private String genero;
	private String sexoBio;
	private String sobre;
	private String idioma;
	private double pretensaoSalarial;
    private Date dataCadastro;

}


