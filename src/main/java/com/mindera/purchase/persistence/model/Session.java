package com.mindera.purchase.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionReference;
    @OneToMany
    private List<Checkout> purchases;

    public Session() {
    }

    public Session(Long sessionReference, List<Checkout> purchases) {
        this.sessionReference = sessionReference;
        this.purchases = purchases;
    }

    public Long getSessionReference() {
        return sessionReference;
    }

    public List<Checkout> getPurchases() {
        return purchases;
    }
}
