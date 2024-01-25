package com.playground.service;

import com.playground.mapper.BillTypeModelMapper;
import com.playground.repository.BillTypeRepository;
import com.playground.to.BillTypeTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillTypeServiceImpl implements BillTypeService{
    @Autowired
    BillTypeRepository billTypeRepository;
    @Autowired
    BillTypeModelMapper billTypeModelMapper;
    @Override
    public BillTypeTo saveBillType(BillTypeTo billTypeTo) {
        return billTypeModelMapper.toBillTypeTo(billTypeRepository.save(billTypeModelMapper.toBillType(billTypeTo)));
    }

    @Override
    public List<BillTypeTo> getBillTypes() {
        return billTypeModelMapper.toListBillTypeTo(billTypeRepository.findAll());
    }
}
