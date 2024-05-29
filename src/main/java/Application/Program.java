package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa (null, "Carlos Silva", "carlos.silva@email.com");
		Pessoa pessoa2 = new Pessoa (null, "Joaquim Torres", "joaquim.torres@email.com");
		Pessoa pessoa3 = new Pessoa (null, "Ana Maria", "ana.maria@email.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		/*
		 * Create Row (Objects)
		 * 
		em.persist(pessoa1);
		em.persist(pessoa2);
		em.persist(pessoa3);
		
		System.out.println("Pronto");
		*/
		
		//Consulta
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		//Remove 
		em.remove(p);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
