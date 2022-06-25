package br.com.testspringboot.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.testspringboot.model.Movimentacao;

@Repository
public interface MovimentacaoRepository extends CrudRepository<Movimentacao, Long>{
    List<Movimentacao> findByModeloContaining(String modelo);
}