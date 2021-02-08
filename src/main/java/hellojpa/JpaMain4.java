//package hellojpa;
//
//import hellojpa.model.*;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class JpaMain4 {
//    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        entityTransaction.begin();
//
//        try {
//            Item item = new Item();
//            entityManager.persist(item);
//
//            Order order = new Order();
//
//            OrderItem orderItem = new OrderItem();
//            orderItem.setCount(1);
//            orderItem.setItem(new Item());
//            orderItem.setItem(item);
//
//            entityManager.persist(orderItem);
//
//            order.setOrderItemList(orderItem);
//            entityManager.persist(order);
//
//            // 영속성 컨텍스트에(1차캐시에) 저장된 member를 비우고 find하기 위해 플러시 후 클리어.
////            entityManager.flush();
////            entityManager.clear();
//
//            entityTransaction.commit();
//            } catch (Exception e) {
//                e.printStackTrace();
//                entityTransaction.rollback();
//            } finally {
//                entityManager.close();
//                entityManagerFactory.close();
//            }
//    }
//}
