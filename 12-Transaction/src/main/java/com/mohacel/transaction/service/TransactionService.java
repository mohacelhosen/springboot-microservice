package com.mohacel.transaction.service;

import com.mohacel.transaction.entity.DestinationAccount;
import com.mohacel.transaction.entity.SourceAccount;
import com.mohacel.transaction.repository.DestinationRepository;
import com.mohacel.transaction.repository.SourceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {
    private SourceRepository source;
    private DestinationRepository destination;

    public TransactionService(SourceRepository source, DestinationRepository destination) {
        this.source = source;
        this.destination = destination;
    }

    @Transactional(rollbackFor = Exception.class)
    public void transfer(){
        double amount = 450.00;
        SourceAccount  sender = new SourceAccount("Mohacel",amount);
        DestinationAccount receiver = new DestinationAccount("Krystal", amount);


        source.save(sender);
        int CustomError = 5/0;
        destination.save(receiver);
        System.out.println("Transaction Successful ✅");
    }

}
