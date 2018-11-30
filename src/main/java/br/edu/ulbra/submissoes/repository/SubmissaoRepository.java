package br.edu.ulbra.submissoes.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ulbra.submissoes.model.Submissao;

public interface SubmissaoRepository extends CrudRepository<Submissao, Long> {
	
	Submissao findById(long id);

}

