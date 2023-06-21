package com.garm.sample.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StrategyFactory {
    private Map<StrategyName, LogStrategy> strategies;

    @Autowired
    public StrategyFactory(Set<LogStrategy> strategySet) {
        createStrategy(strategySet);
    }

    public LogStrategy findStrategy(StrategyName strategyName) {
        return strategies.get(strategyName);
    }

    private void createStrategy(Set<LogStrategy> strategySet) {
        strategies = new HashMap<StrategyName, LogStrategy>();
        strategySet.forEach(strategy -> strategies.put(strategy.getStrategyName(), strategy));
    }
}