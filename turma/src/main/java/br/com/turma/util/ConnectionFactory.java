package br.com.turma.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

private static EntityManagerFactory factory = null;
	
	static {
		if(factory ==null){
			factory = Persistence.createEntityManagerFactory("turma");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
