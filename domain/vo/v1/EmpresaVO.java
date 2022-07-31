package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import com.github.dozermapper.core.Mapping; 
import java.util.Date;

import lombok.Data;

@Data
public class CandidatoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Mapping("id")
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String responsavel;
	private Date segmento;
	private int numeroFuncionarios;
	
	
	public void setCnpj(String cpj) {
		this.cnpj = cnpj;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setNomeFantasia(Double nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public void setNumeroFuncionarios(int numerofuncionarios) {
		this.numeroFuncionarios = numerofuncionarios;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cnpj,razaoSocial,nomeFantasia,responsavel,segmento,numeroFuncionarios); 
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
		
		
}
	}