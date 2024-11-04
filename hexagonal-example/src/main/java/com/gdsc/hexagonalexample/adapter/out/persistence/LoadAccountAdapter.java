package com.gdsc.hexagonalexample.adapter.out.persistence;

import com.gdsc.hexagonalexample.adapter.in.persistence.entity.BankAccountEntity;
import com.gdsc.hexagonalexample.adapter.in.persistence.entity.repository.BankAccountSpringBootRepository;
import com.gdsc.hexagonalexample.adapter.in.persistence.mapper.BankAccountMapper;
import com.gdsc.hexagonalexample.domain.model.BankAccount;
import com.gdsc.hexagonalexample.domain.port.out.persistence.LoadAccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Repository
public class LoadAccountAdapter implements LoadAccountPort {
    private final BankAccountSpringBootRepository repository;
    private final BankAccountMapper bankAccountMapper;
    @Override
    public BankAccount execute(Long id) {
        BankAccountEntity entity = repository.findById(id)
                .orElseThrow(NoSuchElementException::new);
        return bankAccountMapper.toDomain(entity);
    }
}
