package com.bioExtrack.mapper;

import com.bioExtrack.entity.Bill;
import com.bioExtrack.to.BillTo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillModelMapper {
    List<BillTo> toBillsTo(List<Bill> billsList);
    BillTo toBillTo(Bill bill);
    Bill toBill(BillTo billTo);
}
