package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entities.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    @Mapping(source = "type", target = "type", resultType = PhoneType.class)
    Phone toModel(PhoneDTO phoneDTO);
}
