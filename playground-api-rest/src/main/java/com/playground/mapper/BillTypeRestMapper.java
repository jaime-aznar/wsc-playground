package com.playground.mapper;

import com.playground.to.BillTypeTo;
import org.mapstruct.Mapper;
import org.openapitools.model.BillTypeDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillTypeRestMapper {

    BillTypeDto toBillTypeDto(BillTypeTo billTypeTo);
    BillTypeTo toBillTypeTo(BillTypeDto billTypeDto);

    List<BillTypeDto> toBillTypeListDto(List<BillTypeTo> billTypeToList);
}
