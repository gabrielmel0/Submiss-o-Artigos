package br.edu.ulbra.submissoes.input;

import java.sql.Date;

import javax.persistence.Column;

public class EventoInput {
	
	 private Long id;
	 private String usuario;
	 private String nome;
	 private Date data;
	 private Date abertura;
	 private Date fechamento;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getAbertura() {
		return abertura;
	}
	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}
	public Date getFechamento() {
		return fechamento;
	}
	public void setFechamento(Date fechamento) {
		this.fechamento = fechamento;
	}
	 
	 

}
