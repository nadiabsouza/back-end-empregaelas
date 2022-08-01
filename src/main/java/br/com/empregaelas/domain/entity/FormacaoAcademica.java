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
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ee_fa")
@Data
@NoArgsConstructor
public class FormacaoAcademica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@NotBlank
	@JoinColumn(name= "id_candidato")
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
	
	@NotBlank
	@Column(name = "data_inicio")
	private Date data_inicio;
	
	@NotBlank
	@FutureOrPresent
	@Column(name = "data_final")
	private Date data_final;
	
	
	@NotBlank
	@Lob 
	@Column(name = "informacoes_adicionais")
	private String informacoes_adicionais;
	
	public FormacaoAcademica(@NotBlank Long id, 
			@NotBlank long id_candidato,
			@NotBlank @Size(max = 13) String formacao,
			@NotBlank @Size(max = 20) String curso,
			@NotBlank @Size(max = 30) String instituicao,
			@NotBlank Date data_inicio,
			@NotBlank @FutureOrPresent Date data_final,
			String informacoes_adicionais)
{

		this.id = id;
		this.id_candidato = id_candidato;
		this.formacao = formacao;
		this.curso = curso;
		this.instituicao = instituicao;
		this.data_inicio = data_inicio;
		this.data_final = data_final;
		this.informacoes_adicionais = informacoes_adicionais;
	}
		
	@Override
	public int hashCode() { 
		return Objects.hash(id_candidato, formacao,curso,
				instituicao,data_inicio,data_final,informacoes_adicionais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormacaoAcademica other = (FormacaoAcademica) obj;
		return Objects.equals( id_candidato, other.id_candidato)
				&& Objects.equals( formacao, other. formacao)
				&& Objects.equals( curso, other. curso)
				&& Objects.equals( instituicao, other. instituicao)
				&& Objects.equals( data_final, other. data_final)
				&& Objects.equals( informacoes_adicionais, other. informacoes_adicionais);
	}
}

