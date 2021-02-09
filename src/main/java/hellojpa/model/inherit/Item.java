package hellojpa.model.inherit;

import javax.persistence.*;

@Entity
@DiscriminatorColumn
// 상속 매핑, 조인 전략 => Item, Album, Book, Movie 테이블 모두 Item 테이블을 상속받아 생성됨.
// Item table의 DiscriminatorColumn으로 타입 구분. 자동 이넘 생성
// 추천
// @Inheritance(strategy = InheritanceType.JOINED)
// public class Item {

// Item테이블 하나에  Album, Book, Movie 데이터 모두 생성. 하나의 테이블에 모두 데이터가 추가됨.
// SINGLE 전략은 @DiscriminatorColumn를 생략해도 자동으로 D_Type이 들어감.
// Album, Book, Movie에 set 및 save 해도 Item에 save되고 D_Type으로 구분됨.
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//public class Item {


// Item 테이블이 생성되지 않고 Album, Book, Movie 객체 모두 Item 테이블을 상속받아 생성됨.
// 조인전략과 비슷하지만 Item 테이블이 안생기고 당연히 D_Type이 없다.
// insert할 때는 조인전략과 비슷하게 간단하게 되지만, Item으로 select할 때 Album, Book, Movie을 Union으로 조회한다. => Item 테이블이 생성되지 않기때문에 조인을 샤용할 수 없다.
// 비추천
// TABLE_PER_CLASS는 Item을 추상클레스로 만들어야 별도의 Item 테이블이 생성되지 않음.
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;

}
