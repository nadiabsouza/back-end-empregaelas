package br.com.empregaelas.domain.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import br.com.empregaelas.domain.entity.Candidato;
import lombok.Data;

@Data
public class CandidatoDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String nomeSocial;
	private String email;
	
	public CandidatoDTO(Candidato candidato) {
		this.id = candidato.getId();
		this.nome = candidato.getNome();
		this.nomeSocial = candidato.getNome_social();
		this.email = candidato.getEmail();
		}
	
		public static List<CandidatoDTO> converterLista(List<Candidato> candidatos) {
			return candidatos.stream().map(CandidatoDTO::new).collect(Collectors.toList());
		}

}
