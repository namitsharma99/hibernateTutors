package src.com.jpa.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJPAInheritance {

  public static void main(String[] args) {

    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_DEMO");
    EntityManager entitymanager = emfactory.createEntityManager();
    entitymanager.getTransaction().begin();
    // Teaching staff entity
    InheritTeachingStaff ts1 = new InheritTeachingStaff(1, "Gopal", "MSc MEd", "Maths");
    InheritTeachingStaff ts2 = new InheritTeachingStaff(2, "Manisha", "BSc BEd", "English");

    // Non-Teaching Staff entity
    InheritNonTeachingStaff nts1 = new InheritNonTeachingStaff(3, "Satish", "Accounts");
    InheritNonTeachingStaff nts2 = new InheritNonTeachingStaff(4, "Krishna", "Office Admin");

    // storing all entities
    entitymanager.persist(ts1);
    entitymanager.persist(ts2);
    entitymanager.persist(nts1);
    entitymanager.persist(nts2);

    entitymanager.getTransaction().commit();

    entitymanager.close();
    emfactory.close();
  }

}
