package com.playground.service;

import com.playground.mapper.BillModelMapper;
import com.playground.repository.BillsRepository;
import com.playground.to.BillTo;
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
