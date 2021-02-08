//package hellojpa.model;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Team {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "team_id")
//    private Long id;
//
//    private String teamName;
//
//    // 양방향 매핑 시 mappedBy 사용. 반대 테이블에서 사용한 변수명을 적어준다.
//    // 주인 (등록, 수정)이 아닌 곳에서 mappedBy를 지정. member가 주인. 주인이 아닌 곳에서 값을 등록, 수정해도 insert, update가 일어나지 않음.
//    // 관계향 테이블 상 외래키가 있는 곳(ManyToOne을 명시하는 테이블)에서 주인을 정하는 것이 중요. oneToMany인 곳에서 주인이되면 관리가 어려움(현재 테이블이 아닌 다른 테이블의 insert, update쿼리가 나감).
//    @OneToMany(mappedBy = "team")
//    private List<Member2> member2List = new ArrayList<>();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTeamName() {
//        return teamName;
//    }
//
//    public void setTeamName(String teamName) {
//        this.teamName = teamName;
//    }
//
//    public List<Member2> getMember2List() {
//        return member2List;
//    }
//
//    public void setMember2List(List<Member2> member2List) {
//        this.member2List = member2List;
//    }
//}
