package com.gdsc.hexagonalexample.adapter.out.persistence;

import com.gdsc.hexagonalexample.adapter.in.persistence.entity.BankAccountEntity;
import com.gdsc.hexagonalexample.adapter.in.persistence.entity.repository.BankAccountSpringBootRepository;
import com.gdsc.hexagonalexample.adapter.in.persistence.mapper.BankAccountMapper;
import com.gdsc.hexagonalexample.domain.model.BankAccount;
import com.gdsc.hexagonalexample.domain.port.out.persistence.SaveAccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class SaveAccountAdapter implements SaveAccountPort {
    private final BankAccountMapper bankAccountMapper;
    private final BankAccountSpringBootRepository repository;
    @Override
    public void execute(BankAccount bankAccount) {
        BankAccountEntity entity = bankAccountMapper.toEntity(bankAccount);
        repository.save(entity);
    }
}
