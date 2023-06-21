package com.garm.sample.strategy;

import com.garm.sample.dto.LogRequestDto;
import com.garm.sample.dto.LogResponseDto;

public interface LogStrategy {
    default void log(LogRequestDto request) {
    }

    default void log(LogResponseDto response) {
    }

    StrategyName getStrategyName();
}
