package edu.udea.main.service;

import edu.udea.main.model.Transaction;
import edu.udea.main.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public void createdTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }
}
