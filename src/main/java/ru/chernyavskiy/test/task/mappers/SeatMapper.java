package ru.chernyavskiy.test.task.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ru.chernyavskiy.test.task.dto.SeatDto;
import ru.chernyavskiy.test.task.model.Seat;

/**
 * Класс маппера для преобразования {@link Seat} в {@link SeatDto} и обратно
 */
@Mapper
public interface SeatMapper {

    SeatMapper INSTANCE = Mappers.getMapper(SeatMapper.class);

    @Mappings({
            @Mapping(source = "seatType", target = "type"),
            @Mapping(source = "seatRow", target = "row"),
            @Mapping(source = "seatNumber", target = "number")
    })
    SeatDto map(Seat source);
}
