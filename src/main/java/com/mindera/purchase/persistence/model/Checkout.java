package com.mindera.purchase.persistence.model;

import javax.persistence.*;
import javax.websocket.Session;
import java.util.List;

@Entity
@Table
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String product;
    private Integer quantity;
    private Boolean isCheckOut;

    public Checkout() {
    }

    public Checkout(Long id, String product, Integer quantity, Boolean isCheckOut) {
        Id = id;
        this.product = product;
        this.quantity = quantity;
        this.isCheckOut = isCheckOut;
    }

    public Long getId() {
        return Id;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(Boolean checkOut) {
        isCheckOut = checkOut;
    }

}
