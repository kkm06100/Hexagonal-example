package com.gdsc.hexagonalexample.adapter.in.persistence.mapper;

import com.gdsc.hexagonalexample.adapter.in.persistence.entity.BankAccountEntity;
import com.gdsc.hexagonalexample.domain.model.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper {
    public BankAccount toDomain(BankAccountEntity entity){
        return BankAccount.builder()
                .id(entity.getId())
                .balance(entity.getBalance())
                .build();
    }

    public BankAccountEntity toEntity(BankAccount domain){
        return BankAccountEntity.builder()
                .balance(domain.getBalance())
                .build();
    }
}
