package com.ecommerce.data.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Entity
@RequiredArgsConstructor
public class Supplier {
    @Id
    private Long id;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierName;
    @NonNull
    @NotEmpty
    @NotBlank
    @OneToOne
    private AddressZ supplierAddress;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierEmailAddress;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierPassword;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierPhoneNumber;
    @OneToMany(cascade= CascadeType.ALL)
    private List<Product> productList;
    private boolean isLogin;
    private boolean isEnabled;
    private BigDecimal recievePaymentBalance;

}
