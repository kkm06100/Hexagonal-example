package com.gdsc.hexagonalexample.domain.service;

import com.gdsc.hexagonalexample.domain.model.BankAccount;
import com.gdsc.hexagonalexample.domain.port.in.DepositUseCase;
import com.gdsc.hexagonalexample.domain.port.out.persistence.LoadAccountPort;
import com.gdsc.hexagonalexample.domain.port.out.persistence.SaveAccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class DepositUseCaseImpl implements DepositUseCase {
    private final LoadAccountPort loadAccountPort;
    private final SaveAccountPort saveAccountPort;

    @Override
    public void execute(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.execute(id);

        account.deposit(amount);
        saveAccountPort.execute(account);
    }
}
