package dio.digitalinnovation.academiaDeGinastica.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column(unique = true)
	private String cpf;
	private String bairro;
	private LocalDate dataDeNascimento;
	private AvaliacaoFisica avaliacaoFisica;
	
	
	
	public Aluno() {
		
	}



	public Aluno(long id, String name, String cpf, String bairro, LocalDate dataDeNascimento,
			AvaliacaoFisica avaliacaoFisica) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.bairro = bairro;
		this.dataDeNascimento = dataDeNascimento;
		this.avaliacaoFisica = avaliacaoFisica;
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
