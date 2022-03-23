package ru.chernyavskiy.test.task.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.chernyavskiy.test.task.model.Seat;
import ru.chernyavskiy.test.task.model.SeatType;

/**
 * Dto объект для сущности {@link Seat}
 */
@Data
@NoArgsConstructor
public class SeatDto implements BaseDto {
    private Long id;
    private SeatType type;
    private Long row;
    private Long number;
    private Boolean vacant;

    @Builder
    public SeatDto(Long id, SeatType type, Long row, Long number, Boolean vacant) {
        this.id = id;
        this.type = type;
        this.row = row;
        this.number = number;
        this.vacant = vacant;
    }
}
