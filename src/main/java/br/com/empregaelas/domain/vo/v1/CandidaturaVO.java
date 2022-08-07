package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.github.dozermapper.core.Mapping;
 

public class CandidaturaVO extends RepresentationModel<CandidaturaVO> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Mapping("id")
	private long Key;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Key);
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
		CandidaturaVO other = (CandidaturaVO) obj;
		return Key == other.Key ;
	}

	public Long getKey() {
		// TODO Auto-generated method stub
		return null;
	}

}


