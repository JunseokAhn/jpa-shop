package jpashop4.domain4;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
public class Category4 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;
    private String name;

    @ManyToMany(fetch = LAZY)
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item4> items = new ArrayList<>();

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category4 parent;

    @OneToMany(mappedBy = "parent")
    private List<Category4> child = new ArrayList<>();

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

    public List<Item4> getItems() {
        return items;
    }

    public void setItems(List<Item4> items) {
        this.items = items;
    }

    public Category4 getParent() {
        return parent;
    }

    public void setParent(Category4 parent) {
        this.parent = parent;
    }

    public List<Category4> getChild() {
        return child;
    }

    public void setChild(List<Category4> child) {
        this.child = child;
    }
}
