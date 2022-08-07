package br.com.empregaelas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import br.com.empregaelas.adapter.DozerConverter;
import br.com.empregaelas.domain.entity.Candidatura;
import br.com.empregaelas.domain.vo.v1.CandidaturaVO;
import br.com.empregaelas.exceptions.ResourceNotFoundException;
import br.com.empregaelas.repository.CandidaturaRepository;


@Configuration
@Service
public class CandidaturaService {

	@Autowired
	CandidaturaRepository repository;


 
	public CandidaturaVO create(CandidaturaVO candidatura) {
        var entity = DozerConverter.parseObject(candidatura, Candidatura.class);
        var vo = DozerConverter.parseObject(repository.save(entity), CandidaturaVO.class);
        return vo;
    }

	public List<CandidaturaVO> findAll() {
		return DozerConverter.parseListObject(repository.findAll(), CandidaturaVO.class);
	}

	public CandidaturaVO findById(Long id) {
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		return DozerConverter.parseObject(entity, CandidaturaVO.class);
	}

	public void delete(Long id) {
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		repository.delete(entity);
	}

	public CandidaturaVO update(CandidaturaVO candidatura) {
		var entity = repository.findById(candidatura.getKey())
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));

		var vo = DozerConverter.parseObject(repository.save(entity), CandidaturaVO.class);
		return vo;
	}
		
}


