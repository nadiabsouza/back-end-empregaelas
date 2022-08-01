package br.com.empregaelas.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empregaelas.adapter.DozerConverter;
import br.com.empregaelas.domain.vo.v1.ExperienciaVO;
import br.com.empregaelas.exceptions.ResourceNotFoundException;
import br.com.empregaelas.repository.EmpresaRepository;

@Service
public class ExperienciaService {

	@Autowired
	EmpresaRepository repository;

	public ExperienciaVO create(@Valid ExperienciaVO empresa) {
		var entity = DozerConverter.parseObject(empresa, ExperienciaVO.class);
		var vo = DozerConverter.parseObject(entity, ExperienciaVO.class);

		return vo;
	}

	public List<ExperienciaVO> findAll() {
		return DozerConverter.parseListObject(repository.findAll(), ExperienciaVO.class);
	}

	public ExperienciaVO findById(Long id) {
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		return DozerConverter.parseObject(entity, ExperienciaVO.class);
	}

	public void delete(Long id) {
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		repository.delete(entity);
	}

	public ExperienciaVO update(ExperienciaVO empresa) {
		var entity = repository.findById(empresa.getKey())
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));

		var vo = DozerConverter.parseObject(repository.save(entity), ExperienciaVO.class);
		return vo;
	}

}
	

	




