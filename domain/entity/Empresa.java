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
@Table(name="ee_empresa")
@Data
@NoArgsConstructor
public class Empresa implements Serializable{
	

	private static final long serialVersionUID = 1L;
		
	@NotBlank
	@Size(max=11)
	@Column(name="cnpj")
	private String cnpj;
	
	
	@NotBlank
	@Size(max=60)
	@Column(name="razaoSocial")
	private String razaoSocial;
	
	@NotBlank
	@Size(max=20)
	@Column(name="nomeFantasia")
	private String nomeFantasia;
	
	
	@Column(name="responsavel")
	private Date responsavel;
	
	
	@NotBlank
	@Size(max=15)
	@Column(name="segmento")
	private String segmento;
	
	@NotBlank
	@Size(max=50)
	@Column(name="numFunc")
	private String numFunc;	


	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}

	public void setempresa(Class<? extends Empresa> class1) {
		// TODO Auto-generated method stub
		
	}

	public void setcnpj(Object cnpj2) {
		// TODO Auto-generated method stub
		
	}

	public void setrazaoSocial(Object razaoSocial2) {
		// TODO Auto-generated method stub
		
	}

	public void setnomeFantasia(Object nomeFantasia2) {
		// TODO Auto-generated method stub
		
	}

	public void setresponsavel(Object responsavel2) {
		// TODO Auto-generated method stub
		
	}

	public void setsegmento(Object segmento2) {
		// TODO Auto-generated method stub
		
	}

	public void setnumFunc(Object numFunc2) {
		// TODO Auto-generated method stub
		
	}


}
