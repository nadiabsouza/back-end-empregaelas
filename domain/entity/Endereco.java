package br.com.empregaelas.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.empregaelas.domain.vo.v1.CandidatoVO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ee_endereco")
@Data
@NoArgsConstructor
public class Endereco implements Serializable{
	

	private static final long serialVersionUID = 1L;
		
	@NotBlank
	@Size(max=11)
	@Column(name="idEndereco")
	private String idEndereco;
	
	
	@NotBlank
	@Size(max=60)
	@Column(name="logradouro")
	private String lorgadouro;
	
	@NotBlank
	@Size(max=20)
	@Column(name="num")
	private String nomeFantasia;
	
	
	@Column(name="complemento")
	private Date complemento;
	
	
	@NotBlank
	@Size(max=15)
	@Column(name="bairro")
	private String bairro;
	
	@NotBlank
	@Size(max=50)
	@Column(name="cidade")
	private String cidade;	

	@NotBlank
	@Size(max=2)
	@Column(name="uf")
	private String uf;	
	
	@NotBlank
	@Size(max=11)
	@Column(name="cep")
	private String cep;	


	public void setidEndereco(Object i2) {
		// TODO Auto-generated method stub
		
	}

	public void setendereco(Class<? extends Endereco> class1) {
		// TODO Auto-generated method stub
		
	}

	public void setnum(Object num2) {
		// TODO Auto-generated method stub
		
	}

	public void compl(Object compl2) {
		// TODO Auto-generated method stub
		
	}

	public void setbairro(Object bairro2) {
		// TODO Auto-generated method stub
		
	}

	public void setcidade(Object cidade2) {
		// TODO Auto-generated method stub
		
	}

	public void setuf(Object uf2) {
		// TODO Auto-generated method stub

	public void setcep(Object cep2) {
			// TODO Auto-generated method stub
			
	}

}
