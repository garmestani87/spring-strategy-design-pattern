package com.garm.sample.strategy;

import com.garm.sample.dto.LogResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneralLogResponseStrategy implements LogStrategy {

    @Override
    public void log(LogResponseDto response) {
        //put your logic ...
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.GENERAL_LOG_RESPONSE_STRATEGY;
    }
}
