package ru.chernyavskiy.test.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chernyavskiy.test.task.model.Cinema;


/**
 * Репозиторий для работы с сущностью {@link Cinema}
 */
@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
