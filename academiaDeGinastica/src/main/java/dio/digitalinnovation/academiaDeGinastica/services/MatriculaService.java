package dio.digitalinnovation.academiaDeGinastica.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dio.digitalinnovation.academiaDeGinastica.dto.MatriculaDto;
import dio.digitalinnovation.academiaDeGinastica.entities.Matricula;
import dio.digitalinnovation.academiaDeGinastica.exception.DatabaseException;
import dio.digitalinnovation.academiaDeGinastica.exception.ResourceNotFoundException;
import dio.digitalinnovation.academiaDeGinastica.repository.MatriculaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class MatriculaService {
	
	@Autowired
	private MatriculaRepository repository;
	
	

	@Transactional(readOnly = true) // Buscar por ID
	public MatriculaDto findById(Long id) {
		Optional<Matricula> result = repository.findById(id);
		Matricula ativ = result.orElseThrow(() -> new ResourceNotFoundException("Cliente inexistente"));
		MatriculaDto dto = new MatriculaDto(ativ);
		return dto;

	}

	@Transactional(readOnly = true) /* Busca paginada de clientes */
	public Page<MatriculaDto> findAll(Pageable pageable) {
		Page<Matricula> result = repository.findAll(pageable);
		return result.map(x -> new MatriculaDto(x));
	}

	@Transactional(readOnly = true) /* Inserção de novo cliente */
	public MatriculaDto Insert(MatriculaDto dto) {
		try {
			Matricula entity = new Matricula();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new MatriculaDto(entity);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Dados Inválidos");
		}
	}

	@Transactional /* Atualizar dados no banco */
	public MatriculaDto update(Long id, MatriculaDto dto) {
		try {
			Matricula entity = repository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new MatriculaDto(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Recurso não encontrado");

		}
	}

	@Transactional(propagation = Propagation.SUPPORTS) /* Deleção de cliente */
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Cliente inexistente");
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Falha de integridade referencial");
		}
	}

	/* método para reaproveitamento de códigos */
	private void copyDtoToEntity(MatriculaDto dto, Matricula entity) {
		entity.setAluno(dto.getAluno());
		entity.setDataDaMatricula(dto.getDataDaMatricula());
		
		
	}

}
