package br.com.empregaelas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
		
}
