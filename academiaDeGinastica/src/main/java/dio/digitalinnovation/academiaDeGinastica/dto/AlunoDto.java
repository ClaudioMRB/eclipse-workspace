package dio.digitalinnovation.academiaDeGinastica.dto;

import java.time.LocalDate;

import dio.digitalinnovation.academiaDeGinastica.entities.Aluno;
import dio.digitalinnovation.academiaDeGinastica.entities.AvaliacaoFisica;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AlunoDto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column(unique = true)
	private String cpf;
	private String bairro;
	private LocalDate dataDeNascimento;
	private AvaliacaoFisica avaliacaoFisica;
	
	public AlunoDto() {
		
	}

	public AlunoDto(Aluno entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		bairro = entity.getBairro();
		dataDeNascimento = entity.getDataDeNascimento();
		avaliacaoFisica = entity.getAvaliacaoFisica();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public AvaliacaoFisica getAvaliacaoFisica() {
		return avaliacaoFisica;
	}

	public void setAvaliacaoFisica(AvaliacaoFisica avaliacaoFisica) {
		this.avaliacaoFisica = avaliacaoFisica;
	}

	

	

	
	
	

}
