package com.gdsc.hexagonalexample.domain.port.in;

import java.math.BigDecimal;

public interface WriteDrawUseCase {
    void execute(Long id, BigDecimal balance);
}
