package ru.chernyavskiy.test.task.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.chernyavskiy.test.task.model.Hall;
import ru.chernyavskiy.test.task.dto.HallDto;

/**
 * Класс маппера для преобразования {@link Hall} в {@link HallDto} и обратно
 */
@Mapper
public interface HallMapper {

    HallMapper INSTANCE = Mappers.getMapper(HallMapper.class);

    HallDto map(Hall source);
}
