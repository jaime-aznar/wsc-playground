package com.bioExtrack.mapper;

import com.bioExtrack.to.BillTo;
import org.mapstruct.Mapper;
import org.openapitools.model.BillDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillsRestMapper {
    List<BillDto> toBillsDto(List<BillTo> billToList);
    BillDto toBillDto(BillTo billTo);

    BillTo toBillTo(BillDto billDto);

}
