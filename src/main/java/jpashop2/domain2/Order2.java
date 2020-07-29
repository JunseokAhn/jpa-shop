package jpashop2.domain2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity @Table(name = "ORDERS2")
public class Order2 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member2 member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem2> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery2 delivery;

    private Date orderDate;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatus2 orderStatus;

}
