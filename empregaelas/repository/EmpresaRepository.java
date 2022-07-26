package br.com.empregaelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.Empresa;



@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	List<Empresa> findByNome(String nome);

}

