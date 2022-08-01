package br.com.empregaelas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> { 
	
	List<Vaga> findByPublicada(String publicada);
	
	
	//acrescentado por Edlane
	 @Query("SELECT c FROM ee_vaga c WHERE c.cargo=:cargo")
	 Page<Vaga> buscarPeloCargo(@Param("cargo") String cargo, Pageable pageable);
	 
	 @Query("SELECT t FROM ee_vaga t WHERE t.cidade=:tipo")
	 Page<Vaga> buscarPelaCidade(String cidade, Pageable pageable);
	 
	 @Query("SELECT m FROM ee_vaga m WHERE m.modalidade=:modalidade")
	 Page<Vaga> buscarPelaModalidade(String modalidade, Pageable pageable);
	 
	 @Query("SELECT t FROM ee_vaga t WHERE t.tipo_contrato=:tipo_contrato")
	 Page<Vaga> buscarPeloTipodeContrato(String tipo_contrato, Pageable pageable);
	
	
}

