package maven.demo.JPA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookMain {

	public static void main(String[] args) {

		System.out.println("Start");

		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		AuthorTable a = new AuthorTable(100, "Author A");
//		BookTable b = new BookTable("I23BN", "Book A", 200);
//		BookAuthorTable table = new BookAuthorTable(b,a);
		
		AuthorTable emp= new AuthorTable(1,"srikanth");
		session.save(emp); 
		transaction.commit();
		AuthorTable empData = session.get(AuthorTable.class, 2); // select
		System.out.println(empData.toString());
		System.out.println("End");

	}
}
