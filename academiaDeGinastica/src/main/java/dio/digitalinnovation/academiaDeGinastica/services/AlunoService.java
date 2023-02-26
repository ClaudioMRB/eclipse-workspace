package dio.digitalinnovation.academiaDeGinastica.services;

import jakarta.persistence.EntityNotFoundException;

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
import dio.digitalinnovation.academiaDeGinastica.entities.Aluno;
import dio.digitalinnovation.academiaDeGinastica.exception.DatabaseException;
import dio.digitalinnovation.academiaDeGinastica.exception.ResourceNotFoundException;
import dio.digitalinnovation.academiaDeGinastica.repository.AlunoRepository;


@Service
public class AlunoService {
	
	@Autowired
    private AlunoRepository repository;
	
	@Transactional(readOnly = true) //Buscar por ID
    public AlunoDto findById(Long id) {
        Optional<Aluno> result = repository.findById(id);
        Aluno ativ = result.orElseThrow(() -> new ResourceNotFoundException("Cliente inexistente"));
        AlunoDto dto = new AlunoDto(ativ);
        return dto;

    }
	
	@Transactional(readOnly = true) /*Busca paginada de clientes*/
    public Page<AlunoDto> findAll(Pageable pageable) {
        Page<Aluno> result = repository.findAll(pageable);
        return result.map(x -> new AlunoDto(x));
    }

    @Transactional(readOnly = true) /*Inserção de novo cliente*/
    public AlunoDto Insert(AlunoDto dto) {
        try {
            Aluno entity = new Aluno();
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new AlunoDto(entity);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Dados Inválidos");
        }
    }

    @Transactional /*Atualizar dados no banco*/
    public AlunoDto update(Long id, AlunoDto dto) {
        try {
            Aluno entity = repository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new AlunoDto(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Recurso não encontrado");

        }
    }

    @Transactional(propagation = Propagation.SUPPORTS) /*Deleção de cliente*/
    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Cliente inexistente");
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Falha de integridade referencial");
        }
    }


    /*método para reaproveitamento de códigos*/
    private void copyDtoToEntity(AlunoDto dto, Aluno entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setBairro(dto.getBairro());
        entity.setDataDeNascimento(dto.getDataDeNascimento());
        entity.setAvaliacaoFisica(dto.getAvaliacaoFisica());
    }
	

}
