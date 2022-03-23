package ru.chernyavskiy.test.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.chernyavskiy.test.task.model.Seat;

import java.util.List;

/**
 * Репозиторий для работы с сущностью {@link Seat}
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    String QUERY_GET_ALL = "select * from seat where hall_id = :hallId";

    @Query(value = QUERY_GET_ALL, nativeQuery = true)
    List<Seat> getAllByHall(Long hallId);

    Seat findById(long id);
}
