package com.gdsc.hexagonalexample.adapter.in.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tbl_bankAccount")
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class BankAccountEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;
}
