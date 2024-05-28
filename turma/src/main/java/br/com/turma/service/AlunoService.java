package br.com.turma.service;

import java.util.List;

import br.com.turma.DAO.GenericDAO;
import br.com.turma.model.Aluno;

public class AlunoService {

		private GenericDAO<Aluno> dao = new GenericDAO<Aluno>();
		 
		public void salvar(Aluno aluno) {
			dao.salvar(aluno);
		}
			public void alterar(Aluno aluno) {
			dao.alterar(aluno);
		}
		public void deletar(Aluno aluno) {
			dao.deletar(Aluno.class, aluno.getId() );
		}
		public Aluno buscarPorId(int id) {
			return dao.buscarPorId(Aluno.class, id);
			}
		
		public List<Aluno> buscarTodos(){
			String jpql = "SELECT c FROM Aluno c ORDER BY c.descricao";
			return dao.buscarTodos(jpql);
		}
	
}
