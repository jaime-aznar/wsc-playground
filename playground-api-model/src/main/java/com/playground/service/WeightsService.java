package com.playground.service;


import com.playground.to.WeightTo;

import java.util.List;

public interface WeightsService {
    public WeightTo saveWeight(WeightTo weight);
    public List<WeightTo> getWeights();
}
