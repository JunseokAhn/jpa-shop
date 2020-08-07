package jpashop4.domain4;

import javax.persistence.*;

@Entity
public class Delivery4 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "ORDER_ID")
    private Order4 order;
    private String city;
    private String street;
    private String zipcode;

    @Enumerated
    @Column(name = "STATUS")
    private DeliveryStatus4 deliveryStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order4 getOrder() {
        return order;
    }

    public void setOrder(Order4 order) {
        this.order = order;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public DeliveryStatus4 getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus4 deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
