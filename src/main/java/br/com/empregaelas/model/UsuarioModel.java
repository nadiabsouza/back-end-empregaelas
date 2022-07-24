package br.com.empregaelas.model;


import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuario")

public class UsuarioModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String login;
    
    //Altera a visibilidade da senha
    @JsonIgnore
    private String senha;
    @JsonIgnore
    public String getSenha() {
		return null;
	}
    @JsonProperty
    public void setSenha(String senha) {
        this.senha = senha;
    }
	
}


