package br.com.empregaelas.service;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.empregaelas.adapter.DozerConverter;
import br.com.empregaelas.domain.entity.Empresa;
import br.com.empregaelas.domain.vo.v1.EmpresaVO;
import br.com.empregaelas.exception.ResourceNotFoundException;
import br.com.empregaelas.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	EmpresaRepository repository;
	
	public EmpresaVO inserir( EmpresaVO empresa) {
		var entity = DozerConverter.parseObject(empresa,EmpresaVO.class);
		var vo = DozerConverter.parseObject(entity, EmpresaVO.class);
//		repository.save(empresa);
		return vo;
	}
	
	public List<EmpresaVO>buscarTodos(){
		return DozerConverter.parseListObject(repository.findAll(),EmpresaVO.class);
	}
	
	public EmpresaVO buscarPorId(Long id) {
		var entity = repository.findById(id)
		.orElseThrow(() -> 
		new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		return DozerConverter.parseObject(entity, EmpresaVO.class);
	}
	
	public void delete(Long id) {
		var entity = repository.findById(id)
		.orElseThrow(() -> 
		new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		repository.delete(entity);
	}
	
	 public EmpresaVO atualizar(EmpresaVO empresa) {
		var entity = repository.findById(empresa.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));
		
		
		
		entity.setCnpj(empresa.getCnpj()); 
		entity.setRazaoSocial(empresa.getRazaoSocial());
	    entity.setNomeFantasia(empresa.getNomeFantasia());
		entity.setResponsavel(empresa.getResponsavel());
		entity.setSegmento(empresa.getSegmento());
		entity.setNumFunc(empresa.getNumFunc());
		
	
		
		var vo = DozerConverter.parseObject(repository.save(entity), EmpresaVO.class);
		return vo;
	}
	
	
}

