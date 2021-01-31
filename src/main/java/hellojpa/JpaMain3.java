//package hellojpa;
//
//import hellojpa.model.Member2;
//import hellojpa.model.Team;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class JpaMain3 {
//    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        entityTransaction.begin();
//
//        try {
//
//            Team team = new Team();
//            team.setTeamName("team1");
//            entityManager.persist(team);
//
//            Member2 member = new Member2();
//            member.setName("member1");
//            member.setTeam(team);
//
//            entityManager.persist(member);
//
//            // 영속성 컨텍스트에(1차캐시에) 저장된 member를 비우고 find하기 위해 플러시 후 클리어.
//            entityManager.flush();
//            entityManager.clear();
//
//            Member2 findMember = entityManager.find(Member2.class, 1L);
//
//            System.out.println(findMember.getTeam());
//
//
//            entityTransaction.commit();
//            } catch (Exception e) {
//                entityTransaction.rollback();
//            } finally {
//                entityManager.close();
//                entityManagerFactory.close();
//            }
//    }
//}
