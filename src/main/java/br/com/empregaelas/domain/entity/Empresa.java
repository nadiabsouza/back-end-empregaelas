package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="ee_empresa")
@Data
@NoArgsConstructor
public class Empresa implements Serializable{
		
	
	private static final long serialVersionUID = 1L;


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@NotBlank
		@Column(name="id")
		private Long id;
		
		
		@NotBlank
		@Size(max=14)
		@Column(name="cnpj")
		private String cnpj;
		
		@NotBlank
		@Size(max = 50)
		@Column(name = "senha")
		private String senha;

		
		@NotNull
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
		private Endereco endereco;
		
		
		@NotBlank
		@Size(max = 50)
		@Column(name = "tipo_permissao")
		private USER_PERMISSIONS tipoPermissao;
		
		@NotBlank
		@Size(max = 50)
		@Email
		@Column(name = "email_usuario")
		private String email;
		
		@NotBlank
		@Size(max=60)
		@Column(name="razao_social")
		private String razaoSocial;
		
		@NotBlank
		@Size(max=20)
		@Column(name="nome_fantasia")
		private String nomeFantasia;
		
		
		@NotBlank
		@Size(max=11)
		@Column(name="telefone")
		private String telefone;
		
		@NotBlank
		@Size(max=50)
		@Column(name="responsavel")
		private String responsavel;
		
		@NotBlank
		@Size(max=60)
		@Column(name="segmento")
		private String segmento;
		
		@NotBlank
		@Size(max=50)
		@Column(name="num_func")
		private int numFunc;
		
		@NotBlank
		@Column(name = "data_cadastro")
		private Date data_cadastro;
		
		@OneToMany(mappedBy="empresa")
		private Set<Vaga> vagas;
  
		
		public Empresa(@NotBlank Long id, 
				@NotBlank @Size(max = 14) String cnpj,
				@NotBlank @Size(max = 50) String senha,
				@NotBlank @Size(max = 50) USER_PERMISSIONS tipoPermissao,
				@NotNull Endereco endereco,
				@NotBlank @Size(max = 50) String email,
				@NotBlank @Size(max = 60) String razaoSocial,
				@NotBlank @Size(max = 20) String nomeFantasia,
				@NotBlank @Size(max = 11) String telefone,
				@NotBlank @Size(max = 50) String responsavel,
				@NotBlank @Size(max = 60) String segmento,
				@NotBlank @Size(max = 50) int numFunc,
				@NotBlank Date data_cadastro)
{

			this.id = id;
			this.cnpj = cnpj;
			this.senha = senha;
			this.tipoPermissao = tipoPermissao;
			this.endereco = endereco;
			this.email = email;
			this.razaoSocial = razaoSocial;
			this.nomeFantasia = nomeFantasia;
			this.telefone = telefone;
			this.responsavel = responsavel;
			this.segmento = segmento;
			this.numFunc = numFunc;
			this.data_cadastro = data_cadastro;
			

		}
			
		@Override
		public int hashCode() { 
			return Objects.hash(cnpj, senha,tipoPermissao,endereco,email,razaoSocial,nomeFantasia,
					telefone, responsavel, segmento, numFunc, data_cadastro);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Empresa other = (Empresa) obj;
			return Objects.equals( senha, other.senha)
					&& Objects.equals( tipoPermissao, other. tipoPermissao)
					&& Objects.equals( endereco, other. endereco)
					&& Objects.equals( email, other. email)
					&& Objects.equals( razaoSocial, other. razaoSocial)
					&& Objects.equals( nomeFantasia, other. nomeFantasia)
					&& Objects.equals( telefone, other. telefone)
					&& Objects.equals( responsavel, other. responsavel)
					&& Objects.equals( segmento, other. segmento)
					&& Objects.equals( numFunc, other. numFunc)
					&& Objects.equals( data_cadastro, other. data_cadastro);
		}

		
}






