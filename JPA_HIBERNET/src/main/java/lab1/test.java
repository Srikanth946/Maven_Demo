package lab1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		//ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		authorTable author=new authorTable();
		bookTable book=new bookTable();
		bookAuthorTable table=new bookAuthorTable();
		
		author.setID(123);
		author.setName("Srikanth");
		
		book.setISBN(12);
		book.setPrice(500);
		book.setTitle("How God died");
		table.setAuthor(author);
		table.setBook(book);
		session.save(table);
		transaction.commit();
		
		
		
	}

}
