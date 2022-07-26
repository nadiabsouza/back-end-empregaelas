package br.com.empregaelas.service;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empregaelas.adapter.DozerConverter;
import br.com.empregaelas.domain.entity.Vaga;
import br.com.empregaelas.exceptions.ResourceNotFoundException;
import br.com.empregaelas.repository.VagaRepository;

@Service
public class VagaService {
	

			@Autowired
			VagaRepository repository;
			
			
			public Vaga create( Vaga vaga) {
				var entity = DozerConverter.parseObject(vaga,Vaga.class);
				var vo = DozerConverter.parseObject(entity, Vaga.class);
			repository.save(vaga);
				return vo;
			}
			
		
			public List<Vaga>findAll(){
				return DozerConverter.parseListObject(repository.findAll(),Vaga.class);
			}
			
			public Vaga findById(Long id) {
				var entity = repository.findById(id)
				.orElseThrow(() -> 
				new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
				return DozerConverter.parseObject(entity, Vaga.class);
			}
			
			public void delete(Long id) {
				var entity = repository.findById(id)
				.orElseThrow(() -> 
				new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
				repository.delete(entity);
			}
			
			 public Vaga update(Vaga vaga) {
				var entity = repository.findById(vaga.getId())
						.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));
				
				
				
				entity.setPublicada(vaga.getPublicada()); 
			    entity.setDataPublicacao(vaga.getDataPublicacao());
				entity.setCargo(vaga.getCargo());
				entity.setNivel(vaga.getNivel());
				entity.setJornada(vaga.getJornada());
				entity.setSalario(vaga.getSalario());
				entity.setTipoContrato(vaga.getTipoContrato());
				entity.setModalidade(vaga.getModalidade());
				entity.setDescrVaga(vaga.getDescrVaga());
				entity.setRequisitos(vaga.getRequisitos());
				entity.setBeneficios(vaga.getBeneficios());
				entity.setUf(vaga.getUf());
				entity.setBairro(vaga.getBairro());
				entity.setCep(vaga.getCep());
				entity.setCidade(vaga.getCidade());
				entity.setCidade(vaga.getCidade());
				entity.setCidade(vaga.getCidade());
				entity.setCidade(vaga.getCidade());
				
				
				
				var vo = DozerConverter.parseObject(repository.save(entity), Vaga.class);
				return vo;
			}

			
			
}



	