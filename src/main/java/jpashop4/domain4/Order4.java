package jpashop4.domain4;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

@Entity
public class Order4 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member4 member;

    @OneToMany(mappedBy = "order", cascade = ALL)
    private List<OrderItem4> orderItems = new ArrayList<>();

    @OneToOne(mappedBy = "order", cascade = ALL)
    private Delivery4 delivery;

    private Date orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private OrderStatus4 orderStatus;

    public void addDelivery(Delivery4 delivery){
        this.delivery = delivery;
        delivery.setOrder(this);
    }
    public void addOrderItem(OrderItem4 orderItem){
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member4 getMember() {
        return member;
    }

    public void setMember(Member4 member) {
        this.member = member;
    }

    public List<OrderItem4> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem4> orderItems) {
        this.orderItems = orderItems;
    }

    public Delivery4 getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery4 delivery) {
        this.delivery = delivery;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus4 getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus4 orderStatus) {
        this.orderStatus = orderStatus;
    }
}
