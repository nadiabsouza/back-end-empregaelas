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
public class VagaVO extends RepresentationModel<VagaVO> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Mapping("id")
	private long Key;
	private int publicada;
	private Date dataPublicacao;
	private String cargo;
	private String nivel;
	private String jornada;
	private String tipoContrato;
	private String descrVaga;
	private String requisitos;
	private String desejavel;
	private String beneficios;
	private String uf;
	private String cidade;
	private String bairro;
	private char cep;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Key, bairro, beneficios, cargo, cep, cidade, dataPublicacao, descrVaga,
				desejavel, jornada, nivel, publicada, requisitos, tipoContrato, uf);
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
		VagaVO other = (VagaVO) obj;
		return Key == other.Key && Objects.equals(bairro, other.bairro) && Objects.equals(beneficios, other.beneficios)
				&& Objects.equals(cargo, other.cargo) && cep == other.cep && Objects.equals(cidade, other.cidade)
				&& Objects.equals(dataPublicacao, other.dataPublicacao) && Objects.equals(descrVaga, other.descrVaga)
				&& Objects.equals(desejavel, other.desejavel) && Objects.equals(jornada, other.jornada)
				&& Objects.equals(nivel, other.nivel) && publicada == other.publicada
				&& Objects.equals(requisitos, other.requisitos) && Objects.equals(tipoContrato, other.tipoContrato)
				&& Objects.equals(uf, other.uf);
	}

}
		
		
//nadia