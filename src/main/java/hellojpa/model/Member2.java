package hellojpa.model;

import javax.persistence.*;

@Entity
public class Member2 {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    /**
     * 단반향 매핑만으로도 이미 연관관꼐 매핑은 완료
     * 양방향 매핑은 반대 방향으로 조회 기능이 추가 된 것 뿐
     * JPQL에서 역방으로 탐색할 일이 많음.
     * 단방향 매핑을 잘하고 양방향은 필요할 때 추가 (mappend by)
     * many인 테이블에 (many to one)으로 다 거는 것이 좋고(?, 관리하기 편함, many가 주인으로, 외래키를 가지는 테이블을 주인으로!) 양방향이 필요하면 mappedBy 추가.
     */
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    // 순수 객체 상태를 고려해서 항상 양쪽에 값을 설정하게끔 해주어야함.
    // 1차캐시를 비우는 경우 team의 memberList를 호출하면 빈값인 상태 방지.
    // 연관관계 편의 메서드.
    // 반대쪽 테이블에도 데이터를 넣어주자(one to many인 곳도 데이터를 셋팅)
    public void setTeam(Team team) {
        this.team = team;
        team.getMember2List().add(this);
    }
}
