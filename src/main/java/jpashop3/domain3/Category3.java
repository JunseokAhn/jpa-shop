package jpashop3.domain3;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category3 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item3> items;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Category3 parent;

    @OneToMany(mappedBy = "parent")
    private List<Category3> child;

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

    public List<Item3> getItems() {
        return items;
    }

    public void setItems(List<Item3> items) {
        this.items = items;
    }

    public Category3 getParent() {
        return parent;
    }

    public void setParent(Category3 parent) {
        this.parent = parent;
    }

    public List<Category3> getChild() {
        return child;
    }

    public void setChild(List<Category3> child) {
        this.child = child;
    }
}
