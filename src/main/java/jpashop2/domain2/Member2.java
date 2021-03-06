package jpashop2.domain2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member2 {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String zipcode;
    @OneToMany(mappedBy = "member")
    private List<Order2> orders = new ArrayList<>();

}
