package dio.digitalinnovation.academiaDeGinastica.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_AvaliacaoFisica")
public class AvaliacaoFisica {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Aluno aluno;
	private LocalDateTime dataDaAvalicao;
	private Double peso;
	private Double altura;
	
	public AvaliacaoFisica() {
		
	}

	public AvaliacaoFisica(Long id, Aluno aluno, LocalDateTime dataDaAvalicao, Double peso, Double altura) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.dataDaAvalicao = dataDaAvalicao;
		this.peso = peso;
		this.altura = altura;
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
