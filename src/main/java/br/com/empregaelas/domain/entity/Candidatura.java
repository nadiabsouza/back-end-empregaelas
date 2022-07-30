package br.com.empregaelas.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name="candidatura")
public class Candidatura{

	@EmbeddedId
	ChaveComposta id;
	
	@ManyToOne
	@MapsId("id_candidato")
	@JoinColumn(name="id_candidato")
	Candidato candidato;
	
	@ManyToOne
	@MapsId("id_vaga")
	@JoinColumn(name="id_vaga")
	Vaga vaga;
	
	@NotBlank
	@Column(name="data_candidatura")
	private Date data_candidatura;
}

