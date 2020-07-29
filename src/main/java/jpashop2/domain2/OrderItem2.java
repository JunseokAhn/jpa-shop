package jpashop2.domain2;

import javax.persistence.*;

@Entity
public class OrderItem2 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item2 item;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order2 order;

    private int orderPrice;
    private int count;
}
