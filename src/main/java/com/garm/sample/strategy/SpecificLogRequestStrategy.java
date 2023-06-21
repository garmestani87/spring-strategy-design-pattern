package com.garm.sample.strategy;

import com.garm.sample.dto.LogResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecificLogRequestStrategy implements LogStrategy {

    @Override
    public void log(LogResponseDto request) {
        // put your logic ...
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.SPECIFIC_LOG_REQUEST_STRATEGY;
    }

}
