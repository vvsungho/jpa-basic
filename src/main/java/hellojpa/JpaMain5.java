package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain5 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            // 영속성 컨텍스트에(1차캐시에) 저장된 member를 비우고 find하기 위해 플러시 후 클리어.
//            entityManager.flush();
//            entityManager.clear();

            entityTransaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                entityTransaction.rollback();
            } finally {
                entityManager.close();
                entityManagerFactory.close();
            }
    }
}
