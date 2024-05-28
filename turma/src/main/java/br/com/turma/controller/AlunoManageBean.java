package br.com.turma.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.turma.model.Aluno;
import br.com.turma.service.AlunoService;

@ViewScoped
@ManagedBean(name = "AlunoMB")
public class AlunoManageBean {

	AlunoService service = new AlunoService();
	Aluno aluno = new Aluno();
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	public String salvar() {
		service.salvar(aluno);
		aluno = new Aluno();
		return "/Aluno/listaAluno.xhtml";
	}
	
	public String alterar() {
		service.alterar(aluno);
		aluno = new Aluno();
		return "/Aluno/listaAluno.xhtml";
	}
	
	public void buscarTodos() {
		alunos = service.buscarTodos();
	}
	public void buscarPorId() {
		aluno = service.buscarPorId(aluno.getId());
	}
	
	public String deletar(Aluno a) {
		service.deletar(a);
		buscarTodos();
		return null;
	}
	
	@PostConstruct
	public void inicio() {
		buscarTodos();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunoes() {
		return alunos;
	}

	public void setAlunoes(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	
	
	
	
}