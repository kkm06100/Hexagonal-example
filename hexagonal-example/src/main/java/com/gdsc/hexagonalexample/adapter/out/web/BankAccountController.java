package com.gdsc.hexagonalexample.adapter.out.web;

import com.gdsc.hexagonalexample.domain.port.in.DepositUseCase;
import com.gdsc.hexagonalexample.domain.port.in.WithDrawUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

@Controller
@RequiredArgsConstructor
public class BankAccountController {
    private final DepositUseCase depositUseCase;
    private final WithDrawUseCase withDrawUseCase;
    @PostMapping(value = "/{id}/deposit/{amount}")
    void deposit(@PathVariable final Long id,
                 @PathVariable final BigDecimal amount) {
        depositUseCase.execute(id, amount);
    }

    @PostMapping(value = "/{id}/withdraw/{amount}")
    void withdraw(@PathVariable final Long id,
                  @PathVariable final BigDecimal amount) {
        withDrawUseCase.execute(id, amount);
    }
}
