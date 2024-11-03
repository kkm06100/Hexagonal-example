package com.gdsc.hexagonalexample.domain.model;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * @apiNote 은행 계정, 외부를 향한 의존성이 없음
 *
 */
public class BankAccount {
    private Long id;
    private BigDecimal balance;

    @Builder
    public BankAccount(Long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * @return boolean
     */
    public boolean withdraw(BigDecimal amount) {
        if(balance.compareTo(amount) < 0) {
            return false;
        }

        balance = balance.subtract(amount);
        return true;
    }

    /**
     * @apiNote 입금
     */
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    /**
     * @apiNote 금액조회
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }
}
