package jpashop2.domain2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category2 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item2> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Category2 parent;

    @OneToMany(mappedBy = "parent")
    private List<Category2> child = new ArrayList<>();
}
