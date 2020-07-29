package jpashop2.domain2;

import javax.persistence.*;

@Entity
public class Delivery2 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order2 order;
    private String city;
    private String street;
    private String zipcode;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private DeliveryStatus2 deliveryStatus;
}
