package ru.chernyavskiy.test.task.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chernyavskiy.test.task.model.Address;

/**
 * Репозиторий для работы с сущностью {@link Address}
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
