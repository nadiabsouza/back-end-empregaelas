package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.github.dozermapper.core.Mapping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienciaVO extends RepresentationModel<ExperienciaVO> implements Serializable { 
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Mapping("id")
	private long Key;
	private String contratante;
	private String cargo;
	private Date dataInicio;
	private Byte empregoAtual;
	private Date dataSaida;
	private String atribuicoes;
	private String linkedin;
	private String gitHub;
	private String portfolio;
	private String raca;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Key, atribuicoes, cargo, contratante, dataInicio, dataSaida,
				empregoAtual, gitHub, linkedin, portfolio, raca);
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExperienciaVO other = (ExperienciaVO) obj;
		return Key == other.Key && Objects.equals(atribuicoes, other.atribuicoes) && Objects.equals(cargo, other.cargo)
				&& Objects.equals(contratante, other.contratante) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(dataSaida, other.dataSaida) && Objects.equals(empregoAtual, other.empregoAtual)
				&& Objects.equals(gitHub, other.gitHub) && Objects.equals(linkedin, other.linkedin)
				&& Objects.equals(portfolio, other.portfolio) && Objects.equals(raca, other.raca);
	}
	

}

// nadia
