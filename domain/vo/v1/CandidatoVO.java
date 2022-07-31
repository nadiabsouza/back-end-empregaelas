package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import com.github.dozermapper.core.Mapping; 
import java.util.Date;

import lombok.Data;

@Data
public class CandidatoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Mapping("id")
	private Long key; 
	private String cpf;
	private String nome;
	private String nomeSocial;
	private Date dataNasc;
	private String estadoCivil;
	private String linkedin;
	private String gitHub;
	private String portfolio;
	private String raca;
	private String genero;
	private String sexoBio;
	private String sobre;
	private String idioma;
	private Double pretensaoSalarial;
    private Date dataCadastro;
	public Long getId() {
		public void setcpf(String cpf) {
			this.cpf = cpf;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setnomeSocial(String nomeSocial) {
			this.nomeSocial = nomeSocial;
		}
		public void setdataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}
		public void setestadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		public void setlinkeding(String linkedin) {
			this.linkedin = linkedin;
		}
		
		public void setgitHub(String gitHub) {
			this.gitHub = gitHub;
		}
		
		public void setPortifolio(String portifolio) {
			this.portifolio = portifolio;
		}
		
		public void setraca(String raca) {
			this.raca = raca;
		}
		
		public void setgenero(String genero) {
			this.genero = genero;
		}
		
		public void setsexoBio(String sexoBio) {
			this.sexoBio = sexoBio;
		}
		
		public void setSobre(String sobre) {
			this.sobre = sobre;
		}
		
		public void setlidiomas(String idiomas) {
			this.idiomas = idiomas;
		}
		
		public void setPretencaoSalarial(Double pretencaoSalarial) {
			this.pretencaoSalarial = pretencaoSalarial;
		}
		
		public void setFormacaoesAcademicasomas(List fomacoesAcademicas) {
			this.formacoesAcademicas = formacoesAcademicas;
		}
		
		public void setDataCadastro(Date dataCadastro) {
			this.dataCadastro = dataCadastro;
		}		
		@Override
		public int hashCode() {
			return Objects.hash(cpf,nome,nomeSocial,dataNasc,estadoCivil,linkedin,gitHub,portifolio,raca,genero,sexoBio,sobre,idiomas,pretencaoSalarial,formacaoAcademicas,dataCadastro,); 
		}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				EmpresaVO other = (EmpresaVO) obj;
				return Objects.equals(cnpj, other.cnpj) && Objects.equals(razaoSocial, other.razaoSocial) && Objects.equals(nomeFantasia, other.nomeFantasia)
						&& Objects.equals(responsavel, other.responsavel) && Objects.equals(segmento, other.segmento) && Objects.equals(numeroFuncionarios, other.numeroFuncionarios);
			
			//teste 
	}
		}