package com.gdsc.hexagonalexample.adapter.configuration;

import com.gdsc.hexagonalexample.HexagonalExampleApplication;
import com.gdsc.hexagonalexample.adapter.out.persistence.SaveAccountAdapter;
import com.gdsc.hexagonalexample.domain.port.out.persistence.SaveAccountPort;
import com.gdsc.hexagonalexample.domain.service.DepositUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalExampleApplication.class)
public class BeanConfiguration {

//    @Bean
//    DepositUseCaseImpl depositUseCase(){
//        return new DepositUseCaseImpl();
//    }
}
