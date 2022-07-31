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
import br.com.empregaelas.domain.entity.Endereco;
import br.com.empregaelas.domain.vo.v1.EnderecoVO;
import br.com.empregaelas.exception.ResourceNotFoundException;
import br.com.empregaelas.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	EnderecoRepository repository;
	
	public EnderecoVO inserir( EnderecoVO Endereco) {
		var entity = DozerConverter.parseObject(endereco,EnderecoVO.class);
		var vo = DozerConverter.parseObject(entity, EnderecoVO.class);
//		repository.save(endereco);
		return vo;
	}
	
	public List<EnderecoVO>buscarTodos(){
		return DozerConverter.parseListObject(repository.findAll(),EnderecoVO.class);
	}
	
	public EnderecoVO buscarPorId(Long id) {
		var entity = repository.findById(id)
		.orElseThrow(() -> 
		new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		return DozerConverter.parseObject(entity, EnderecoVO.class);
	}
	
	public void delete(Long id) {
		var entity = repository.findById(id)
		.orElseThrow(() -> 
		new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		repository.delete(entity);
	}
	
	 public EnderecoVO atualizar(EnderecoVO endereco) {
		var entity = repository.findById(endereco.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));
		
		
		
		entity.setIdEndereco(endereco.getIdEndereco()); 
		entity.setLogradouro(endereco.getLogradouro());
	    entity.setNumero(endereco.getNumero());
		entity.setComplemento(endereco.getComplemento());
		entity.setBairro(endereco.getComplemento());
		entity.setCidade(endereco.getCidade());
		entity.setUf(endereco.getUf());
		entity.setCep(endereco.getCep());
		
		
		var vo = DozerConverter.parseObject(repository.save(entity), EnderecoVO.class);
		return vo;
	}
	
	
}



