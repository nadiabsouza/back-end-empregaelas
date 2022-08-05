package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ee_vaga")
@Data
@NoArgsConstructor
	public class Vaga implements Serializable{


		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private long id;

		@NotBlank
		@ManyToOne
		@JoinColumn(name = "id_empresaV")
		private Empresa empresa;
		
		// *********** falar com Flavia sobre relacionamento ***********************
		

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


		@Size(max=255)
		@Column(name="descrvaga")
		private String descrVaga;


		@Column(name="requisitos")
		private String requisitos;


		@Size(max=30)
		@Column(name="desejavel")
	    private String desejavel;


		@Size(max=30)
		@Column(name="beneficios")
	    private String beneficios;


//		@Size(max=2)
//		@Column(name="uf")
//	    private Byte uf;


		@Size(max=30)
		@Column(name="cidade")
	    private String cidade;


		@Size(max=30)
		@Column(name="bairro")
	    private String bairro;


		@Size(max=10)
		@Column(name="cep")
	    private String cep;

	}



