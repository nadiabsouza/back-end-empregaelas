package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import com.github.dozermapper.core.Mapping; 
import java.util.Date;

import lombok.Data;

@Data
public class EnderecoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Mapping("id")
	private String idEndereco;
	private String logradouro;
	private String numero;
	private String complemento;
	private Date bairro;
	private String cidade;
	private String uf;
	private String cep;
	

	public void setIdEndereco(String idEndereco) {
		this.idEndereco = idEndereco;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idendereco,logradouro,numero,complemento,bairro,cidade,uf,cep); 
	}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EnderecoVO other = (EnderecoVO) obj;
			Object idEndereco;
			return Objects.equals(idEndereco, other.idEndereco) && Objects.equals(logradouro, other.logradouro) && Objects.equals(numero, other.numero)
					&& Objects.equals(complemento, other.complemento) && Objects.equals(bairro, other.bairro) && Objects.equals(cidade, other.cidade)
					&& Objects.equals(uf, other.uf) && Objects.equals(cep, other.cep); 
		
		
}
	}


