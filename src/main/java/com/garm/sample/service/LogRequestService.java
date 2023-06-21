package com.garm.sample.service;

import com.garm.sample.dto.LogRequestDto;
import com.garm.sample.strategy.StrategyFactory;
import com.garm.sample.strategy.StrategyName;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LogRequestService {

    private static final String SPECIFIC_URL = "/api/grm/";
    private final StrategyFactory strategyFactory;

    public void log(LogRequestDto request) {
        strategyFactory.findStrategy(StrategyName.GENERAL_LOG_REQUEST_STRATEGY).log(request);

        if (request.getUrl().contains(SPECIFIC_URL)) {
            strategyFactory.findStrategy(StrategyName.SPECIFIC_LOG_REQUEST_STRATEGY).log(request);
        }
    }
}
