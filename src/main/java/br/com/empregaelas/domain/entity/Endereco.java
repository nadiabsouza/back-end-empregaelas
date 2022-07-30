package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ee_endereco")


public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@NotBlank
	@Size(max = 50)
	@Column(name= "logradouro")
	private String logradouro;

	@NotBlank
	@Size(max = 5)
	@Column(name= "num")
	private String num;
	
	@Size(max = 50)
	@Column(name= "compl")
	private String compl;

	@NotBlank
	@Size(max = 50)
	@Column(name= "bairro")
	private String bairro;
	
	@NotBlank
	@Size(max = 50)
	@Column(name= "cidade")
	private String cidade;
	
	@NotBlank
	@Size(max = 2)
	@Column(name= "uf")
	private String uf;
	
	@NotBlank
	@Size(max = 10)
	@Column(name= "cep")
	private String cep;
	
	
	public Endereco(@NotBlank Long id, 
			@NotBlank @Size(max = 50) String logradouro,
			@NotBlank @Size(max = 5) String num,
			@NotBlank @Size(max = 50) String compl,
			@NotBlank @Size(max = 50) String bairro,
			@NotBlank @Size(max = 50) String cidade,
			@NotBlank @Size(max = 2) String uf,
			@NotBlank @Size(max = 10) String cep)
{

		this.id = id;
		this.logradouro = logradouro;
		this.num = num;
		this.compl = compl;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
		
	@Override
	public int hashCode() { 
		return Objects.hash(logradouro, num,compl,
				bairro,cidade,uf,cep);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals( logradouro, other.logradouro)
				&& Objects.equals( num, other. num)
				&& Objects.equals( compl, other. compl)
				&& Objects.equals( bairro, other. bairro)
				&& Objects.equals( cidade, other. cidade)
				&& Objects.equals( uf, other. uf)
				&& Objects.equals( cep, other. cep);
	}

}


