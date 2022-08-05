package br.com.empregaelas.domain.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name="ee_candidatura")
public class Candidatura{

	@EmbeddedId
	ChaveComposta id;
	
	@ManyToOne
	@MapsId("id")
	@Column(name="id_candidato")
	Candidato candidato;
	
	@ManyToOne
	@MapsId("id")
	@Column(name="id_vaga")
	Vaga vaga;
	
	@NotBlank
	@Column(name="data_candidatura")
	private Date data_candidatura;
	
}	
	
	public Candidatura(
			@NotBlank Date data_candidatura)
{

		this.data_candidatura = data_candidatura;
	}
		
	@Override
	public int hashCode() { 
		return Objects.hash(data_candidatura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatura other = (Candidatura) obj;
		return Objects.equals( data_candidatura, other.data_candidatura)
;
	}
}

