//package hellojpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class JpaMain {
//
//    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        entityTransaction.begin();
//
//        /**
//         * Insert
//         */
////            try {
////                Member member = new Member();
//////                member.setId(1L);
////                member.setName("윤성호2");
////                member.setRoleType(RoleType.ADMIN);
////                entityManager.persist(member);
////
////                entityTransaction.commit();
////            } catch (Exception e) {
////                entityTransaction.rollback();
////            } finally {
////                entityManager.close();
////                entityManagerFactory.close();
////            }
//
//        /**
//         * Select
//         */
////        try {
////            Member findMember = entityManager.find(Member.class, 1L);
////            System.out.println("Member ID: " + findMember.getId());
////            System.out.println("Member Name: " + findMember.getName());
////
////            entityTransaction.commit();
////        } catch (Exception e) {
////            entityTransaction.rollback();
////        } finally {
////            entityManager.close();
////            entityManagerFactory.close();
////        }
//
//        /**
//         * Select All
//         */
////        try {
////
//////            List<Member> memberList = entityManager.createQuery("select m from Member as m", Member.class).getResultList();
////            List<Member> memberList = entityManager
////                    .createQuery("select m from Member as m", Member.class)
////                    .setFirstResult(0)
////                    .setMaxResults(10)
////                    .getResultList();
////            System.out.println("memberList Size: " + memberList.size());
////
////            memberList.forEach(member -> {
////                System.out.println("Member ID: " + member.getId());
////                System.out.println("Member Name: " + member.getName());
////            });
////
////            entityTransaction.commit();
////        } catch (Exception e) {
////            entityTransaction.rollback();
////        } finally {
////            entityManager.close();
////            entityManagerFactory.close();
////        }
//
//        /**
//         * Update
//         */
////        try {
////            Member findMember = entityManager.find(Member.class, 1L);
////            findMember.setName("Update 윤성호");
////
////            entityTransaction.commit();
////        } catch (Exception e) {
////            entityTransaction.rollback();
////        } finally {
////            entityManager.close();
////            entityManagerFactory.close();
////        }
//
//
//
//
//    }
//}
