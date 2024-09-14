package com.BankApp.repository;

import com.BankApp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findByAccountId(Long accountId);
}
