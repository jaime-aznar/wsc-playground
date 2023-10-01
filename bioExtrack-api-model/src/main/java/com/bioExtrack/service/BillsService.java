package com.bioExtrack.service;

import com.bioExtrack.to.BillTo;

import java.util.List;

public interface BillsService {
    List<BillTo> getBills();
    BillTo saveBill(BillTo billTo);
}
