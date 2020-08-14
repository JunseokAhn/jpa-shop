package Jpashop5.domain5;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member5 {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    @Embedded
    private Address5 address;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
    private List<Order5> orders = new ArrayList<>();

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

    public Address5 getAddress() {
        return address;
    }

    public void setAddress(Address5 address) {
        this.address = address;
    }

    public List<Order5> getOrders() {
        return orders;
    }

    public void setOrders(List<Order5> orders) {
        this.orders = orders;
    }
}
