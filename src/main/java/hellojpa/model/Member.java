//package hellojpa.model;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Member {
//
//    public Member(Long id, String name, String city, String street, String zipcode) {
//        this.id = id;
//        this.name = name;
//        this.city = city;
//        this.street = street;
//        this.zipcode = zipcode;
//    }
//
//    public Member() {
//
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "member_id")
//    private Long id;
//
//    private String name;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(String zipcode) {
//        this.zipcode = zipcode;
//    }
//
//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }
//
//    private String city;
//
//    private String street;
//
//    private String zipcode;
//
//    @OneToMany(mappedBy = "member")
//    private List<Order> orderList = new ArrayList<>();
//
//    /**
//     * 주 테이블: 주로 엑세스 (이용)하는 테이블
//     * 1대1 (주 테이블에 외래키가 있을 때) => member에서 memberEtcId를 가질 때
//     * 장점: 주 테이블만 조회해도 대상테이블에 데이터가 있는지 확인 가능
//     * 단점: 값이 없으면 외래키에 null허용.
//     *
//     * 1대1 (대상 테이블에 외래키가 있을 때) => memberEtc에서 memberId를 가질 때
//     * 장점: 주 테이블 대상과 테이블을 일대일에서 일대다 관계로 변경할 때 테이블 구조 유지.
//     * 단점: 프록시 기능 한계로 지연로딩으로 설정해도 항상 즉시 로딩됨.
//     */
//    @OneToOne
//    @JoinColumn(name = "member_etc_id")
//    private MemberEtc memberEtc;
//
//}
