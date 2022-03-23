package ru.chernyavskiy.test.task.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.chernyavskiy.test.task.dto.ResponseDto;
import ru.chernyavskiy.test.task.error.SeatNotFoundException;
import ru.chernyavskiy.test.task.model.Seat;
import ru.chernyavskiy.test.task.service.SeatService;

import java.util.Collection;

/**
 * Контроллер для приема и передачи на обработку запросов, связанных с сущностью {@link Seat}
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class SeatController {
    private final SeatService seatService;

    @GetMapping("{hallId}")
    public ResponseEntity<ResponseDto> getAll(Long hallId) throws SeatNotFoundException {
        log.debug("SeatController getAll() start handling request with hall id {}", hallId);
        return ResponseEntity.ok().body(seatService.getAllByHall(hallId));
    }

    @PutMapping("reserve/{reserve}")
    public ResponseEntity<ResponseDto> reserveSeats(@RequestBody Collection<Long> seatIds, Boolean reserve) {
        log.debug("SeatController reserveSeats() start handling request");
        return ResponseEntity.ok().body(seatService.reserveSeats(seatIds, reserve));
    }

}