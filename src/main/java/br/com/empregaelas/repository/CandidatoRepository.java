package br.com.empregaelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.Candidato;



@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

	List<Candidato> findByNome(String nome);

}
