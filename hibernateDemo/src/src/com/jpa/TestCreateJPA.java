package src.com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCreateJPA {

	public static void main(String[] args) {
		// create Employee record
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_DEMO");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee emp = new Employee(1, "Ram Lal", 5500000, "B.Tech");
		emp = new Employee(2, "Shyam Lal", 6500000, "B.E.");
		entityManager.persist(emp);
		emp = new Employee(3, "Muneri Lal", 7500000, "B.E.");
    entityManager.persist(emp);
		emp = new Employee(4, "Bansi Lal", 8500000, "B.E.");
    entityManager.persist(emp);
		emp = new Employee(5, "Peela Lal", 9500000, "B.Tech");
    entityManager.persist(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}
}
