package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.empregaelas.enums.Pcd;
import br.com.empregaelas.enums.USER_PERMISSIONS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ee_candidato")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
	@Column(name = "tipo_permissao")
	private USER_PERMISSIONS tipoPermissao;

	@NotBlank
	@Size(max = 60)
	@Column(name = "nome")
	private String nome;

	@Size(max = 20)
	@Column(name = "nome_social")
	private String nomeSocial;

	@NotBlank
	@Column(name = "data_nasc")
	private Date dataNasc;

	@NotBlank
	@Size(max = 15)
	@Column(name = "estado_civil")
	private String estadoCivil;


	@Size(max = 50)
	@Column(name = "linkedin")
	private String linkedin;


	@Size(max = 50)
	@Column(name = "github")
	private String gitHub;


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
	@Column(name = "sexobio")
	private String sexoBio;


	@Lob 
	@Column(name = "sobre")
	private String sobre;


	@Size(max = 255)
	@Column(name = "idioma")
	private String idioma;

	@Column(name = "pretensaosalarial")
	private double pretensaoSalarial;

	@NotBlank
	@Size(max = 50)
	@Email
	@Column(name = "email")
	private String email;

	@NotBlank
	@Column(name = "datacadastro")
	private Date dataCadastro;
	
	@NotBlank
	@Size(max = 11)
	@Column(name = "telefone")
	private String telefone;

	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Endereco endereco; 
	
	@NotBlank
	@Column(name = "pcd")
	private Pcd pcd;
	


}
	






