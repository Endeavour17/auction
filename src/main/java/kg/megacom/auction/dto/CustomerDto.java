package kg.megacom.auction.dto;

import lombok.Data;

import javax.validation.constraints.Max;

@Data
public class CustomerDto {
    private Long id;
    @Max(value = 15)
    private String phone;
}
