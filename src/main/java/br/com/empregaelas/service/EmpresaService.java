package br.com.empregaelas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empregaelas.adapter.DozerConverter;
import br.com.empregaelas.domain.entity.Empresa;
import br.com.empregaelas.exception.ResourceNotFoundException;
import br.com.empregaelas.repository.EmpresaRepository;


@Service
public class EmpresaService {

		
		@Autowired
		EmpresaRepository repository;
		
		
		public Empresa create( Empresa empresa) {
			var entity = DozerConverter.parseObject(empresa,Empresa.class);
			var vo = DozerConverter.parseObject(entity, Empresa.class);
		repository.save(empresa);
			return vo;
		}
		
	
		public List<Empresa>findAll(){
			return DozerConverter.parseListObject(repository.findAll(),Empresa.class);
		}
		
		public Empresa findById(Long id) {
			var entity = repository.findById(id)
			.orElseThrow(() -> 
			new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
			return DozerConverter.parseObject(entity, Empresa.class);
		}
		
		public void delete(Long id) {
			var entity = repository.findById(id)
			.orElseThrow(() -> 
			new ResourceNotFoundException("Não foi encontrado registro em esse Id"));
			repository.delete(entity);
		}
		
		 public Empresa update(Empresa empresa) {
			var entity = repository.findById(empresa.getId())
					.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro com esse Id"));
			
			
			
			entity.setCnpj(empresa.getCnpj()); 
		    entity.setRazaoSocial(empresa.getRazaoSocial());
			entity.setNomeFantasia(empresa.getNomeFantasia());
			entity.setTelefone(empresa.getTelefone());
			entity.setResponsavel(empresa.getResponsavel());
			entity.setSegmento(empresa.getSegmento());
			//entity.setNumFunc(empresa.getNumFunc());
		
			
		
			
			var vo = DozerConverter.parseObject(repository.save(entity), Empresa.class);
			return vo;
		}

		
		
		
	}





	
	
	
	
	
	
	
	
	
	
	
	
	

