package com.gdsc.hexagonalexample.domain.service;

import com.gdsc.hexagonalexample.domain.model.BankAccount;
import com.gdsc.hexagonalexample.domain.port.in.WithDrawUseCase;
import com.gdsc.hexagonalexample.domain.port.out.persistence.LoadAccountPort;
import com.gdsc.hexagonalexample.domain.port.out.persistence.SaveAccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class WriteDrawUseCaseImpl implements WithDrawUseCase {
    private final LoadAccountPort loadAccountPort;
    private final SaveAccountPort saveAccountPort;

    @Override
    public boolean execute(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.execute(id);

        boolean hasWithdrawn = account.withdraw(amount);

        if(hasWithdrawn){
            saveAccountPort.execute(account);
        }

        return hasWithdrawn;
    }
}
