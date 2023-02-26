package dio.digitalinnovation.academiaDeGinastica.entities;

import java.time.LocalDateTime;

/*import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;*/

//@Entity
//@Table(name = "tb_Matricula")
public class Matricula {

	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Aluno aluno;
	private LocalDateTime dataDaMatricula;

	public Matricula() {

	}

	public Matricula(Long id, Aluno aluno, LocalDateTime dataDaMatricula) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.dataDaMatricula = dataDaMatricula;
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
