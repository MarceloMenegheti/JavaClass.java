package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		
		/*	EntityManager:
		 	Um objeto EntityManager encapsula uma conexão com a base de dados e serve
		 	para efetuar operações de acesso a dados (inserção, remoção, deleção, atualização) 
		 
		 	EntityManagerFactory:
		   	Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager
		*/
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();//com essa instanciação ja vou ter uma conecction com o DB
		
		
		Pessoa p = em.find(Pessoa.class, 2); 	//um pessoa "recuperada" pelo metodo find()
		System.out.println(p);
		
		
		em.getTransaction().begin();
		em.remove(p);							//apenas consigo remover pq é um "obj monitorado" 	
		em.getTransaction().commit();
		 
		
		System.out.println("Pronto!");
		em.close();
		emf.close();

	}

}
