package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.lang.ref.PhantomReference;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;



}
