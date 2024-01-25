package com.playground.mapper;

import com.playground.to.WeightTo;
import org.mapstruct.Mapper;
import org.openapitools.model.WeightDto;
import org.openapitools.model.WeightResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WeightsRestMapper {
    WeightResponse toWeightDto(WeightTo weight);
    WeightTo toWeightTo(WeightDto weightDto);

    List<WeightResponse>toWeightsDto(List<WeightTo> weights);
}
