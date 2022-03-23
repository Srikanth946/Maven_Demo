package lab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistryBuilder;


public class Test {
	
		public static void main(String[] args) {
			Configuration config = new Configuration();
			//ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sessionFactory = config.configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			fullName f=new fullName();
			f.setFname("Ghattamaneni");
			f.setMname("Srikanth");
			f.setLname("Chowdary");
			
			Author a= new Author();
			a.setAuthorId(1);
			a.setName(f);
			session.save(a);
			Author emp= session.find(Author.class, 102);
			Author emp1=(Author)session.get(Author.class, 103);
			System.out.println(emp);
			System.out.println(emp1);
			
			transaction.commit();

		
	}
	

}
