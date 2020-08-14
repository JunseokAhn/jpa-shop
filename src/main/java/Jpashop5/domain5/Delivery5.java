package Jpashop5.domain5;

import javax.persistence.*;

@Entity
public class Delivery5 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "delivery")
    private Order5 order;
    @Embedded
    private Address5 address;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private DeliveryStatus5 deliveryStatus;
}
