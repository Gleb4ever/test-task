package ru.chernyavskiy.test.task.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.chernyavskiy.test.task.dto.RequisitesDto;
import ru.chernyavskiy.test.task.model.Requisites;

/**
 * Класс маппера для преобразования {@link Requisites} в {@link RequisitesDto} и обратно
 */
@Mapper
public interface RequisitesMapper {

    RequisitesMapper INSTANCE = Mappers.getMapper(RequisitesMapper.class);

    RequisitesDto map(Requisites source);
}
