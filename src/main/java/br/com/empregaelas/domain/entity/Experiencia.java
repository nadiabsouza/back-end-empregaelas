package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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
	@JoinColumn(name= "id_candidato")
	private long id_candidato;

	@NotBlank
	@Size(max = 30)
	@Column(name = "tipo_contrato")
	private String tipo_contrato;
	
	@NotBlank
	@Size(max = 30)
	@Column(name = "contratante")
	private String contratante;
	
	@NotBlank
	@Size(max = 30)
	@Column(name = "cargo")
	private String cargo;
	
	@NotBlank
	@Column(name = "data_inicio")
	private Date data_inicio;
	
	@NotBlank
	@Size(max = 1)
	@Column(name = "emprego_atual")
	private Byte emprego_atual;
	
	@Column(name = "data_saida")
	private Date data_saida;
	
	@NotBlank
	@Lob 
	@Column(name = "atribuicoes")
	private String atribuicoes;
	
	
	public Experiencia(@NotBlank Long id, 
			@NotBlank long id_candidato,
			@NotBlank @Size(max = 30) String tipo_contrato,
			@NotBlank @Size(max = 30) String contratante,
			@NotBlank @Size(max = 30) String cargo,
			@NotBlank Date data_inicio,
			@NotBlank @Size(max = 1) Byte emprego_atual,
			@NotBlank Date data_saida,
			@NotBlank String atribuicoes)
{

		this.id = id;
		this.id_candidato = id_candidato;
		this.tipo_contrato = tipo_contrato;
		this.cargo = cargo;
		this.data_inicio = data_inicio;
		this.emprego_atual = emprego_atual;
		this.data_saida = data_saida;
		this.atribuicoes = atribuicoes;
	}
		
	@Override
	public int hashCode() { 
		return Objects.hash(id_candidato, tipo_contrato,cargo,
				data_inicio,emprego_atual,data_saida,atribuicoes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Experiencia other = (Experiencia) obj;
		return Objects.equals( id_candidato, other.id_candidato)
				&& Objects.equals( tipo_contrato, other. tipo_contrato)
				&& Objects.equals( cargo, other. cargo)
				&& Objects.equals( data_inicio, other. data_inicio)
				&& Objects.equals( emprego_atual, other. emprego_atual)
				&& Objects.equals( data_saida, other. data_saida)
				&& Objects.equals( atribuicoes, other. atribuicoes);
	}
}
