package com.gdsc.hexagonalexample.domain.port.in;

import java.math.BigDecimal;

/**
 * @apiNote DepositService에서 사용할 기능을 정의한다.
 */
public interface DepositUseCase {
    void execute(Long id, BigDecimal balance);
}
