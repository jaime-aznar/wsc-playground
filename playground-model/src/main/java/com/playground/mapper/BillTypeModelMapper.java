package com.playground.mapper;

import com.playground.entity.BillType;
import com.playground.to.BillTypeTo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillTypeModelMapper {
    BillType toBillType(BillTypeTo billTypeTo);
    BillTypeTo toBillTypeTo(BillType billType);

    List<BillTypeTo> toListBillTypeTo(List<BillType> billTypeList);
}
