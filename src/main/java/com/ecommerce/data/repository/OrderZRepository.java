package com.ecommerce.data.repository;

import com.ecommerce.data.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderZRepository extends JpaRepository<Admin, Long> {
}
