package com.bioExtrack.service;

import com.bioExtrack.to.BillTypeTo;

import java.util.List;

public interface BillTypeService {
    BillTypeTo saveBillType(BillTypeTo billTypeTo);
    List<BillTypeTo> getBillTypes();
}
