package Jpashop5.domain5;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategoryItem5 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ITEM_ID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item5 item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category5 category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item5 getItem() {
        return item;
    }

    public void setItem(Item5 item) {
        this.item = item;
    }

    public Category5 getCategory() {
        return category;
    }

    public void setCategory(Category5 category) {
        this.category = category;
    }
}
