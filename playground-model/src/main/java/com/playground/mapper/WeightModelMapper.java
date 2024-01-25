package com.playground.mapper;

import com.playground.to.WeightTo;
import com.playground.entity.Weight;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WeightModelMapper {
    Weight toWeight(WeightTo weightTo);
    WeightTo toWeightTo(Weight weight);
    List<WeightTo>toWeightsTo(List<Weight> weights);
}
