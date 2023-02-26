package dio.digitalinnovation.academiaDeGinastica.dto;

import java.time.LocalDateTime;

import dio.digitalinnovation.academiaDeGinastica.entities.Aluno;
import dio.digitalinnovation.academiaDeGinastica.entities.Matricula;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class MatriculaDto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Aluno aluno;
	private LocalDateTime dataDaMatricula;
	
	public MatriculaDto() {
		
	}
	
	public MatriculaDto(Matricula entity) {
		super();
		id = entity.getId();
		aluno = entity.getAluno();
		dataDaMatricula = entity.getDataDaMatricula();
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
	public LocalDateTime getDataDaMatricula() {
		return dataDaMatricula;
	}
	public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
		this.dataDaMatricula = dataDaMatricula;
	}
	
	

}
