package com.bioExtrack.controller;

import com.bioExtrack.mapper.BillsRestMapper;
import com.bioExtrack.service.BillsService;
import org.apache.coyote.Response;
import org.openapitools.api.BillsApi;
import org.openapitools.model.BillDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BillsController implements BillsApi {
    @Autowired
    BillsService billsService;
    @Autowired
    BillsRestMapper billsRestMapper;
    @Override
    public ResponseEntity<List<BillDto>> getBills() {
        return ResponseEntity.ok(billsRestMapper.toBillsDto(billsService.getBills()));
    }

    @Override
    public ResponseEntity<Void> postBill(BillDto billDto) {
        billsService.saveBill(billsRestMapper.toBillTo(billDto));
        return null;
    }
}
