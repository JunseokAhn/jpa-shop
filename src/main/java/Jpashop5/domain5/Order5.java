package Jpashop5.domain5;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order5 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member5 member;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem5> orderItems = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery5 delivery;

    private Date orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private OrderStatus5 orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member5 getMember() {
        return member;
    }

    public void setMember(Member5 member) {
        this.member = member;
    }

    public List<OrderItem5> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem5> orderItems) {
        this.orderItems = orderItems;
    }

    public Delivery5 getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery5 delivery) {
        this.delivery = delivery;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus5 getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus5 orderStatus) {
        this.orderStatus = orderStatus;
    }
}
