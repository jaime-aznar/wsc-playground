package com.bioExtrack.service;


import com.bioExtrack.to.WeightTo;

import java.util.List;

public interface WeightsService {
    public WeightTo saveWeight(WeightTo weight);
    public List<WeightTo> getWeights();
}
