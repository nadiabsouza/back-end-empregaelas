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
import br.com.empregaelas.domain.entity.Vagas;
import br.com.empregaelas.domain.vo.v1.VagasVO;
import br.com.empregaelas.domain.vo.v1.VagasVO;
import br.com.empregaelas.exception.ResourceNotFoundException;
import br.com.empregaelas.repository.VagasRepository;

@Service
public class VagasService {
	
	@Autowired
	VagasRepository repository;
	
	public VagasVO inserir( VagasVO vagas) {
		var entity = DozerConverter.parseObject(vagas,VagasVO.class);
		var vo = DozerConverter.parseObject(entity, VagasVO.class);
//		repository.save(vagas);
		return vo;
	}
	
	public List<VagasVO>buscarTodos(){
		return DozerConverter.parseListObject(repository.findAll(),VagasVO.class);
	}
	
	public VagasVO buscarPorId(Long id) {
		var entity = repository.findById(id)
		.orElseThrow(() -> 
		new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		return DozerConverter.parseObject(entity, VagasVO.class);
	}
	
	public void delete(Long id) {
		var entity = repository.findById(id)
		.orElseThrow(() -> 
		new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
		repository.delete(entity);
	}
	
	 public VagasVO atualizar(VagasVO vagas) {
		var entity = repository.findById(vagas.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));
		
		
		
		entity.setIdVaga(vaga.getIdVaga()); 
		entity.setIdUsuario(vaga.getIdUsuario());
	    entity.setPublicada(vaga.getPublicada());
	    entity.setDataPublicacao(vaga.getDataPublicacao());
		entity.setCargo(vaga.getCargo());
		entity.setNivel(vaga.getNivel());
		entity.setJornada(vaga.getJornada());
		entity.setSalario(vaga.getSalario());
		entity.setTipoContrato(vaga.getTipoContrato());
		entity.setModalidade(vaga.getModalidade());
		entity.setDescricaoVaga(vaga.getDescricaoVaga());
		entity.setRequisitos(vaga.getRequisitos());
		entity.setDesejavel(vaga.getDesejavel());
		entity.setBeneficios(vaga.getBeneficios());
		entity.setUf(vaga.getUf());
		entity.setCidade(vaga.getCidade());
		entity.setBairro(vaga.getBairro());
		entity.setCep(vaga.getCep());
		entity.setExibirEmpresa(vaga.getExibirEmpresa());
	
		
		var vo = DozerConverter.parseObject(repository.save(entity), VO.class);
		return vo;
	}
	
	
}



