package br.edu.ulbra.submissoes.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ulbra.submissoes.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {
	Evento findById(long id);
}
