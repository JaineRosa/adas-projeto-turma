package br.com.turma.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.turma.model.Turma;
import br.com.turma.service.TurmaService;

@ViewScoped
@ManagedBean(name= "TurmaMB")
public class TurmaManageBean {

	TurmaService service = new TurmaService();
	Turma turma = new Turma();
	List<Turma> turmas = new ArrayList<Turma>();
	
	public String salvar() {
		service.salvar(turma);
		turma = new Turma();
		return "/Turma/listarTurma.xhtml";
	}
	
	public String alterar() {
		service.alterar(turma);
		turma = new Turma();
		return "/Turma/listarTurma.xhtml";
	}
	
	public void buscarTodos() {
		turmas = service.buscarTodos();
	}
	
	public void buscarPorId() {
		turma = service.buscarPorId(turma.getId());
	}

	public String deletar(Turma t) {
		service.deletar(t);
		buscarTodos();
		return null;
	}
	
	//método executado ao carregar a controller no navegador
	@PostConstruct
	public void inicio() {
		buscarTodos();
	}


	//get e set
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
}
