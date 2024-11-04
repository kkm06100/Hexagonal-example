package com.gdsc.hexagonalexample.domain.port.in;

import java.math.BigDecimal;

public interface WithDrawUseCase {
    boolean execute(Long id, BigDecimal balance);
}
