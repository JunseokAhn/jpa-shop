package jpashop2.domain2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item2 {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category2> categories = new ArrayList<>();

}
