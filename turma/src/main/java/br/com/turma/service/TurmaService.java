package br.com.turma.service;

import java.util.List;

import br.com.turma.DAO.GenericDAO;
import br.com.turma.model.Turma;



public class TurmaService {

	private GenericDAO<Turma> dao = new GenericDAO<Turma>();
	 
	public void salvar(Turma turma) {
		dao.salvar(turma);
	}
		public void alterar(Turma turma) {
		dao.alterar(turma);
	}
	public void deletar(Turma turma) {
		dao.deletar(Turma.class, turma.getId() );
	}
	public Turma buscarPorId(int id) {
		return dao.buscarPorId(Turma.class, id);
		}
	
	public List<Turma> buscarTodos(){
		String jpql = "SELECT c FROM Turma c ORDER BY c.descricao";
		return dao.buscarTodos(jpql);
	}
	
} 
