package com.gdsc.hexagonalexample.adapter.in.persistence.entity.repository;

import com.gdsc.hexagonalexample.adapter.in.persistence.entity.BankAccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountSpringBootRepository extends CrudRepository<BankAccountEntity, Long> {
}
