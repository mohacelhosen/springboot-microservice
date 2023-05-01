package com.mohacel.transaction.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SOURCE_TABLE")
public class SourceAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sourceId;
    private String senderName;
    private Double amount;

    public SourceAccount(String senderName, Double amount) {
        this.senderName = senderName;
        this.amount = amount;
    }

}
