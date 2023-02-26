package dio.digitalinnovation.academiaDeGinastica.controllers;



import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import dio.digitalinnovation.academiaDeGinastica.dto.AlunoDto;
import dio.digitalinnovation.academiaDeGinastica.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoControllers {
	
	 @Autowired
	    private AlunoService service;
    @GetMapping(value = "/{id}") //Buscar por ID
    public ResponseEntity<AlunoDto> findById(@PathVariable Long id) {
        AlunoDto findbyid = service.findById(id);
        return ResponseEntity.ok(findbyid);
    }

    @GetMapping /*Busca paginada de clientes*/
    public ResponseEntity<Page<AlunoDto>> findAll(Pageable pageable) {
        Page<AlunoDto> findAllDto = service.findAll(pageable);
        return ResponseEntity.ok(findAllDto);

    }

    @PostMapping /*Inserção de novo cliente*/
    public ResponseEntity<AlunoDto> insert(@RequestBody AlunoDto insertDto) throws URISyntaxException {
        insertDto = service.Insert(insertDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(insertDto.getId()).toUri();
        return ResponseEntity.created(uri).body(insertDto);
    }

    @PutMapping(value = "/{id}") /*Atualizar dados*/
    public ResponseEntity<AlunoDto> update(@PathVariable Long id, @RequestBody AlunoDto updateDto) {
        updateDto = service.update(id, updateDto);
        return ResponseEntity.ok(updateDto);
    }

    @DeleteMapping(value = "/{id}") //Deletar dados no banco
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
