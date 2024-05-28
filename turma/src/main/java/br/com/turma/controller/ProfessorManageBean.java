package br.com.turma.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.turma.model.Professor;
import br.com.turma.service.ProfessorService;

@ViewScoped
@ManagedBean(name = "ProfessorMB")
public class ProfessorManageBean {

	ProfessorService service = new ProfessorService();
	Professor professor = new Professor();
	List<Professor> professores = new ArrayList<Professor>();
	
	
	public String salvar() {
		service.salvar(professor);
		professor = new Professor();
		return "/Professor/listarProfessor.xhtml";
	}
	
	public String alterar() {
		service.alterar(professor);
		professor = new Professor();
		return "/Professor/listarProfessor.xhtml";
	}
	
	public void buscarTodos() {
		professores = service.buscarTodos();
	}
	public void buscarPorId() {
		professor = service.buscarPorId(professor.getId());
	}
	
	public String deletar(Professor p) {
		service.deletar(p);
		buscarTodos();
		return null;
	}
	
	@PostConstruct
	public void inicio() {
		buscarTodos();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
	
	
	
	
	
}
