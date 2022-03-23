package ru.chernyavskiy.test.task.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.chernyavskiy.test.task.model.Cinema;
import ru.chernyavskiy.test.task.dto.CinemaDto;

/**
 * Класс маппера для преобразования {@link Cinema} в {@link CinemaDto} и обратно
 */
@Mapper
public interface CinemaMapper {

    CinemaMapper INSTANCE = Mappers.getMapper(CinemaMapper.class);

    CinemaDto map(Cinema source);
}
