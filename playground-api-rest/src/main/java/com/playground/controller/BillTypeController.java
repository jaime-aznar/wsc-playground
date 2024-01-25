package com.playground.controller;

import com.playground.mapper.BillTypeRestMapper;
import com.playground.service.BillTypeService;
import org.openapitools.api.BillTypeApi;
import org.openapitools.model.BillTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BillTypeController implements BillTypeApi {

    @Autowired
    BillTypeService billTypeService;

    @Autowired
    BillTypeRestMapper billTypeRestMapper;
    @Override
    public ResponseEntity<List<BillTypeDto>> getBillTypes() {
        return ResponseEntity.ok(billTypeRestMapper.toBillTypeListDto(billTypeService.getBillTypes()));
    }

    @Override
    public ResponseEntity<BillTypeDto> postBillType(BillTypeDto billTypeDto) {
        return ResponseEntity.ok(billTypeRestMapper.toBillTypeDto(billTypeService.saveBillType(billTypeRestMapper.toBillTypeTo(billTypeDto))));
    }
}
