package com.bioExtrack.service;

import com.bioExtrack.mapper.BillModelMapper;
import com.bioExtrack.repository.BillsRepository;
import com.bioExtrack.to.BillTo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillsServiceImpl implements BillsService{

    @Autowired
    BillsRepository billsRepository;
    @Autowired
    BillModelMapper billModelMapper;
    @Override
    public List<BillTo> getBills() {
        return billModelMapper.toBillsTo(billsRepository.findAll());
    }

    @Override
    public BillTo saveBill(BillTo billTo){
        return billModelMapper.toBillTo(billsRepository.save(billModelMapper.toBill(billTo)));
    }
}
