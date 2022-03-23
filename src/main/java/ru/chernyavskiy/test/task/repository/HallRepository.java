package ru.chernyavskiy.test.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chernyavskiy.test.task.model.Hall;

/**
 * Репозиторий для работы с сущностью {@link Hall}
 */
@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {
}
