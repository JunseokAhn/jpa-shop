package jpashop3.domain3;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order3 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @OneToMany(mappedBy = "order")
    private List<OrderItem3> orderItems = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member3 member;

    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery3 delivery;

    private Date orderDate;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatus3 orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem3> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem3> orderItems) {
        this.orderItems = orderItems;
    }

    public Member3 getMember() {
        return member;
    }

    public void setMember(Member3 member) {
        this.member = member;
    }

    public Delivery3 getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery3 delivery) {
        this.delivery = delivery;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus3 getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus3 orderStatus) {
        this.orderStatus = orderStatus;
    }
}
