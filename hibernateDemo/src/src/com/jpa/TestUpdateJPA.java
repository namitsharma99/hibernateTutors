package src.com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdateJPA {

	public static void main(String[] args) {
		// update Employee record
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_DEMO");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = entityManager.find(Employee.class, 1);
		System.out.println("BEFORE UPDATE : " + employee);
		employee.setSalary(10000000);
		entityManager.getTransaction().commit();
		employee = entityManager.find(Employee.class, 1);
		System.out.println("AFTER UPDATE : " + employee);
		entityManager.close();
		entityManagerFactory.close();
	}

}
