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
@Table(name="ee_vagas")
@Data
@NoArgsConstructor
public class Vagas implements Serializable{
	

	private static final long serialVersionUID = 1L;
		
	@NotBlank
	@Size(max=20)
	@Column(name="idVaga")
	private String idVaga;
	
	@NotBlank
	@Size(max=20)
	@Column(name="idUsuario")
	private String idUsuario;
	
	
	@NotBlank
	@Size(max=60)
	@Column(name="publicada")
	private String publicada;
	
	@NotBlank
	@Size(max=20)
	@Column(name="dataPublicacao")
	private Date dataPublicacao;
	
	
	@NotBlank 
	@Size (max=20)
	@Column(name="cargo")
	private Date cargo;
	
	
	@NotBlank
	@Size(max=20)
	@Column(name="nivel")
	private String nivel;
	
	@NotBlank
	@Size(max=50)
	@Column(name="jornada")
	private String jornada;	

	@NotBlank
	@Size(max=2)
	@Column(name="salario")
	private String salario;	
	
	@NotBlank
	@Size(max=11)
	@Column(name="tipoContrato")
	private String tipoContrato;
	
	@NotBlank
	@Size(max=11)
	@Column(name="modalidade")
	private String modalidade;	
	
	@NotBlank
	@Size(max=100)
	@Column(name="descrVaga")
	private String descrVaga;	
	
	@NotBlank
	@Size(max=100)
	@Column(name="requisitos")
	private String requisitos;	

	@NotBlank
	@Size(max=11)
	@Column(name="requisitos")
	private String requisitos;	
	
	@NotBlank
	@Size(max=11)
	@Column(name="desejavel")
	private String desejavel;	
	
	@NotBlank
	@Size(max=100)
	@Column(name="beneficios")
	private String beneficios;	

	@NotBlank
	@Size(max=2)
	@Column(name="uf")
	private String uf;	
	
	@NotBlank
	@Size(max=20)
	@Column(name="cidade")
	private String cidade;	
	
	@NotBlank
	@Size(max=15)
	@Column(name="bairro")
	private String bairro;	
	
	@NotBlank
	@Size(max=10)
	@Column(name="cep")
	private String cep;	



	public void setidVaga(Object idVaga2) {
		// TODO Auto-generated method stub
		
	}

	public void setidUsuario(Object idUsuario ) {
		// TODO Auto-generated method stub
		
	}

	public void setpublicada(Object publicada2) {
		// TODO Auto-generated method stub
		
	}

	public void setcargo(Object cargo2) {
		// TODO Auto-generated method stub
		
	}

	public void setnivel(Object nivel2) {
		// TODO Auto-generated method stub
		
	}

	public void setjornada(Object jornada2) {
		// TODO Auto-generated method stub
		
	}

	public void setsalario(Object salario2) {
		// TODO Auto-generated method stub
		
	}

	public void settipoContrato(Object tipoContrato2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setmodalidade(Object modalidade2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setdescrVaga(Object descrVaga2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setrequisitos(Object requisitos2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setdesejavel(Object desejavel2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setbeneficios(Object beneficios2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setuf(Object uf2) {
		// TODO Auto-generated method stub
		
	}

	public void setcidade(Object cidade2) {
		// TODO Auto-generated method stub
		
	}

	public void setbairro(Object bairro2) {
		// TODO Auto-generated method stub
		
	}
	
	public void setcep(Object cep2) {
		// TODO Auto-generated method stub
		
	}
}
