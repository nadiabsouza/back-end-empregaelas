package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
	@Column(name="id")
	private long id;

	
	@NotBlank
	@Size(max=1)
	@Column(name="publicada")
	private Byte publicada;
	
	@NotBlank
	@Column(name="data_publicacao")
	private Date data_publicacao;
		
		
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
	@Column(name="salario")
	private double salario;
		
	@NotBlank
	@Size(max=9)
	@Column(name="tipo_contrato")
	private String tipo_contrato;
		
	@NotBlank
	@Size(max=30)
	@Column(name="modalidade")
	private String modalidade;
		
	@NotBlank
	@Lob
	@Column(name="descr_vaga")
	private String descr_vaga;
		
	@NotBlank
	@Lob
	@Column(name="requisitos")
	private String requisitos;
		
	@NotBlank
	@Lob
	@Column(name="desejavel")
	private String desejavel;
		
	@NotBlank
	@Lob
	@Column(name="benificios")
	private String beneficios;
		
	@NotBlank
	@Size(max=2)
	@Column(name="uf")
	private char uf;
		
	@NotBlank
	@Size(max=30)
	@Column(name="cidade")
	private String cidade;
		
	@NotBlank
	@Size(max=30)
	@Column(name="bairro")
	private String bairro;
		
	@NotBlank
	@Size(max=10)
	@Column(name="cep")
	private char cep;
	
	@NotBlank
	@Size(max=1)
	@Column(name="exibir_empresa")
	private char exibir_empresa;

	@OneToMany(mappedBy = "vaga")
    Set<Candidatura> candidatura;
	
	@ManyToOne
    @JoinColumn(name="id", nullable=false)
	private Empresa empresa;
		
	public Vaga(@NotBlank Long id, 
			@NotBlank @Size(max = 1) Byte publicada,
			@NotBlank Date data_publicacao,
			@NotBlank @Size(max = 30) String cargo,
			@NotBlank @Size(max = 20) String nivel,
			@NotBlank @Size(max = 30) String jornada,
			@NotBlank double salario,
			@NotBlank @Size(max = 9) String tipo_contrato,
			@NotBlank @Size(max = 30) String modalidade,
			@NotBlank String descr_vaga,
			@NotBlank String requisitos,
			@NotBlank String desejavel,
			@NotBlank String beneficios,
			@NotBlank @Size(max = 2) char uf,
			@NotBlank @Size(max = 30) String cidade,
			@NotBlank @Size(max = 30) String bairro,
			@NotBlank @Size(max = 10) char cep,
			@NotBlank @Size(max = 1) char exibir_empresa)
{

		this.id = id;
		this.publicada = publicada;
		this.data_publicacao = data_publicacao;
		this.cargo = cargo;
		this.nivel = nivel;
		this.jornada = jornada;
		this.salario = salario;
		this.modalidade = modalidade;
		this.descr_vaga = descr_vaga;
		this.requisitos = requisitos;
		this.desejavel = desejavel;
		this.beneficios = beneficios;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.exibir_empresa = exibir_empresa;
	}
		
	@Override
	public int hashCode() { 
		return Objects.hash(publicada, data_publicacao,cargo,nivel, jornada,salario,modalidade,descr_vaga,   
				requisitos,desejavel,beneficios, uf, cidade, bairro, cep,exibir_empresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaga other = (Vaga) obj;
		return Objects.equals( publicada, other.publicada)
				&& Objects.equals( data_publicacao, other. data_publicacao)
				&& Objects.equals( cargo, other. cargo)
				&& Objects.equals( nivel, other. nivel)
				&& Objects.equals( jornada, other. jornada)
				&& Objects.equals( salario, other. salario)
				&& Objects.equals( modalidade, other. modalidade)
				&& Objects.equals( descr_vaga, other. descr_vaga)
				&& Objects.equals( requisitos, other. requisitos)
				&& Objects.equals( beneficios, other. beneficios)
				&& Objects.equals( uf, other. uf)
				&& Objects.equals( cidade, other. cidade)
				&& Objects.equals( bairro, other. bairro)
				&& Objects.equals( cep, other. cep)
				&& Objects.equals( exibir_empresa, other. exibir_empresa)
				;
	}

	
}




















