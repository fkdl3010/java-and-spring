package jpabook.jpashop.domain;

import static javax.persistence.FetchType.LAZY;
import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity{

    @Id@GeneratedValue
    private Long id;

    @Embedded
    private Address address;
    @Column(name = "STATUS")
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;
}
