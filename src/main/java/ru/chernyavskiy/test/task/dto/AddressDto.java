package ru.chernyavskiy.test.task.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.chernyavskiy.test.task.model.Address;

/**
 * Dto объект для сущности {@link Address}
 */
@Data
@NoArgsConstructor
public class AddressDto implements BaseDto {
    private Long id;
    private String legalAddress;
    private String actualAddress;
    private String postalAddress;

    @Builder
    public AddressDto(Long id, String legalAddress, String actualAddress, String postalAddress) {
        this.id = id;
        this.legalAddress = legalAddress;
        this.actualAddress = actualAddress;
        this.postalAddress = postalAddress;
    }
}
