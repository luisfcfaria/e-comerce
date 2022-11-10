package com.mindera.purchase.persistence.repository;

import com.mindera.purchase.persistence.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckOutRepository extends JpaRepository<Checkout,Long> {
}
