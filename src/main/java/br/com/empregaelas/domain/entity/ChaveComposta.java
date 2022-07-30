package br.com.empregaelas.domain.entity;


import java.io.Serializable;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class ChaveComposta implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="id_candidato")
	Long id_candidato;
	
	@Column(name="id_vaga")
	Long id_vaga;
	
}

