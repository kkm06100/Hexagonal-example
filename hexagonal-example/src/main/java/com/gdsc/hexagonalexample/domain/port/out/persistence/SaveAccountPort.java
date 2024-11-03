package com.gdsc.hexagonalexample.domain.port.out.persistence;

import com.gdsc.hexagonalexample.domain.model.BankAccount;

public interface SaveAccountPort {
    void execute(BankAccount bankAccount);
}
