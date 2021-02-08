//package hellojpa.model;
//
//import hellojpa.type.OrderStatus;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "ORDERS") // order가 db에서 예약어
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "order_id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    private LocalDateTime orderDate;
//
//    @Enumerated(EnumType.STRING)
//    private OrderStatus orderStatus;
//
//    @OneToMany(mappedBy = "order")
//    private List<OrderItem> orderItemList = new ArrayList<>();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
//
//    public LocalDateTime getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(LocalDateTime orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public OrderStatus getOrderStatus() {
//        return orderStatus;
//    }
//
//    public void setOrderStatus(OrderStatus orderStatus) {
//        this.orderStatus = orderStatus;
//    }
//
//    public List<OrderItem> getOrderItemList() {
//        return orderItemList;
//    }
//
//    // 양방향으로 걸어줌.
//    // order에 orderItem을 넣고 orderItem에 order를 넣어줌.
//    public void setOrderItemList(OrderItem orderItem) {
//        this.getOrderItemList().add(orderItem);
//        orderItem.setOrder(this);
//    }
//
//    public void addOrderItemList() {
//
//    }
//}
