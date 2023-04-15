package com.ecommerce.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderZ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade= CascadeType.ALL)
   private Cart cart;
    @OneToOne(cascade= CascadeType.ALL)
    private Customer customer;
    @OneToMany(cascade= CascadeType.ALL)
    private AddressZ deliveryAddress;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private LocalDateTime orderDate = LocalDateTime.now();


}
