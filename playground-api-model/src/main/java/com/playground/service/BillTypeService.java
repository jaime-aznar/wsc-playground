package com.playground.service;

import com.playground.to.BillTypeTo;

import java.util.List;

public interface BillTypeService {
    BillTypeTo saveBillType(BillTypeTo billTypeTo);
    List<BillTypeTo> getBillTypes();
}
