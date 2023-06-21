package com.garm.sample.service;

import com.garm.sample.dto.LogResponseDto;
import com.garm.sample.strategy.StrategyFactory;
import com.garm.sample.strategy.StrategyName;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LogResponseService {

    private static final String SPECIFIC_URL = "/api/grm/";
    private final StrategyFactory strategyFactory;

    public void log(LogResponseDto response) {
        strategyFactory.findStrategy(StrategyName.GENERAL_LOG_RESPONSE_STRATEGY).log(response);

        if (response.getUrl().contains(SPECIFIC_URL)) {
            strategyFactory.findStrategy(StrategyName.SPECIFIC_LOG_RESPONSE_STRATEGY).log(response);
        }
    }
}
