package kg.megacom.auction.dto;

import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class LotDto {
    private Long id;
    @Size(min = 3, message = "Имя лота должно быть длиннее 3 символов")
    private String name;
    private Date startDate;
    @Future
    private Date endDate;
    @Positive
    private double minPrice;
    private double maxPrice;
    @Positive
    private double step;
    private LotStatusDto lotStatusDto;
}