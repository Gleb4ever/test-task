package ru.chernyavskiy.test.task.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.chernyavskiy.test.task.dto.AddressDto;
import ru.chernyavskiy.test.task.model.Address;

/**
 * Класс маппера для преобразования {@link Address} в {@link AddressDto} и обратно
 */
@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDto map(Address address);
}
