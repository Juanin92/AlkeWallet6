package com.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int account_id;

    @Column(name = "balance")
    private double balance;

    @Column(name = "balance_foreign")
    private double balanceForeign;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}