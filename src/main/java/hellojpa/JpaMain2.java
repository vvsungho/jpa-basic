package hellojpa;

import hellojpa.type.RoleType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
//            entityManager.persist(member);
            entityTransaction.commit();
            } catch (Exception e) {
                entityTransaction.rollback();
            } finally {
                entityManager.close();
                entityManagerFactory.close();
            }
    }
}
