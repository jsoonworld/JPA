package jpabook.jpashop.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.criteria.Order;
import lombok.Getter;
import jakarta.persistence.*;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.ArrayList;

import java.util.List;
@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
