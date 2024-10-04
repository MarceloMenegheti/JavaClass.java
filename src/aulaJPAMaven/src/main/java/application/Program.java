package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Marcelo Menegheti", "marcelo@gmail.com");
		Pessoa p2 = new Pessoa(null, "Kaku elos", "Kaku@gmail.com");
		Pessoa p3 = new Pessoa(null, "Luiz David", "Luiz@gmail.com");
		
		/*	EntityManager:
		 	Um objeto EntityManager encapsula uma conexão com a base de dados e serve
		 	para efetuar operações de acesso a dados (inserção, remoção, deleção, atualização) 
		 
		 	EntityManagerFactory:
		   	Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager
		*/
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();//com essa instanciação ja vou ter uma conecction com o DB
		
		//inserir no DB
		em.getTransaction().begin();	//iniciar um transação com DB
		em.persist(p1);		
		em.persist(p2);					//pega o obj e salva no DB
		em.persist(p3);
		em.getTransaction().commit();	//finalizar transação e confirmar as alterações
		
		System.out.println("Pronto!");


	}

}
