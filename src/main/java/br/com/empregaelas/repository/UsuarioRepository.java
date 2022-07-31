package br.com.empregaelas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// @Query("SELECT u FROM User u WHERE u.userName =:userName")
	Usuario findByUserName(String userName);
}
