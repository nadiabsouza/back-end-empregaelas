package br.com.empregaelas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empregaelas.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// @Query("SELECT u FROM User u WHERE u.userName =:userName")
	User findByUserName(String userName);
}
