package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.empregaelas.enums.USER_PERMISSIONS;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ee_candidato")
@Data
@NoArgsConstructor
public class Candidato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@NotBlank
	@Size(max = 11)
	@Column(name = "cpf")
	private String cpf;

	@NotBlank
	@Size(max = 50)
	@Column(name = "senha")
	private String senha;

	@NotBlank
	@Size(max = 50)
	@Column(name = "tipo_permissao")
	private USER_PERMISSIONS tipoPermissao;
	
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
	private Endereco endereco;
	
	@NotNull
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_experiencia", referencedColumnName = "id_experiencia")
	private Experiencia experiencia;
	
	@NotNull
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_formacao_academica", referencedColumnName = "id_formacao_academica")
	private FormacaoAcademica formacaoAcademica;

	@NotBlank
	@Size(max = 60)
	@Column(name = "nome")
	private String nome;

	@NotBlank
	@Size(max = 20)
	@Column(name = "nome_social")
	private String nome_social;

	@Column(name = "data_nasc")
	private Date data_nasc;

	@NotBlank
	@Size(max = 11)
	@Column(name = "telefone")
	private String telefone;
	
	@NotBlank
	@Size(max = 15)
	@Column(name = "estado_civil")
	private String estado_civil;

	@NotBlank
	@Size(max = 50)
	@Column(name = "linkedin")
	private String linkedin;

	@NotBlank
	@Size(max = 50)
	@Column(name = "github")
	private String github;

	@NotBlank
	@Size(max = 50)
	@Column(name = "portfolio")
	private String portfolio;

	@NotBlank
	@Size(max = 10)
	@Column(name = "raca")
	private String raca;

	@NotBlank
	@Size(max = 20)
	@Column(name = "genero")
	private String genero;

	@NotBlank
	@Size(max = 9)
	@Column(name = "sexo_bio")
	private String sexo_bio;

	@NotBlank
	@Lob
	@Size(max = 255)
	@Column(name = "sobre")
	private String sobre;

	@NotBlank
	@Size(max = 50)
	@Column(name = "idioma")
	private String idioma;

	@Column(name = "pretensao_salarial")
	private double pretensao_salarial;

	@NotBlank
	@Size(max = 50)
	@Email
	@Column(name = "email")
	private String email;
	
	@Column(name = "data_cadastro")
	private Date data_cadastro;
	

	public Candidato(Long id, @NotBlank @Size(max = 11) String cpf,
			@NotBlank @Size(max = 50) String senha,
			@NotBlank @Size(max = 50) USER_PERMISSIONS tipoPermissao,
			@NotNull Endereco endereco,
			@NotNull Experiencia experiencia,
			@NotNull FormacaoAcademica formacaoAcademica,
			@NotBlank @Size(max = 60) String nome,
			@NotBlank @Size(max = 20) String nome_social,
			Date data_nasc, @NotBlank @Size(max = 11) String telefone,
			@NotBlank @Size(max = 15) String estado_civil,
			@NotBlank @Size(max = 50) String linkedin,
			@NotBlank @Size(max = 50) String github,
			@NotBlank @Size(max = 50) String portfolio,
			@NotBlank @Size(max = 10) String raca,
			@NotBlank @Size(max = 20) String genero,
			@NotBlank @Size(max = 9)  String sexo_bio,
			@NotBlank @Size(max = 255) String sobre,
			@NotBlank @Size(max = 50) String idioma,
			double pretensao_salarial,
			@NotBlank @Size(max = 50) @Email String email) {

		this.id = id;
		this.senha = senha;
		this.tipoPermissao = tipoPermissao;
		this.endereco = endereco;
		this.experiencia = experiencia;
		this.formacaoAcademica = formacaoAcademica;
		this.nome = nome;
		this.nome_social = nome_social;
		this.telefone = telefone;
		this.estado_civil = estado_civil;
		this.linkedin = linkedin;
		this.github = github;
		this.portfolio = portfolio;
		this.raca = raca;
		this.genero = genero;
		this.sexo_bio = sexo_bio;
		this.sobre = sobre;
		this.idioma = idioma;
		this.pretensao_salarial = pretensao_salarial;
		this.email = email;
		
	}
		
	@Override
	public int hashCode() { 
		return Objects.hash(senha,tipoPermissao,endereco,experiencia,formacaoAcademica,nome,nome_social,telefone,
				 estado_civil,linkedin,github,portfolio,raca,genero,sexo_bio,sobre,idioma,pretensao_salarial,email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals( senha, other. senha)
				&& Objects.equals( tipoPermissao, other. tipoPermissao)
				&& Objects.equals( endereco, other. endereco)
				&& Objects.equals( experiencia, other. experiencia)
				&& Objects.equals( formacaoAcademica, other. formacaoAcademica)
				&& Objects.equals( nome, other. nome)
				&& Objects.equals( nome_social, other. nome_social)
				&& Objects.equals( telefone, other. telefone)
				&& Objects.equals( estado_civil, other. estado_civil)
				&& Objects.equals( linkedin, other. linkedin)
				&& Objects.equals( github, other. github)
				&& Objects.equals( portfolio, other. portfolio)
				&& Objects.equals( raca, other. raca)
				&& Objects.equals( genero, other. genero)
				&& Objects.equals( sexo_bio, other. sexo_bio)
				&& Objects.equals( sobre, other. sobre)
				&& Objects.equals( idioma, other. idioma)
				&& Objects.equals( pretensao_salarial, other. pretensao_salarial)
				&& Objects.equals( email, other. email);
	}
	
}
