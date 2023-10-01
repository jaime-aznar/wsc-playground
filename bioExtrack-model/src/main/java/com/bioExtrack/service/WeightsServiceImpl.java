package com.bioExtrack.service;

import com.bioExtrack.entity.Weight;
import com.bioExtrack.to.WeightTo;
import com.bioExtrack.mapper.WeightModelMapper;
import com.bioExtrack.repository.WeightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class WeightsServiceImpl implements WeightsService {
    @Autowired
    WeightsRepository weightsRepository;

    @Autowired
    WeightModelMapper weightModelMapper;

    @Override
    public WeightTo saveWeight(WeightTo weightTo) {
        if(weightTo.getDate() == null){
            weightTo.setDate(LocalDate.now());
        }
        return weightModelMapper.toWeightTo(weightsRepository.save(weightModelMapper.toWeight(weightTo)));
    }

    @Override
    public List<WeightTo> getWeights() {
        return weightModelMapper.toWeightsTo(weightsRepository.findAll());

    }
}
