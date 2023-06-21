package com.garm.sample.strategy;

import com.garm.sample.dto.LogRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeneralLogRequestStrategy implements LogStrategy {

    @Override
    public void log(LogRequestDto request) {
        //put your logic ...
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.GENERAL_LOG_REQUEST_STRATEGY;
    }
}
