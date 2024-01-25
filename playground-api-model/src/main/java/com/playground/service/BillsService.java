package com.playground.service;

import com.playground.to.BillTo;

import java.util.List;

public interface BillsService {
    List<BillTo> getBills();
    BillTo saveBill(BillTo billTo);
}
