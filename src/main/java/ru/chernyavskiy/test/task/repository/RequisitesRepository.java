package ru.chernyavskiy.test.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chernyavskiy.test.task.model.Requisites;

/**
 * Репозиторий для работы с сущностью {@link Requisites}
 */
@Repository
public interface RequisitesRepository extends JpaRepository<Requisites, Long> {
}
