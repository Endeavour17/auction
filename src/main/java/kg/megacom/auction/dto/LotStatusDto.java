package kg.megacom.auction.dto;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class LotStatusDto {
    private Long id;
    @Size(min = 3, message = "Имя статуса лота должно быть длиннее 3 символов")
    private String name;
}
