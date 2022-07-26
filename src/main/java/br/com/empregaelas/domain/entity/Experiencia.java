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
@Table(name = "ee_experiencia")
@Data
@NoArgsConstructor
public class Experiencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@NotBlank
	@JoinColumn(name = "id_candidato")
	private long id_candidato;

	@NotBlank
	@Size(max = 30)
	@Column(name = "contratante")
	private String contratante;

	@NotBlank
	@Size(max = 30)
	@Column(name = "cargo")
	private String cargo;

	@NotBlank
	@Column(name = "dataInicio")
	private Date dataInicio;

	@NotBlank
	@Size(max = 1)
	@Column(name = "empregoAtual")
	private Byte empregoAtual;

	@Column(name = "dataSaida")
	private Date dataSaida;

	@NotBlank
	@Lob
	@Column(name = "atribuicoes")
	private String atribuicoes;

}

// criado por Lane
