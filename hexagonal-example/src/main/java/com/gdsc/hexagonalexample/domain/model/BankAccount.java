package com.gdsc.hexagonalexample.domain.model;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * @apiNote 은행 계정, 외부를 향한 의존성이 없음
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
     * @apiNote
     * @return boolean
     */
    public boolean withdraw(BigDecimal amount) {
        if(balance.compareTo(amount) < 0) { // balance가 amount보다 작은 경우
            /*
            compareTo() Method
            -1: balance가 amount보다 작은 경우
            0: balance와 amount가 같은 경우
            1: balance가 amount보다 큰 경우
            */
            return false;
        }

        balance = balance.subtract(amount); // 돈 감소
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
