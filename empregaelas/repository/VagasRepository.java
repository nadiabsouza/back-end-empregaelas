package br.com.empregaelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.Vagas;



@Repository
public interface VagasRepository extends JpaRepository<Vagas, Long> {

	List<Vagas> findByNome(String nome);

}
