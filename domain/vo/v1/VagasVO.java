package br.com.empregaelas.domain.vo.v1;

import java.io.Serializable;
import com.github.dozermapper.core.Mapping; 
import java.util.Date;

import lombok.Data;

@Data
public class VagasVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Mapping("id")
	private int idVaga;
	private int idUsuario;
	private Boolean dataPublicacao;
	private String cargo;
	private String nivel;
	private String jornada;
	private Double salario;
	private String tipoContrato;
	private String modalidade;
	private String descricaoVaga;
	private String requisitos;
	private String desejavel;
	private String beneficios;
    private String uf;  
    private String cidade;
    private String bairro;
    private String cep;
    private Boolean exibirEmpresa;
    
    public String getIdVaga() {
		return idVaga;
	}
    public String getidUsuario() {
		return idUsuario;
	}
    
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public void setPublicada(Boolean publicada) {
		this.publicada = publicada;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public void setJornada(String jornada) {
		this.jornada = jornada;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public void setDesejavel(String desejavel) {
		this.desejavel = desejavel;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setExibirEmpresa(Boolean exibirEmpresa) {
		this.exibirEmpresa = exibirEmpresa;
	}
	
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idVaga,idUsuario,dataPublicacao,cargo,nivel,jornada,salario,tipoContrato,modalidade,descricaoVaga,requisitos,desejavel,beneficios,uf,cidade,bairro,cep,exibirEmpresa); 
	}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			VagasVO other = (VagasVO) obj;
			return Objects.equals(publicada, other.publicada) && Objects.equals(dataPublicacao, other.dataPublicacao) && Objects.equals(cargo, other.cargo)
					&& Objects.equals(nivel, other.nivel) && Objects.equals(jornada, other.jornada) && Objects.equals(salario, other.salario)
					&& Objects.equals(tipoContrato, other.tipoContrato) && Objects.equals(modalidade, other.modalidade) && Objects.equals(descricaoVaga, other.descricaoVaga)
					&& Objects.equals(requisitos, other.requisitos) && Objects.equals(desejavel, other.desejavel) && Objects.equals(beneficios, other.beneficios)
					&& Objects.equals(uf, other.uf) && Objects.equals(cidade, other.cidade) && Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
					&& Objects.equals(exibirEmpresa, other.exibirEmpresa); 
		
		
}
	}


