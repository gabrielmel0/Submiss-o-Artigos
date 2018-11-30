package br.edu.ulbra.submissoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ulbra.submissoes.model.Submissao;
import br.edu.ulbra.submissoes.repository.SubmissaoRepository;

@Controller
public class SubmissaoController {
	
	@Autowired
	private SubmissaoRepository er;
	
		
	@GetMapping("/submissoes")
	public ModelAndView  listaSubmissoes() {
		ModelAndView mv = new ModelAndView("submissoes/listaSubmissoes");
		Iterable<Submissao> listaSubmissoes = er.findAll();
		mv.addObject("submissao", listaSubmissoes);
		return mv;
	}
	
	@GetMapping("submissoes/{id}")
	public ModelAndView detalhesSubmissoes(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("submissoes/detalhesSubmissoes");
		Submissao submissao = er.findById(id);
		mv.addObject("submissao", submissao);
		return mv;
	}
	
	@PostMapping("submissoes/{id}")
	public String editaEvento(Submissao submissao) {
		er.save(submissao);
		return "redirect:/submissoes";
	}
	
	
}
