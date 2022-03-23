package ru.chernyavskiy.test.task.error;

/**
 * Ошибка бронирования места по причине его занятости
 */
public class SeatAlreadyReservedException extends Exception {
    public SeatAlreadyReservedException(Long id) {
        super(String.join(" ", "Seat already reserved", String.valueOf(id)));
    }
}
