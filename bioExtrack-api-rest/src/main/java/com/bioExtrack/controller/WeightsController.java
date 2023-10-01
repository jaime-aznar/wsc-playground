package com.bioExtrack.controller;

import com.bioExtrack.service.WeightsService;
import com.bioExtrack.mapper.WeightsRestMapper;
import org.openapitools.api.WeightsApi;
import org.openapitools.model.WeightDto;
import org.openapitools.model.WeightResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class WeightsController implements WeightsApi {
    @Autowired
    WeightsService weightsService;

    @Autowired
    WeightsRestMapper weightsRestMapper;


    @Override
    public ResponseEntity<List<WeightResponse>> getWeights() {
        return ResponseEntity.ok(weightsRestMapper.toWeightsDto(weightsService.getWeights()));
    }

    @Override
    public ResponseEntity<WeightResponse> postWeight(WeightDto weightDto) {
        return ResponseEntity.ok(weightsRestMapper.toWeightDto(weightsService.saveWeight(weightsRestMapper.toWeightTo(weightDto))));
    }
}
