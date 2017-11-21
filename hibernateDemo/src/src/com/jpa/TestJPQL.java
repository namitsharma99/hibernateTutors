package src.com.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJPQL {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_DEMO");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    // JPQL
    Query query = entityManager.createQuery("Select UPPER(e.ename) from Employee e where e.salary < 7000000");
    List<String> list = query.getResultList();

    for (String e : list) {
      System.out.println("Employee NAME :" + e);
    }

    query = entityManager.createQuery("Select e from Employee e");
    List<Employee> emplist = query.getResultList();

    for (Employee e : emplist) {
      System.out.println("Employee :" + e);
    }

    // named queries
    query = entityManager.createNamedQuery("find employee by id");
    query.setParameter("id", 4);

    List<Employee> eList = query.getResultList();

    for (Employee e : eList) {
      System.out.print("Employee ID :" + e.getEid());
      System.out.println("\t Employee Name :" + e.getEname());
    }

    // native queries
    query = entityManager.createNativeQuery("Select * from EMPLOYEE", Employee.class);
    query.setParameter("id", 4);

    eList = query.getResultList();

    for (Employee e : eList) {
      System.out.print("Employee ID :" + e.getEid());
      System.out.println("\t Employee Name :" + e.getEname());
    }
    
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();

  }

}
