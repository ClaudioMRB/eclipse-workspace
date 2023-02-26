package dio.digitalinnovation.academiaDeGinastica.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import dio.digitalinnovation.academiaDeGinastica.entities.Aluno;
import dio.digitalinnovation.academiaDeGinastica.entities.AvaliacaoFisica;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class AvaliacaoFisicaDto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Aluno aluno;
	private LocalDateTime dataDaAvalicao;
	private Double peso;
	private Double altura;
	
	public AvaliacaoFisicaDto() {
		
	}

	public AvaliacaoFisicaDto(AvaliacaoFisica entity) {
		
		id = entity.getId();
		aluno = entity.getAluno();
		dataDaAvalicao = entity.getDataDaAvalicao();
		peso = entity.getPeso();
		altura = entity.getAltura();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public LocalDateTime getDataDaAvalicao() {
		return dataDaAvalicao;
	}

	public void setDataDaAvalicao(LocalDateTime dataDaAvalicao) {
		this.dataDaAvalicao = dataDaAvalicao;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
	

}
