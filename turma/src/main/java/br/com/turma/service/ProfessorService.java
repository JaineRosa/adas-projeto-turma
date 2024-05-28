package br.com.turma.service;

import java.util.List;

import br.com.turma.DAO.GenericDAO;
import br.com.turma.model.Professor;


public class ProfessorService {

	private GenericDAO<Professor> dao = new GenericDAO<Professor>();
		 
		public void salvar(Professor professor) {
			dao.salvar(professor);
		}
			public void alterar(Professor professor) {
			dao.alterar(professor);
		}
		public void deletar(Professor professor) {
			dao.deletar(Professor.class, professor.getId() );
		}
		public Professor buscarPorId(int id) {
			return dao.buscarPorId(Professor.class, id);
			}
		
		public List<Professor> buscarTodos(){
			String jpql = "SELECT c FROM Professor c ORDER BY c.descricao";
			return dao.buscarTodos(jpql);
		}
	
}
