package com.mohacel.transaction.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "DESTINATION_TABLE")
public class DestinationAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer destinationId;
    private String receiverName;
    private Double amount;

    public DestinationAccount(String receiverName, Double amount) {
        this.receiverName = receiverName;
        this.amount = amount;
    }
}
