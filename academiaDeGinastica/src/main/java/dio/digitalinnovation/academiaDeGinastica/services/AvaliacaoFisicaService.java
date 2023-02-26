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

import dio.digitalinnovation.academiaDeGinastica.dto.AlunoDto;
import dio.digitalinnovation.academiaDeGinastica.dto.AvaliacaoFisicaDto;
import dio.digitalinnovation.academiaDeGinastica.entities.Aluno;
import dio.digitalinnovation.academiaDeGinastica.entities.AvaliacaoFisica;
import dio.digitalinnovation.academiaDeGinastica.exception.DatabaseException;
import dio.digitalinnovation.academiaDeGinastica.exception.ResourceNotFoundException;
import dio.digitalinnovation.academiaDeGinastica.repository.AvaliacaoFisicaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AvaliacaoFisicaService {
	
	@Autowired
	private AvaliacaoFisicaRepository repository;
	
	

	@Transactional(readOnly = true) // Buscar por ID
	public AvaliacaoFisicaDto findById(Long id) {
		Optional<AvaliacaoFisica> result = repository.findById(id);
		AvaliacaoFisica ativ = result.orElseThrow(() -> new ResourceNotFoundException("Cliente inexistente"));
		AvaliacaoFisicaDto dto = new AvaliacaoFisicaDto(ativ);
		return dto;

	}

	@Transactional(readOnly = true) /* Busca paginada de clientes */
	public Page<AvaliacaoFisicaDto> findAll(Pageable pageable) {
		Page<AvaliacaoFisica> result = repository.findAll(pageable);
		return result.map(x -> new AvaliacaoFisicaDto(x));
	}

	@Transactional(readOnly = true) /* Inserção de novo cliente */
	public AvaliacaoFisicaDto Insert(AvaliacaoFisicaDto dto) {
		try {
			AvaliacaoFisica entity = new AvaliacaoFisica();
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new AvaliacaoFisicaDto(entity);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Dados Inválidos");
		}
	}

	@Transactional /* Atualizar dados no banco */
	public AvaliacaoFisicaDto update(Long id, AvaliacaoFisicaDto dto) {
		try {
			AvaliacaoFisica entity = repository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new AvaliacaoFisicaDto(entity);
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
	private void copyDtoToEntity(AvaliacaoFisicaDto dto, AvaliacaoFisica entity) {
		entity.setAluno(dto.getAluno());
		entity.setAltura(dto.getAltura());
		entity.setDataDaAvalicao(dto.getDataDaAvalicao());
		entity.setPeso(dto.getPeso());
		
	}

	

}
