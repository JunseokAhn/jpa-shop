package Jpashop5.domain5;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category5 {

    @Id
    @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<CategoryItem5> categoryItems;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category5 parent;

    @OneToMany(mappedBy = "parent")
    private List<Category5> child = new ArrayList<>();

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

    public List<CategoryItem5> getCategoryItems() {
        return categoryItems;
    }

    public void setCategoryItems(List<CategoryItem5> categoryItems) {
        this.categoryItems = categoryItems;
    }

    public Category5 getParent() {
        return parent;
    }

    public void setParent(Category5 parent) {
        this.parent = parent;
    }

    public List<Category5> getChild() {
        return child;
    }

    public void setChild(List<Category5> child) {
        this.child = child;
    }
}
