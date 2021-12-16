package br.com.b3final.projeto.dao;

//criando uma interface
import org.springframework.data.repository.CrudRepository;

import br.com.b3final.projeto.model.Conta;

// extends amplia as características da classe que iremos colocar
public interface ContaDao extends CrudRepository<Conta,Integer>{

}
