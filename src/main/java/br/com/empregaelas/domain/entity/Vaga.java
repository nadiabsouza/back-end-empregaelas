package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ee_vaga")
@Data
@NoArgsConstructor
public class Vaga implements Serializable{
		

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_vaga")
	private long id;
		

	@NotBlank
	@Size(max=1)
	@Column(name="publicada")
	private int publicada;
		
	@Size(max=8)
	@Column(name="datapublicacao")
	private Date dataPublicacao;
		
		
	@NotBlank
	@Size(max=30)
	@Column(name="cargo")
	private String cargo;
		
		
	@NotBlank
	@Size(max=20)
	@Column(name="nivel")
	private String nivel;
		
	@NotBlank
	@Size(max=30)
	@Column(name="jornada")
	private String jornada;
		
	@NotBlank
	@Size(max=30)
	@Column(name="salario")
	private double salario;
		
	@NotBlank
	@Size(max=9)
	@Column(name="tipo_contrato")
	private String tipoContrato;
		
	@NotBlank
	@Size(max=30)
	@Column(name="modalidade")
	private String modalidade;
		
	@NotBlank
	@Size(max=255)
	@Column(name="descrvaga")
	private String descrVaga;
		

	@Column(name="requisitos")
	private String requisitos;
		
		
	@Size(max=30)
	@Column(name="desejavel")
	private String desejavel;
		
		
	@Size(max=30)
	@Column(name="benificios")
	private String beneficios;
		
		
	@Size(max=2)
	@Column(name="uf")
	private char uf;
		
		
	@Size(max=30)
	@Column(name="cidade")
	private String cidade;
		
		
	@Size(max=30)
	@Column(name="bairro")
	private String bairro;
		
		
	@Size(max=10)
	@Column(name="cep")
	private char cep;

	@OneToMany(mappedBy = "vaga")
    Set<Candidatura> candidatura;
		
}




















