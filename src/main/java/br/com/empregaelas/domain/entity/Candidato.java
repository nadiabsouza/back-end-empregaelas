package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
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
	@Size(max = 255)
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
	
	

	
	
}
