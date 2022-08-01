package br.com.empregaelas.repository;

import java.util.List;
import org.springframework.stereotype.Repository;


import br.com.empregaelas.domain.entity.FormacaoAcademica;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FormacaoAcademicaRepository extends JpaRepository<FormacaoAcademica, Long> {
	List<FormacaoAcademica> findByFormacao(String formacao);

	
	

}


	
