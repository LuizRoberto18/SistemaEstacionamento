package br.com.testspringboot.repository;

import java.util.List;

import br.com.testspringboot.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    List<Usuario> findByNomeContaining(String nome);
}