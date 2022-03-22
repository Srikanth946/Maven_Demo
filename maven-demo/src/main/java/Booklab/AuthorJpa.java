package Booklab;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorJpa {

	public static void main(String[] args) {
		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abc");
		EntityManager em = factory.createEntityManager();
		
		Author emp = new Author(101, "Sonu","ram","sr",50000);

		
		em.getTransaction().begin();
		
		em.persist(emp); 

		
		Author empData = em.find(Author.class, 101);
		
		em.getTransaction().commit();

		System.out.println(empData.toString());
		System.out.println("End");
		 
		
	}
}