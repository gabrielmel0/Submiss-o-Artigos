package br.edu.ulbra.submissoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.edu.ulbra.submissoes.model.Evento;
import br.edu.ulbra.submissoes.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@GetMapping("/evento")
	public ModelAndView listaEventos(Evento evento) {
		ModelAndView mv = new ModelAndView("evento/evento");
		Iterable<Evento> listaEventos = er.findAll();
		mv.addObject("evento", listaEventos);
		return mv;
	}
	
	@PostMapping("/evento")
	public String criaEvento(Evento evento) {
		er.save(evento);	
		return "redirect:/evento";
	}
	
			
	@GetMapping("/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("evento/detalhesEvento");
		Evento evento = er.findById(id);
		mv.addObject("evento", evento);
		return mv;
	}
	
	
	@PostMapping("/{id}")
	public String editaEvento(Evento evento) {
		er.save(evento);
		return "redirect:/evento";
	}
	
	
	
	@GetMapping("/evento/{id}/delete")
	public String excluiEvento(long id) {
		Evento evento = er.findById(id);
		er.delete(evento);
		return "redirect:/evento";
	}

}
