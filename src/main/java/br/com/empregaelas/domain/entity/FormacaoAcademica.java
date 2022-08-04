package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ee_formacao_academica")
@Data
@NoArgsConstructor
public class FormacaoAcademica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@NotBlank
	@JoinColumn(name = "id_candidato")
	private long id_candidato;

	@NotBlank
	@Size(max = 13)
	@Column(name = "formacao")
	private String formacao;

	@NotBlank
	@Size(max = 20)
	@Column(name = "curso")
	private String curso;

	@NotBlank
	@Size(max = 30)
	@Column(name = "instituicao")
	private String instituicao;

	@Column(name = "dataInicio")
	private Date dataInicio;

	@Column(name = "dataFinal")
	private Date dataFinal;

	@NotBlank
	@Lob
	@Column(name = "informacoes_adicionais")
	private String informacoes_adicionais;
}

