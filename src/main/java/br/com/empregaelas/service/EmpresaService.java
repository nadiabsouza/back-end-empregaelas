package br.com.empregaelas.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empregaelas.adapter.DozerConverter;
import br.com.empregaelas.domain.vo.v1.EmpresaVO;
import br.com.empregaelas.exceptions.ResourceNotFoundException;
import br.com.empregaelas.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository repository;

	public EmpresaVO create(@Valid EmpresaVO empresa) {
		var entity = DozerConverter.parseObject(empresa, EmpresaVO.class);
		var vo = DozerConverter.parseObject(entity, EmpresaVO.class);

		return vo;
	}

	public List<EmpresaVO> findAll() {
		return DozerConverter.parseListObject(repository.findAll(), EmpresaVO.class);
	}

	public EmpresaVO findById(Long id) {
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		return DozerConverter.parseObject(entity, EmpresaVO.class);
	}

	public void delete(Long id) {
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		repository.delete(entity);
	}

	public EmpresaVO update(EmpresaVO empresa) {
		var entity = repository.findById(empresa.getKey())
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));

		entity.setCnpj(empresa.getCnpj());
		entity.setRazaoSocial(empresa.getRazaosocial());
		entity.setNomeFantasia(empresa.getNomefantasia());
		entity.setTelefone(empresa.getTelefone());
		entity.setResponsavel(empresa.getResponsavel());
		entity.setSegmento(empresa.getSegmento());
		entity.setNumFunc(empresa.getNumFunc());

		var vo = DozerConverter.parseObject(repository.save(entity), EmpresaVO.class);
		return vo;
	}

}



